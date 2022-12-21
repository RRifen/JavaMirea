package lab15.task04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Calculator extends JFrame {
    JTextArea textArea;
    Calculator() {
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);

        JPanel panel = new JPanel(new GridLayout(4, 4, 10, 10));

        String[] buttonsLabel = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        JButton[] buttons = new JButton[buttonsLabel.length];
        for (int i = 0; i < buttonsLabel.length; i++) {
            buttons[i] = new JButton(buttonsLabel[i]);
            if (i != 14) {
                buttons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textArea.append(((JButton) e.getSource()).getText());
                    }
                });
            }
            else {
                buttons[i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String expression = textArea.getText();
                        ArrayList<Double> numbers = new ArrayList<>();
                        for (String number : expression.split("[+\\-*/]")) {
                            try {
                                numbers.add(Double.parseDouble(number));
                            }
                            catch (NumberFormatException ex) {
                                textArea.setText("");
                                JOptionPane.showMessageDialog( null, "Error in Numbers!","alert" , JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        };
                        ArrayList<Character> operators = new ArrayList<>();
                        for (String operator : expression.split("[0-9.]+")) {
                                if (operator.length() > 1) {
                                    textArea.setText("");
                                    JOptionPane.showMessageDialog( null, "Error in Operators!","alert" , JOptionPane.ERROR_MESSAGE);
                                    return;
                                } else if (operator.length() == 1) {
                                    Character item = operator.charAt(0);
                                    operators.add(item);
                                } else {
                                    continue;
                                }
                        }
                        if (numbers.size() != operators.size() + 1) {
                            textArea.setText("");
                            JOptionPane.showMessageDialog( null, "Error in Expression!","alert" , JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        Stack<Double> numbersStack = new Stack<>();
                        Stack<Character> operatorsStack = new Stack<>();
                        double number;
                        char operator;
                        double first, second;
                        for(int i = 0; i < operators.size(); i++) {
                            number = numbers.get(i);
                            numbersStack.push(number);
                            operator = operators.get(i);
                            if (!(operatorsStack.isEmpty()) && (getPriority(operator) <= getPriority(operatorsStack.peek()))) {
                                while (!(operatorsStack.isEmpty()) && (getPriority(operator) <= getPriority(operatorsStack.peek()))) {
                                    second = numbersStack.pop();
                                    first = numbersStack.pop();
                                    numbersStack.push(calculate(first, second, operatorsStack.pop()));
                                }
                                operatorsStack.push(operator);
                            }
                            else {
                                operatorsStack.push(operator);
                            }
                        }
                        number = numbers.get(numbers.size() - 1);
                        numbersStack.push(number);
                        while(!operatorsStack.isEmpty()) {
                            second = numbersStack.pop();
                            first = numbersStack.pop();
                            numbersStack.push(calculate(first, second, operatorsStack.pop()));
                        }
                        JOptionPane.showMessageDialog(null, numbersStack.pop(),"Alert", JOptionPane.INFORMATION_MESSAGE);
                        textArea.setText("");
                    }
                });
            }
            panel.add(buttons[i]);
        }

        textArea = new JTextArea("", 10, 10);
        textArea.setLineWrap(true);
        textArea.setEditable(false);

        add(textArea);
        add(panel);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setResizable(false);
        setVisible(true);
    }

    private static double calculate(double a, double b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
    private static int getPriority(Character symb) {
        if (symb.equals('+') || symb.equals('-')) {
            return 1;
        }
        else {
            return 2;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
