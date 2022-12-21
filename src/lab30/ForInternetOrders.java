package lab30;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForInternetOrders extends JPanel{
    public static int ids;
    private final List<Window> listeners = new ArrayList<>();
    private final Order order;
    private final JLabel itemsLabel;
    private final JLabel sumResultLabel;

    private final MenuItem[] items = {
            new Dish(100, "Макароны", "Макароны с мясом"),
            new Dish(90, "Салат", "Салат с курицей"),
            new Dish(10, "Конфета", "Только для интернет-заказа"),
            new Drink(110, "Кофе", "Кофе с молоком", DrinkTypeEnum.COFFEE, 0),
            new Drink(60, "Черный чай", "Чай с медом", DrinkTypeEnum.BLACK_TEA, 0),
            new Drink(60, "Зеленый чай", "Чай с сахаром", DrinkTypeEnum.COFFEE, 0),
    };

    public ForInternetOrders(Order order) {
        super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        this.order = order;
        JLabel orderLabel = new JLabel
                ("Заказ ID:"
                        + ids
                        + " от "
                        + order.getCustomer().getFirstName()
                        + ' '
                        + order.getCustomer().getSecondName()
                );
        ids++;

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
                update();
            }
        });

        removeOrderButton.addActionListener(e -> {
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
}
