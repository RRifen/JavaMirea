package lab30;

import java.util.ArrayList;

public class InternetOrder implements Order{
    private int size;
    private ListNode head = null;
    private ListNode tail = null;
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        ListNode tmpNode = new ListNode();
        tmpNode.setValue(item);
        if (head == null) {
            head = tmpNode;
            tail = head;
        } else {
            tail.setNext(tmpNode);
            tail = tmpNode;
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        ListNode currNode = head;
        ArrayList<String> result = new ArrayList<String>();
        while(currNode != null) {
            if (!result.contains(currNode.getValue().getName())) {
                result.add(currNode.getValue().getName());
            }
            currNode = currNode.getNext();
        }
        return result.toArray(new String[result.size()]);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        ListNode currNode = head;
        while(currNode != null) {
            if (currNode.getValue().getName().equals(itemName)) {
                count++;
            }
            currNode = currNode.getNext();
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        ListNode currNode = head;
        while(currNode != null) {
            if (currNode.getValue() == item) {
                count++;
            }
            currNode = currNode.getNext();
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        ArrayList<MenuItem> result = new ArrayList<MenuItem>();
        ListNode currNode = head;
        while(currNode != null) {
            result.add(currNode.getValue());
            currNode = currNode.getNext();
        }
        return result.toArray(new MenuItem[result.size()]);
    }

    @Override
    public boolean remove(String itemName) {
        if (head == null) {
            return false;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
            if (currNode.getValue().getName().equals(itemName)) {
                if (currNode == head) {
                    head = currNode.getNext();
                    size--;
                    return true;
                } else {
                    prevNode.setNext(currNode.getNext());
                    size--;
                    return true;
                }
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        if (head == null) {
            return false;
        }
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
            if (currNode.getValue() == item) {
                if (currNode == head) {
                    head = currNode.getNext();
                    size--;
                    return true;
                } else {
                    prevNode.setNext(currNode.getNext());
                    size--;
                    return true;
                }
            }
            prevNode = currNode;
            currNode = currNode.getNext();
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
            if (currNode.getValue().getName().equals(itemName)) {
                if (currNode == head) {
                    head = currNode.getNext();
                    size--;
                    count++;
                } else {
                    prevNode.setNext(currNode.getNext());
                    size--;
                    count++;
                }
            }
            else {
                prevNode = currNode;
            }
            currNode = currNode.getNext();
        }
        return count++;
    }

    @Override
    public int removeAll(MenuItem item) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
            if (currNode.getValue() == item) {
                if (currNode == head) {
                    head = currNode.getNext();
                    size--;
                    count++;
                } else {
                    prevNode.setNext(currNode.getNext());
                    size--;
                    count++;
                }
            }
            else {
                prevNode = currNode;
            }
            currNode = currNode.getNext();
        }
        return count++;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        ArrayList<MenuItem> items = new ArrayList<MenuItem>();
        ListNode currNode = head;
        while(currNode != null) {
            items.add(currNode.getValue());
            currNode = currNode.getNext();
        }
        MenuItem[] result = items.toArray(new MenuItem[items.size()]);
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(result[j].getCost() > result[j - 1].getCost()) {
                    MenuItem tmp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = tmp;
                }
            }
        }
        return result;
    }

    @Override
    public int costTotal() {
        int sum = 0;
        ListNode currNode = head;
        while(currNode != null) {
            sum += currNode.getValue().getCost();
            currNode = currNode.getNext();
        }
        return sum;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
