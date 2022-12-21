package lab29.Task4;

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
        internetOrder.removeOne("Фанта");
        System.out.println(internetOrder);
        System.out.println(Arrays.toString(internetOrder.sortedItemsByCostDesc()));
        internetOrder.add(new Dish(500, "Суп", "Описание супа"));
        System.out.println("Количество супа: " + internetOrder.countItemsByName("Суп"));
        internetOrder.removeAll("Суп");
        System.out.println(internetOrder);
        System.out.println("Полная сумма: " + internetOrder.costTotal());
        System.out.println("Количество объектов: " + internetOrder.size());
        System.out.println("Названия всех блюд: " + Arrays.toString(internetOrder.getNames()));
    }
}
