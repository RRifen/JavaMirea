package lab30;

import javax.swing.*;

public class Window extends JFrame {
        private final JPanel mainPanel = new JPanel();
        private final JPanel ordersPanel = new JPanel();

        private final TableOrdersManager manager = new TableOrdersManager(10);
        private final InternetOrdersManager internetManager = new InternetOrdersManager();

        public Window() {
            super("Ресторан");
            mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
            ordersPanel.setLayout(new BoxLayout(ordersPanel, BoxLayout.X_AXIS));

            JPanel buttonsPanel = new JPanel();
            JButton addOrderButton = new JButton("Добавить заказ");
            JButton addInternetOrderButton = new JButton("Сделать интернет-заказ");
            buttonsPanel.add(addOrderButton);
            buttonsPanel.add(addInternetOrderButton);
            mainPanel.add(buttonsPanel);
            mainPanel.add(ordersPanel);

            addOrderButton.addActionListener((e) -> {
                addNewOrder();
                setVisible(false);
                setVisible(true);
            });

            addInternetOrderButton.addActionListener((e) -> {
                addNewInternetOrder();
                setVisible(false);
                setVisible(true);
            });
            //Общество как исторический процесс

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(800, 600);
            setLocationRelativeTo(null);
            setResizable(false);
            setContentPane(mainPanel);
            setVisible(true);
        }

        private void addNewOrder() {
            String name = JOptionPane.showInputDialog("Введите имя клиента");
            String surname = JOptionPane.showInputDialog("Введите фамилию клиента");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Введите возраст клиента"));
            Customer customer = new Customer(name, surname, age, Address.EMPTY_ADDRESS);
            TableOrder order = new TableOrder();
            order.setCustomer(customer);
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите номер столика"));
            if (tableNumber > 10) {
                JOptionPane.showMessageDialog(null, "Номер столика не может быть больше 10");
                return;
            }
            for (var number: manager.freeTableNumbers()) {
                if (number == tableNumber) {
                    manager.add(order, tableNumber);
                    ForOrders orderPanel = new ForOrders(order, number);
                    ordersPanel.add(orderPanel);
                    orderPanel.addRemoveListener(this);
                    return;
                }
            }
            JOptionPane.showMessageDialog(this, "Столик уже занят!");
        }

        private void addNewInternetOrder() {
            String name = JOptionPane.showInputDialog("Введите имя клиента");
            String surname = JOptionPane.showInputDialog("Введите фамилию клиента");
            int age = Integer.parseInt(JOptionPane.showInputDialog("Введите возраст клиента"));
            Customer customer = new Customer(name, surname, age, Address.EMPTY_ADDRESS);
            InternetOrder order = new InternetOrder();
            order.setCustomer(customer);
            internetManager.add(order);
            ForInternetOrders orderPanel = new ForInternetOrders(order);
            ordersPanel.add(orderPanel);
            orderPanel.addRemoveListener(this);
        }

        public void onOrderRemoved(ForOrders panel) {
            ordersPanel.remove(panel);
            manager.remove(panel.getOrder());
            setVisible(false);
            setVisible(true);
        }

        public void onOrderRemoved(ForInternetOrders panel) {
            ordersPanel.remove(panel);
            manager.remove(panel.getOrder());
            setVisible(false);
            setVisible(true);
        }


    public static void main(String[] args) {
        new Window();
    }
}
