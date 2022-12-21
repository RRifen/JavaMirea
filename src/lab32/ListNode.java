package lab32;

public class ListNode {
    public ListNode getNext() {
        return next;
    }

    public MenuItem getValue() {
        return value;
    }

    private ListNode next = null;
    private MenuItem value = null;
    public void setNext(ListNode next) {
        this.next = next;
    }
    public void setValue(MenuItem value) {
        this.value = value;
    }
}
