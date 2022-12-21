package lab23.task02;

public interface Queueable {
    void enqueue(Object element);
    void clear();
    Object dequeue();
    Object element();
    boolean isEmpty();
    int size();
}
