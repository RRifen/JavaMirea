package lab30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TableOrdersManager implements OrdersManager {
    private int size;
    private Order[] orders;

    public TableOrdersManager(int size) {
        this.size = size;
        orders = new Order[size];
    }

    public TableOrdersManager() {
        this(10);
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity += order.itemsQuantity(itemName);
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity += order.itemsQuantity(item);
            }
        }
        return quantity;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (Order order : orders) {
            if (order != null) {
                cost += order.costTotal();
            }
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity++;
            }
        }
        return quantity;
    }

    public void add(Order order, int tableNumber) {
        if (tableNumber < 0 || tableNumber >= size) {
            return;
        }
        orders[tableNumber] = order;
    }

    public void addItem(MenuItem item, int tableNumber) {
        if (tableNumber < 0 || tableNumber >= size) {
            return;
        }
        orders[tableNumber].add(item);
    }

    public int freeTableNumber() {
        for (int i = 0; i < size; i++) {
            if (orders[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public Integer[] freeTableNumbers() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (orders[i] == null) {
                result.add(i);
            }
        }
        return result.toArray(new Integer[result.size()]);
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber < 0 || tableNumber >= size) {
            return null;
        }
        return orders[tableNumber];
    }

    public void remove(int tableNumber) {
        if (tableNumber < 0 || tableNumber >= size) {
            return;
        }
        orders[tableNumber] = null;
    }

    public int remove(Order order) {
        for (int i = 0; i < size; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                return i;
            }
        }
        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (orders[i] == order) {
                orders[i] = null;
                count++;
            }
        }
        return count;
    }
}
