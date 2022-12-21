package lab15.task03;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class FileMenu extends JFrame {
    private static JTextArea textArea;

    FileMenu() {
        super("File Menu");

        JMenuBar menuBar = generateMenuBar();

        JPanel panel = new JPanel(new GridLayout(1, 2, 10, 10));

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Кнопка 1 нажата");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Кнопка 2 нажата");
            }
        });

        Border margin = new EmptyBorder(5, 15, 5, 15);
        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        panel.add(button1);
        panel.add(button2);

        textArea = new JTextArea("This is the area you can write text", 10, 10);
        textArea.setLineWrap(true);

        add(panel);
        add(textArea);
        setLayout(new GridLayout(2, 1, 20, 20));

        setSize(400, 200);
        setResizable(false);
        setJMenuBar(menuBar);
        setVisible(true);
    }


    public static void main(String[] args) {
        new FileMenu();
    }

    public static JMenuBar generateMenuBar() {
        JMenu file = new JMenu("Файл");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem exit = new JMenuItem("Выйти");
            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int dialog = fileChooser.showSaveDialog(null);
                    if (dialog == JFileChooser.APPROVE_OPTION) {
                        File selected = fileChooser.getSelectedFile();
                        try {
                            boolean flag = selected.createNewFile();
                            if (!flag) {
                                int choice = JOptionPane.showConfirmDialog(null, "Вы действительно хотите перезапизать файл?", "Rewrite", JOptionPane.YES_NO_OPTION);
                                System.out.println(choice);
                                if (choice == 0) {
                                    FileOutputStream fooStream = new FileOutputStream(selected, false);
                                    byte[] myBytes = textArea.getText().getBytes();
                                    fooStream.write(myBytes);
                                    fooStream.close();
                                }
                            } else {
                                FileOutputStream fooStream = new FileOutputStream(selected, true);
                                byte[] myBytes = textArea.getText().getBytes();
                                fooStream.write(myBytes);
                                fooStream.close();
                            }
                        } catch (Exception ignored) {

                        }
                    }
                }
            });

            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
            file.add(save);
            file.add(exit);

            JMenu edit = new JMenu("Правка");
            JMenuItem copy = new JMenuItem("Копировать");
            JMenuItem paste = new JMenuItem("Вставить");
            JMenuItem cut = new JMenuItem("Вырезать");
            paste.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    String toPaste = "";
                    try {
                        toPaste = clipboard.getData(DataFlavor.stringFlavor).toString();
                    } catch (Exception ignored) {
                    }
                    textArea.replaceRange(toPaste, textArea.getSelectionStart(), textArea.getSelectionEnd());
                }
            });
            copy.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String myString = textArea.getSelectedText();
                    StringSelection stringSelection = new StringSelection(myString);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, null);
                }
            });
            cut.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String myString = textArea.getSelectedText();
                    StringSelection stringSelection = new StringSelection(myString);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, null);
                    textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
                }
            });
            edit.add(copy);
            edit.add(cut);
            edit.add(paste);

            JMenu help = new JMenu("Справка");
            JMenuItem about = new JMenuItem("Справка");
            about.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Справка");
                }
            });
            help.add(about);

            JMenuBar menuBar = new JMenuBar();
            menuBar.add(file);
            menuBar.add(edit);
            menuBar.add(help);
            return menuBar;
        }
    }