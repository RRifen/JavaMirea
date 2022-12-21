package lab32;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

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
            JButton importFromFiles = new JButton("Ввод из файлов");
            buttonsPanel.add(addOrderButton);
            buttonsPanel.add(addInternetOrderButton);
            buttonsPanel.add(importFromFiles);
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

            importFromFiles.addActionListener((e) -> {
                String element;
                String[] elements;
                for(int i = 1; i < 10; i++) {
                    try {
                        File myObj = new File(new File(".").getCanonicalPath() + "\\" + "orders" + i + ".txt");
                        Scanner myReader = new Scanner(myObj);
                        TableOrder order = new TableOrder();
                        int firstNumber = Integer.parseInt(myReader.nextLine());
                        for(int j = 0; j < firstNumber; j++) {
                            element = myReader.nextLine();
                            elements = element.split(">");
                            order.add(new Dish(Integer.parseInt(elements[2]), elements[0], elements[1]));
                        };
                        elements = myReader.nextLine().split(">");
                        String firstName = elements[0];
                        String secondNumber = elements[1];
                        int age = Integer.parseInt(elements[2]);
                        order.setCustomer(new Customer(firstName, secondNumber, age, Address.EMPTY_ADDRESS));
                        int tableNumber = i + 1;
                        boolean flag = false;
                        for (var number: manager.freeTableNumbers()) {
                            if (number == tableNumber) {
                                manager.add(order, tableNumber);
                                ForOrders orderPanel = new ForOrders(order, number);
                                ordersPanel.add(orderPanel);
                                orderPanel.addRemoveListener(this);
                                flag = true;
                                break;
                            }
                        }
                        if (flag == false) {
                            JOptionPane.showMessageDialog(this, "Столик " + (tableNumber - 1) + "уже занят!");
                        }
                        myReader.close();
                    } catch (FileNotFoundException ignored) {

                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                setVisible(false);
                setVisible(true);
            });

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
            int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Введите номер столика")) + 1;
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
