package lab29.Task2;

public class Test {
    public static void main(String[] args) {
        Item drink = new Drink(100, "Coca-Cola", "Описание");
        Item dish = new Dish(100, "Borsch", "Описание борща");
        System.out.println(drink);
        System.out.println(dish);
    }
}
