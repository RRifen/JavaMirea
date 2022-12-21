package lab15.task01;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculus extends  JFrame{
        JTextField jta1 = new JTextField(10);
        JTextField jta2 = new JTextField(10);
        JButton buttonAdd = new JButton("Сложить");
        JButton buttonSub = new JButton("Вычесть");
        JButton buttonMult = new JButton("Умножить");
        JButton buttonDel = new JButton("Разделить");
        Font fnt = new Font("Times new roman", Font.BOLD,20);
        SimpleCalculus() {
            super("Example");
            setLayout(new FlowLayout());
            setSize(250,150);
            // создаем надпись 1
            add(new JLabel("1st Number"));
            // добавляем текстовое поле jta1
            add(jta1);
            // создаем надпись 2
            add(new JLabel("2nd Number"));
            // добавляем текстовое поле jta2
            add(jta2);
            // добавляем кнопку
            add(buttonAdd);
            add(buttonSub);
            add(buttonMult);
            add(buttonDel);
            //добавляем слушателя к кнопке
            buttonAdd.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = " +(x1+x2),"Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
}
            });

            buttonSub.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result = " +(x1-x2),"Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            buttonMult.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result = " +(x1*x2),"Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            buttonDel.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        double x1 = Double.parseDouble(jta1.getText().trim());
                        double x2 = Double.parseDouble(jta2.getText().trim());
                        JOptionPane.showMessageDialog(null, "Result = " +(x1 / x2),"Alert", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            setVisible(true);
        } // конец конструктора

    public static void main(String[]args){
        new SimpleCalculus();
    } // конец main()
}
