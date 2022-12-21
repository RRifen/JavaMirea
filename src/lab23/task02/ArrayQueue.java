package lab23.task02;

public class ArrayQueue extends AbstractQueue implements Queueable {
    //Инвариант: front < elements.length && rear < elements.length && size <= elements.length
    private int size = 0;
    private int front = -1;
    private int rear = -1;
    private Object[] elements = new Object[0];

    //Предусловие: element != null
    //Постуловие: elements[rear] = element,
    //            rear = (rear + 1) % elements.length,
    //            size = size + 1
    public void enqueue(Object element) {
        boolean flag = ensureCapacity(size + 1);
        if (rear == -1) {
            front = 0;
            rear = 0;
            size++;
            elements[rear] = element;
            return;
        }
        if (flag && (rear < front)) {
            for(int i = 0; i < size - front; i++) {
                elements[elements.length - i - 1] = elements[size - i - 1];
            }
            front = elements.length - size + front;
        }
        size++;
        rear = (rear + 1) % elements.length;
        elements[rear] = element;
    }

    //Предусловие: size > 0
    //Постуловие: рузельтат = elements[front],
    //            front = (front + 1) % elements.length,
    //            size = size - 1
    public Object dequeue() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object element = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return element;
    }
    //Постусловие: результат = size
    public boolean isEmpty() {
        return size == 0;
    }

    //Постусловие: результат = size
    public int size() {
        return size;
    }

    //Предусловие: size > 0
    //Постусловие: результат = elements[front]
    public Object element() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[front];
    }

    private boolean ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = java.util.Arrays.copyOf(elements, 2 * capacity);
            return true;
        }
        return false;
    }

    //Постуловие: size = 0, front = -1, rear = -1, elements = new Object[0]
    public void clear() {
        front = -1;
        rear = -1;
        size = 0;
        elements = new Object[0];
    }

    public void display() {
        System.out.println("front = " + front + ", rear = " + rear + ", size = " + size + ", elements.length = " + elements.length);
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(front + i) % elements.length] + " ");
        }
        System.out.println();
    }
}
