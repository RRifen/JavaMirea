package lab16.task02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestBorderLayout extends JFrame {

    public TestBorderLayout() {
        super("TestBorderLayout");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 200);

        JPanel panel = new JPanel(new BorderLayout());
        JLabel north = new JLabel("North", SwingConstants.CENTER);
        JLabel south = new JLabel("South", SwingConstants.CENTER);
        JLabel east = new JLabel("East");
        JLabel west = new JLabel("West");
        JLabel center = new JLabel("Center", SwingConstants.CENTER);

        north.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в САО","Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        east.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО","Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        west.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО","Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        south.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать ЮАО","Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        center.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО","Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        north.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        east.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        west.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        south.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        center.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panel.add(north, BorderLayout.NORTH);
        panel.add(south, BorderLayout.SOUTH);
        panel.add(east, BorderLayout.EAST);
        panel.add(west, BorderLayout.WEST);
        panel.add(center, BorderLayout.CENTER);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestBorderLayout();
    }
}
