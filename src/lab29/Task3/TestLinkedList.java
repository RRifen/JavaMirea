package lab29.Task3;

public class TestLinkedList {
    public static void main(String[] args) {
        InternetOrder internetOrder = new InternetOrder();
        Item[] tests = {new Drink(100, "Кока-Кола", "Описание колы"),
                new Drink(200, "Фанта", "Описание фанты"),
                new Dish(300, "Борщ", "Описание борща"),
                new Dish(400, "Суп", "Описание супа")};
        internetOrder.insert(tests[0]);
        internetOrder.insert(tests[1]);
        internetOrder.insert(tests[2]);
        internetOrder.insert(tests[3]);
        internetOrder.remove(tests[2]);
        System.out.println(internetOrder);
    }
}
