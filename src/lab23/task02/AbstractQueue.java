package lab23.task02;

public abstract class AbstractQueue {
    public abstract void enqueue(Object element);
    public abstract Object dequeue();
    public abstract boolean isEmpty();
    public abstract int size();
    public abstract Object element();
    public abstract void clear();
    public abstract void display();
}
