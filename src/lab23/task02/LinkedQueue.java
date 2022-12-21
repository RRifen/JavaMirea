package lab23.task02;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue implements Queueable{
    private int size = 0;
    private int front = -1;
    private int rear = -1;
    private LinkedList<Object> elements = new LinkedList<Object>();

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
            elements.set(rear, element);
            return;
        }
        if (flag && (rear < front)) {
            for(int i = 0; i < size - front; i++) {
                elements.set(elements.size() - i - 1, elements.get(size - i - 1));
            }
            front = elements.size() - size + front;
        }
        size++;
        rear = (rear + 1) % elements.size();
        elements.set(rear, element);
    }

    //Предусловие: size > 0
    //Постуловие: рузельтат = elements[front],
    //            front = (front + 1) % elements.length,
    //            size = size - 1
    public Object dequeue() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object element = elements.get(front);
        elements.set(front, null);
        front = (front + 1) % elements.size();
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
        return elements.get(front);
    }

    private boolean ensureCapacity(int capacity) {
        if (capacity > elements.size()) {
            while (elements.size() < 2 * capacity) {
                elements.add(null);
            }
            return true;
        }
        return false;
    }

    //Постуловие: size = 0, front = -1, rear = -1, elements = new Object[0]
    public void clear() {
        front = -1;
        rear = -1;
        size = 0;
        elements = new LinkedList<Object>();
    }

    public void display() {
        System.out.println("front = " + front + ", rear = " + rear + ", size = " + size + ", elements.length = " + elements.size());
        for (int i = 0; i < size; i++) {
            System.out.print(elements.get((front + i) % elements.size()) + " ");
        }
        System.out.println();
    }
}
