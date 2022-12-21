package lab24;

import javax.swing.*;

public interface IDocument {
    void doAction(JMenuItem item, JTextArea mainArea);
    void saveFile(JMenuItem item, JTextArea mainArea);
    JTextField getUpper();


}
