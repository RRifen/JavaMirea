package lab30;

import java.util.ArrayList;

public class TableOrder implements Order{
    private MenuItem[] items;
    private int size;
    private Customer customer;

    TableOrder() {
        items = new MenuItem[]{null, null, null, null, null, null, null, null, null, null};
        size = 0;
    }

    @Override
    public boolean add(MenuItem item) {
        if (size == items.length) {
            MenuItem[] newItems = new MenuItem[items.length * 2];
            System.arraycopy(items, 0, newItems, 0, items.length);
            items = newItems;
        }
        items[size++] = item;
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < size; i++) {
            if(result.contains(items[i].getName())) {
                continue;
            }
            result.add(items[i].getName());
        }
        return result.toArray(new String[result.size()]);
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int sum = 0;
        for(int i = 0; i < size; i++) {
            if(items[i].getName().equals(itemName)) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int sum = 0;
        for(int i = 0; i < size; i++) {
            if(items[i] == item) {
                sum++;
            }
        }
        return sum;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] result = new MenuItem[size];
        int j = 0;
        for(int i = 0; i < size; i++) {
            if (items[i] != null) {
                result[j] = items[i];
                j++;
            }
        }
        return result;
    }

    @Override
    public boolean remove(String itemName) {
        for(int i = 0; i < size; i++) {
            if(items[i].getName().equals(itemName)) {
                items[i] = null;
                int count = 0;
                for(int j = i + 1; j < size; j++) {
                    if (items[j] != null) {
                        items[i + count] = items[j];
                        count++;
                    }
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for(int i = 0; i < size; i++) {
            if(items[i] == item) {
                items[i] = null;
                int count = 0;
                for(int j = i + 1; j < size; j++) {
                    if (items[j] != null) {
                        items[i + count] = items[j];
                        count++;
                    }
                }
                size--;
                return true;
            }
        }

        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(items[i].getName().equals(itemName)) {
                items[i] = null;
                size--;
                count++;
            }
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(items[i] == item) {
                items[i] = null;
                size--;
                count++;
            }
        }
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] result = new MenuItem[size];
        System.arraycopy(items, 0, result, 0, size);
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(result[j].getCost() > result[j - 1].getCost()) {
                    MenuItem tmp = result[j];
                    result[j] = result[j - 1];
                    result[j - 1] = tmp;
                }
            }
        }
        return result;
    }

    @Override
    public int costTotal() {
        int costTotal = 0;
        for(MenuItem item: items) {
            if (item != null) {
                costTotal += item.getCost();
            }
        }
        return costTotal;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
