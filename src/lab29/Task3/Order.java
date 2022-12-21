package lab29.Task3;

public class Order {
    Order() {
        head = null;
    }

    Order(Item[] dataArr) {
        for (Item elem : dataArr) {
            insert(elem);
        }
    }

    ListNode head;

    public void insert(Item data) {
        if (head == null) {
            head = new ListNode(data, null, null);
        } else {
            ListNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            ListNode new_node = new ListNode(data, null, last);
            if (last == head) {
                head.next = new_node;
            }
            else {
                last.next = new_node;
            }
        }
    }

    public boolean remove(Item data) {
        if (head == null) {
            return false;
        }
        ListNode currNode = head;
        while (currNode.next != null && currNode.data != data) {
            currNode = currNode.next;
        }
        if (currNode.data == data) {
            if (currNode == head) {
                if (currNode.next != null) {
                    head = head.next;
                    head.prev = null;
                    return true;
                } else {
                    head = null;
                    return true;
                }
            }
            currNode.prev.next = currNode.next;
            currNode.next.prev = currNode.prev;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "Order{\n";
        if (head == null) {
            return result;
        }
        else {
            result = result + "\t" + head.data.toString() + ";\n";
        }
        ListNode currNode = head.next;
        while (currNode != null) {
            result += "\t" + currNode.data.toString() + ";\n";
            currNode = currNode.next;
        }
        return result + "}";
    }
}
