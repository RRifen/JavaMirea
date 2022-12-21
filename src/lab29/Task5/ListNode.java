package lab29.Task5;

public class ListNode {
    public Item data;
    public ListNode next;
    public ListNode prev;

    ListNode(Item d, ListNode next, ListNode prev) {
        data = d;
        this.next = next;
        this.prev = prev;
    }
}
