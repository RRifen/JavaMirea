package lab16.task04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;

public class PasswordApplication extends JFrame {

    private JLabel label4;
    public PasswordApplication() {
        super("Password Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(605, 400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JTextField textField1 = new JTextField(50);
        JTextField textField2 = new JTextField(50);
        JPasswordField textField3 = new JPasswordField(50);
        Pattern bigLetter = Pattern.compile("[A-Z]");
        Pattern smallLetter = Pattern.compile("[a-z]");
        Pattern digit = Pattern.compile("\\d");
        Pattern password = Pattern.compile("[^A-Za-z0-9]");
        textField3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (textField3.getText().length() < 10) {
                    label4.setText("Пароль слишком короткий");
                } else if (!bigLetter.matcher(new String(textField3.getPassword()) + e.getKeyChar()).find()) {
                    label4.setText("В пароле должна быть хотя бы одна большая буква");
                } else if (!smallLetter.matcher(textField3.getText() + e.getKeyChar()).find(0)) {
                    label4.setText("В пароле должна быть хотя бы одна маленькая буква");
                } else if (!digit.matcher(textField3.getText() + e.getKeyChar()).find()) {
                    label4.setText("В пароле должна быть хотя бы одна цифра");
                } else if (!password.matcher(textField3.getText() + e.getKeyChar()).find()) {
                    label4.setText("В пароле должен быть хотя бы один спецсимвол");
                } else {
                    label4.setText("Пароль надежный");
                }

            }
        });
        textField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField3.setText("");
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText("");
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        JLabel label1 = new JLabel("Service: ");
        JLabel label2 = new JLabel("User name: ");
        JLabel label3 = new JLabel("Password: ");
        label4 = new JLabel("");
        label4.setBorder(BorderFactory.createMatteBorder(0, 100, 0, 0, new Color(0, 0, 0, 1)));
        panel1.add(label1);
        panel1.add(textField1);
        panel2.add(label2);
        panel2.add(textField2);
        panel3.add(label3);
        panel3.add(textField3);
        add(panel1);
        add(panel2);
        add(panel3);
        add(label4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new PasswordApplication();
    }
}
