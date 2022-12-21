package lab16.task01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessingGame extends JFrame {
    private int number;
    private int attempts = 3;

    public GuessingGame() {
        super("Guessing Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 200);

        generateNumber();
        var label = new JLabel("Попробуйте угадать число от 1 до 20. " + (number * number + 1));
        var textField = new JTextField(10);
        textField.setMaximumSize( textField.getPreferredSize() );
        var button = new JButton("Проверить");
        var labelResult = new JLabel("");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int supposedNumber = Integer.parseInt(textField.getText());
                if (supposedNumber == number) {
                    JOptionPane.showMessageDialog(null, "Вы угадали","Alert", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                } else {
                    if (attempts == 1) {
                        labelResult.setText("Вы проиграли! Правильный ответ: " + number);
                        JOptionPane.showMessageDialog(null, "Вы проиграли! Правильный ответ: " + number,"Alert", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    if (supposedNumber > number) {
                        labelResult.setText("Загаданное число меньше." + " Осталось попыток: " + --attempts);
                    } else {
                        labelResult.setText("Загаданное число больше." + " Осталось попыток: " + --attempts);
                    }
                }
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(label);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(labelResult);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        textField.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(textField);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        add(panel);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void generateNumber() {
        number = (int) (Math.random() * 20 + 1);
    }

    public static void main(String[] args) {
        new GuessingGame();
    }
}
