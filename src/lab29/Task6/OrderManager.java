package lab29.Task6;

import java.util.HashMap;

public class OrderManager {
    HashMap<String, Order> addressOrders = new HashMap<>();

    public boolean add(String address, Order order) throws OrderAlreadyAddedException {
        if (addressOrders.containsKey(address)) {
            throw new OrderAlreadyAddedException("Заказ с адресом: " + address + " уже существует");
        }
        addressOrders.put(address, order);
        return true;
    }

    public boolean addRestaurantOrder(String number, RestaurantOrder order) throws OrderAlreadyAddedException {
        if (addressOrders.containsKey(number)) {
            throw new OrderAlreadyAddedException("Заказ со столиком: " + number + " уже существует");
        }
        addressOrders.put(number, order);
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
    public void addItemToRestaurantOrder(String number, Item item) {
        if (!addressOrders.containsKey(number)) {
            throw new IllegalTableNumber("Нет заказа для столика: " + number);
        }
        else {
            addressOrders.get(number).add(item);
        }
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
