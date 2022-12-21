package lab23.task01;

public class ArrayQueueADT {
    //Инвариант: front < elements.length && rear < elements.length && size <= elements.length

    private int size = 0;
    private int front = -1;
    private int rear = -1;
    private Object[] elements = new Object[0];

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    //Предусловие: element != null
    //Постуловие: elements[rear] = element,
    //            rear = (rear + 1) % elements.length,
    //            size = size + 1
    public static void enqueue(ArrayQueueADT queue, Object element) {
        boolean flag = queue.ensureCapacity(size(queue) + 1);
        Object[] elements = queue.getElements();
        if (queue.rear == -1) {
            queue.setFront(0);
            queue.setRear(0);
            queue.setSize(size(queue) + 1);
            queue.getElements()[queue.getRear()] = element;
            return;
        }
        if (flag && (queue.getRear() < queue.getFront())) {
            for(int i = 0; i < size(queue) - queue.getFront(); i++) {
                elements[elements.length - i - 1] = elements[size(queue) - i - 1];
            }
            queue.setFront(elements.length - size(queue) + queue.getFront());
        }
        queue.setSize(size(queue) + 1);
        queue.setRear((queue.getRear() + 1) % elements.length);
        elements[queue.getRear()] = element;
    }

    //Предусловие: size > 0
    //Постуловие: результат = elements[front],
    //            front = (front + 1) % elements.length,
    //            size = size - 1
    public static Object dequeue(ArrayQueueADT queue) {
        Object[] elements = queue.getElements();
        if (size(queue) == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object element = elements[queue.getFront()];
        elements[queue.getFront()] = null;
        queue.setFront((queue.getFront() + 1) % elements.length);
        queue.setSize(size(queue) - 1);
        return element;
    }

    //Постусловие: результат = size
    public static boolean isEmpty(ArrayQueueADT queue) {
        return size(queue) == 0;
    }

    //Постусловие: рузельтат = size
    public static int size(ArrayQueueADT queue) {
        return queue.getSize();
    }

    //Предусловие: size > 0
    //Постусловие: результат = elements[front]
    public static Object element(ArrayQueueADT queue) {
        if (size(queue) == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return queue.getElements()[queue.getFront()];
    }

    private boolean ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = java.util.Arrays.copyOf(elements, 2 * capacity);
            return true;
        }
        return false;
    }

    //Постуловие: size = 0, front = -1, rear = -1, elements = new Object[0]
    public static void clear(ArrayQueueADT queue) {
        queue.setFront(-1);
        queue.setRear(-1);
        queue.setSize(0);
        queue.setElements(new Object[0]);
    }

    public static void display(ArrayQueueADT queue) {
        Object[] elements = queue.getElements();
        System.out.println("front = " + queue.getFront() + ", rear = " + queue.getRear() + ", size = " + queue.getSize() + ", elements.length = " + elements.length);
        for (int i = 0; i < size(queue); i++) {
            System.out.print(elements[(queue.getFront() + i) % elements.length] + " ");
        }
        System.out.println();
    }
}
