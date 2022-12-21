package lab24;

import javax.swing.*;

public class Chooser extends JFrame {
    public Chooser() {
        super("Chooser");
        int choice = JOptionPane.showOptionDialog(null, "Выберите документ", "Chooser", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new String[]{"TextDocument", "ImageDocument", "MusicDocument"}, "Open");
        if (choice == 0) {
            new GUI(new CreateTextDocument());
        } else if (choice == 1) {
            new GUI(new CreateImageDocument());
        } else if (choice == 2) {
            new GUI(new CreateMusicDocument());
        }
        setVisible(false);
    }

    public static void main(String[] args) {
        new Chooser();
    }
}
