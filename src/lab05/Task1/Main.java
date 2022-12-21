package lab05.Task1;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {
        private static int milanScore = 0;
        private static int madridScore = 0;

        private static int getMilan() {
            return milanScore;
        }
        private static int getMadrid() {
            return madridScore;
        }
        private static void setMadrid() {
            madridScore++;
        }
        private static void setMilan() {
            milanScore++;
        }




        public static void main(String[] args){
            JFrame frame = new JFrame("My First GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setSize(800,400);

            JButton button1 = new JButton("AC Milan");
            JButton button2 = new JButton("Real Madrid");
            JLabel labelResult = new JLabel("Result: 0 X 0");
            JLabel labelLastScorer = new JLabel("Last Scorer: N/A");
            JLabel labelScorer = new JLabel("Winner: DRAW");

            JPanel panel= new JPanel();
            panel.add(button1);
            panel.add(button2);
            panel.add(labelResult);
            panel.add(labelLastScorer);
            panel.add(labelScorer);
            panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setMilan();
                    labelResult.setText("Result " + getMilan() + " X " + getMadrid());
                    labelLastScorer.setText("Last Scorer: AC Milan");
                    if (getMilan() > getMadrid()) {
                        labelScorer.setText("Winner: AC Milan");
                    }
                    if (getMadrid() == getMilan()) {
                        labelScorer.setText("Winner: DRAW");
                    }
                }
            });
            button2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    setMadrid();
                    labelResult.setText("Result " + getMilan() + " X " + getMadrid());
                    labelLastScorer.setText("Last Scorer: Real Madrid");
                    if (getMadrid() > getMilan()) {
                        labelScorer.setText("Winner: Real Madrid");
                    }
                    if (getMadrid() == getMilan()) {
                        labelScorer.setText("Winner: DRAW");
                    }
                }
            });

            frame.getContentPane().add(panel);

            frame.setVisible(true);
        }
}