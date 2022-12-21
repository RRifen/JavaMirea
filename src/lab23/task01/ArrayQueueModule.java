package lab23.task01;

public class ArrayQueueModule {
    //Инвариант: front < elements.length && rear < elements.length && size <= elements.length
    private static int size = 0;
    private static int front = -1;
    private static int rear = -1;
    private static Object[] elements = new Object[0];

    //Предусловие: element != null
    //Постуловие: elements[rear] = element,
    //            rear = (rear + 1) % elements.length,
    //            size = size + 1
    public static void enqueue(Object element) {
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
    //Постуловие: результат = elements[front],
    //            front = (front + 1) % elements.length,
    //            size = size - 1
    public static Object dequeue() {
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
    public static boolean isEmpty() {
        return size == 0;
    }

    //Постусловие: результат = size
    public static int size() {
        return size;
    }

    //Предусловие: size > 0
    //Постусловие: результат = elements[front]
    public static Object element() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return elements[front];
    }

    //Постуловие: size = 0, front = -1, rear = -1, elements = new Object[0]
    public static void clear() {
        front = -1;
        rear = -1;
        size = 0;
        elements = new Object[0];
    }

    private static boolean ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            elements = java.util.Arrays.copyOf(elements, 2 * capacity);
            return true;
        }
        return false;
    }


    public static void display() {
        System.out.println("front = " + front + ", rear = " + rear + ", size = " + size + ", elements.length = " + elements.length);
        for (int i = 0; i < size; i++) {
            System.out.print(elements[(front + i) % elements.length] + " ");
        }
        System.out.println();
    }
}
