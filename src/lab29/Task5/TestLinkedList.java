package lab29.Task5;

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
        orderManager.add("Адрес1", internetOrder);
        orderManager.addItemToOrder("Адрес1", new Drink(500, "Кока-Кола", "Описание колы"));
        System.out.println(Arrays.toString(orderManager.getInternetOrders()));
        System.out.println("Количество позиций с колой: " + orderManager.itemNameCount("Кока-Кола"));
        System.out.println(orderManager.getOrder("Адрес1"));
        System.out.println("Количество интернет-заказов: " + orderManager.internetOrdersCount());
        orderManager.removeOrder("Адрес1");
        System.out.println("Массив интернет заказов после их удаления: " + Arrays.toString(orderManager.getInternetOrders()));
    }
}
