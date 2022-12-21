package lab32;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForOrders extends JPanel {
    private final List<Window> listeners = new ArrayList<>();
    private final Order order;
    private final JLabel itemsLabel;
    private final JLabel sumResultLabel;

    private final MenuItem[] items = {
            new Dish(100, "Макароны", "Макароны с мясом"),
            new Dish(90, "Салат", "Салат с курицей"),
            new Drink(110, "Кофе", "Кофе с молоком", DrinkTypeEnum.COFFEE, 0),
            new Drink(60, "Черный чай", "Чай с медом", DrinkTypeEnum.BLACK_TEA, 0),
            new Drink(60, "Зеленый чай", "Чай с сахаром", DrinkTypeEnum.COFFEE, 0)
    };

    public ForOrders(Order order, int orderNumber) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.order = order;
        JLabel orderLabel = new JLabel
                ("Заказ №"
                        + (orderNumber - 1)
                        + " от "
                        + order.getCustomer().getFirstName()
                        + ' '
                        + order.getCustomer().getSecondName()
                );
        orderUpdate(order, orderNumber);
        JLabel sumTextLabel = new JLabel("Сумма");
        JButton addItemButton = new JButton("Добавить блюдо");
        JButton removeItemButton = new JButton("Удалить блюдо");
        JButton removeOrderButton = new JButton("Удалить заказ");

        itemsLabel = new JLabel();
        sumResultLabel = new JLabel();

        for (var component: new JComponent[]
                {
                        orderLabel,
                        itemsLabel,
                        sumTextLabel,
                        sumResultLabel,
                        addItemButton,
                        removeItemButton,
                        removeOrderButton
                }) {
            add(component);
        }

        addItemButton.addActionListener(e -> {
            MenuItem item = (MenuItem) JOptionPane.showInputDialog(
                    null,
                    "Выберите блюдо",
                    "Добавление блюда",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    items,
                    items[0]);
            if (item != null) {
                order.add(item);
                orderUpdate(order, orderNumber);
                update();
            }
        });

        removeItemButton.addActionListener(e -> {
            MenuItem item = (MenuItem) JOptionPane.showInputDialog(
                    null,
                    "Выберите блюдо",
                    "Удаление блюда",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    order.getItems(),
                    order.getItems()[0]);
            if (item != null) {
                order.remove(item.getName());
                orderUpdate(order, orderNumber);
                update();
            }
        });

        removeOrderButton.addActionListener(e -> {
            orderRemove(order, orderNumber);
            destroy();
        });

        setSize(100, 500);
        update();
    }

    public void update() {
        itemsLabel.setText(Arrays.toString(order.getItems()));
        sumResultLabel.setText(String.valueOf(order.costTotal()));
    }

    public Order getOrder() {
        return order;
    }

    private void destroy() {
        for (var listener: listeners) {
            listener.onOrderRemoved(this);
        }
    }

    public void addRemoveListener(Window listener) {
        listeners.add(listener);
    }

    void orderUpdate(Order order, int number) {
        try {
            FileWriter myWriter = new FileWriter(new File(".").getCanonicalPath() + "\\" + "orders"  + (number - 1) + ".txt");
            myWriter.write(order.itemsQuantity() + "\n");
            for(MenuItem elem: order.getItems()) {
                myWriter.write(elem.getName() + ">" + elem.getDescription() + ">" + elem.getCost() + "\n");
            }
            Customer customer = order.getCustomer();
            myWriter.write(customer.getFirstName() + ">" + customer.getSecondName() + ">" + customer.getAge() + "\n");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void orderRemove(Order order, int number) {
        File myWriter = null;
        try {
            myWriter = new File(new File(".").getCanonicalPath() + "\\" + "orders"  + (number - 1) + ".txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        myWriter.delete();
    }

}



