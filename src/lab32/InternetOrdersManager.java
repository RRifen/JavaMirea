package lab32;

public class InternetOrdersManager implements OrdersManager {

    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean add(Order order) {
        QueueNode tmpNode = new QueueNode();
        tmpNode.setValue(order);
        if (head == null) {
            head = tmpNode;
            tail = head;
        } else {
            tmpNode.setPrev(tail);
            tail.setNext(tmpNode);
            tail = tmpNode;
        }
        size++;
        return true;
    }

    public Order remove() {
        if (head == null) {
            return null;
        }
        QueueNode tmpNode = head;
        head = head.getNext();
        if (head != null) {
            head.setPrev(null);
        }
        size--;
        return tmpNode.getValue();
    }

    public Order order() {
        if (head == null) {
            return null;
        }
        return head.getValue();
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        QueueNode currNode = head;
        while(currNode != null) {
            quantity += currNode.getValue().itemsQuantity(itemName);
            currNode = currNode.getNext();
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        QueueNode currNode = head;
        while(currNode != null) {
            quantity += currNode.getValue().itemsQuantity(item);
            currNode = currNode.getNext();
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        Order[] result = new Order[size];
        QueueNode currNode = head;
        int i = 0;
        while(currNode != null) {
            result[i] = currNode.getValue();
            currNode = currNode.getNext();
            i++;
        }
        return result;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode currNode = head;
        while(currNode != null) {
            cost += currNode.getValue().costTotal();
            currNode = currNode.getNext();
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}
