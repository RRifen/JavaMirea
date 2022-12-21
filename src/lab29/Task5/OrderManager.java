package lab29.Task5;

import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> addressOrders = new HashMap<>();

    public boolean add(String address, Order order) {
        if (addressOrders.containsKey(address)) {
            return false;
        }
        addressOrders.put(address, order);
        return true;
    }

    public Order getOrder(String address) {
        return addressOrders.get(address);
    }

    public Order removeOrder(String address) {
        return addressOrders.remove(address);
    }

    public void addItemToOrder(String address, Item item) {
        addressOrders.get(address).add(item);
    }

    public int internetOrdersCount() {
        int count = 0;
        for(Order order : addressOrders.values()) {
            if(order instanceof InternetOrder) {
                count++;
            }
        }
        return count;
    }

    public InternetOrder[] getInternetOrders() {
        InternetOrder[] internetOrders = new InternetOrder[internetOrdersCount()];
        int count = 0;
        for(Order order : addressOrders.values()) {
            if(order instanceof InternetOrder) {
                internetOrders[count] = (InternetOrder) order;
                count++;
            }
        }
        return internetOrders;
    }

    public int itemNameCount(String name) {
        int count = 0;
        for(Order order: addressOrders.values()) {
            count += order.countItemsByName(name);
        }
        return count;
    }

}
