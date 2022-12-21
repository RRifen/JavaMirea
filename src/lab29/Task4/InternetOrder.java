package lab29.Task4;

import java.util.ArrayList;

public class InternetOrder implements Order{
    InternetOrder() {
        head = null;
    }

    InternetOrder(Item[] dataArr) {
        for (Item elem : dataArr) {
            add(elem);
        }
    }

    ListNode head;

    @Override
    public boolean add(Item data) {
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
        return true;
    }

    @Override
    public boolean removeOne(String name) {
        if (head == null) {
            return false;
        }
        ListNode currNode = head;
        while (currNode.next != null && !currNode.data.getName().equals(name)) {
            currNode = currNode.next;
        }
        if (currNode.data.getName().equals(name)) {
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
            if (currNode.next != null) {
                currNode.next.prev = currNode.prev;
            }
            return true;
        }
        return false;
    }

    @Override
    public int removeAll(String name) {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode currNode = head;
        while(currNode != null) {
            while (currNode.next != null && !currNode.data.getName().equals(name)) {
                currNode = currNode.next;
            }
            if (currNode.data.getName().equals(name)) {
                if (currNode == head) {
                    if (currNode.next != null) {
                        head = head.next;
                        head.prev = null;
                        count++;
                    } else {
                        head = null;
                        count++;
                    }
                } else {
                    currNode.prev.next = currNode.next;
                    if (currNode.next != null) {
                        currNode.next.prev = currNode.prev;
                    }
                    count++;
                }
                currNode = currNode.next;
            }
        }
        return count;
    }

    @Override
    public int size() {
        int count = 0;
        ListNode currNode = head;
        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        Item[] items = new Item[size()];
        ListNode currNode = head;
        int i = 0;
        while (currNode != null) {
            items[i] = currNode.data;
            i++;
            currNode = currNode.next;
        }
        return items;
    }

    @Override
    public double costTotal() {
        double cost = 0;
        ListNode currNode = head;
        while (currNode != null) {
            cost += currNode.data.getCost();
            currNode = currNode.next;
        }
        return cost;
    }

    @Override
    public int countItemsByName(String name) {
        String[] result = new String[size()];
        ListNode currNode = head;
        int count = 0;
        while (currNode != null) {
            if (currNode.data.getName().equals(name)) {
                count++;
            }
            currNode = currNode.next;
        }
        return count;
    }

    @Override
    public String[] getNames() {
        ArrayList<String> result = new ArrayList<String>();
        ListNode currNode = head;
        int i = 0;
        boolean flag = false;
        while (currNode != null) {
            flag = false;
            for (String s : result) {
                if (s.equals(currNode.data.getName())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result.add(currNode.data.getName());
                i++;
            }
            currNode = currNode.next;
        }
        return result.toArray(new String[0]);
    }

    @Override
    public Item[] sortedItemsByCostDesc() {
        Item[] items = getItems();
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j].getCost() < items[j + 1].getCost()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
        return items;
    }

    @Override
    public String toString() {
        String result = "InternetOrder{\n";
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
