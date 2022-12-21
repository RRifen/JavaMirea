package lab16.task03;

import javax.swing.*;

public class ChangeText extends JFrame {
    private String font;
    private String color;
    public ChangeText() {
        super("ChangeText");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JTextArea textArea = new JTextArea();
        panel.add(textArea);

        JMenu color = new JMenu("Цвет");
        JMenuItem red = new JMenuItem("Красный");
        red.addActionListener(e -> textArea.setForeground(java.awt.Color.RED));
        JMenuItem blue = new JMenuItem("Синий");
        blue.addActionListener(e -> textArea.setForeground(java.awt.Color.BLUE));
        JMenuItem black = new JMenuItem("Черный");
        black.addActionListener(e -> textArea.setForeground(java.awt.Color.BLACK));
        color.add(red);
        color.add(blue);
        color.add(black);
        JMenu font = new JMenu("Шрифт");
        JMenuItem times = new JMenuItem("Times New Roman");
        times.addActionListener(e -> textArea.setFont(new java.awt.Font("Times New Roman", 0, 12)));
        JMenuItem sans = new JMenuItem("MS Sans Serif");
        sans.addActionListener(e -> textArea.setFont(new java.awt.Font("MS Sans Serif", 0, 12)));
        JMenuItem courier = new JMenuItem("Courier New");
        courier.addActionListener(e -> textArea.setFont(new java.awt.Font("Courier New", 0, 12)));
        font.add(times);
        font.add(sans);
        font.add(courier);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(color);
        menuBar.add(font);

        add(panel);
        setJMenuBar(menuBar);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChangeText();
    }
}
