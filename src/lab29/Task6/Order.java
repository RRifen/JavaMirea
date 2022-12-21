package lab29.Task6;

public interface Order {
    boolean add(Item item);
    boolean removeOne(String name);
    int removeAll(String name);
    int size();
    Item[] getItems();
    double costTotal();
    int countItemsByName(String name);
    String[] getNames();
    Item[] sortedItemsByCostDesc();
}
