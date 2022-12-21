package lab29.Task6;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        Item[] tests = {new Drink(100, "Кока-Кола", "Описание колы"),
                new Drink(200, "Фанта", "Описание фанты"),
                new Dish(300, "Борщ", "Описание борща"),
                new Dish(400, "Суп", "Описание супа")};
        internetOrder.add(tests[0]);
        internetOrder.add(tests[1]);
        internetOrder.add(tests[2]);
        internetOrder.add(tests[3]);
        OrderManager orderManager = new OrderManager();
        String address = "Адрес1";
        try {
            orderManager.add("Адрес1", internetOrder);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        try {
            orderManager.add("Адрес1", internetOrder);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Dish(-100, null, null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            new Dish(100, "", "");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        try {
            orderManager.addRestaurantOrder("Столик1", restaurantOrder);
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        try {
            orderManager.addItemToRestaurantOrder("Столик2", tests[0]);
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }

    }
}
