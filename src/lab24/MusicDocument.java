package lab24;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.sql.SQLOutput;

public class MusicDocument implements IDocument {
    String type;
    public MusicDocument(String type) {
        this.type = type;
    }
    @Override
    public void doAction(JMenuItem item, JTextArea mainArea) {
        if (type.equals("open")) {
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileFilter(new FileFilter() {
                        @Override
                        public boolean accept(File pathname) {
                            if (pathname.isDirectory()) {
                                return true;
                            } else {
                                String name = pathname.getName().toLowerCase();
                                if (name.endsWith(".mus")) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override
                        public String getDescription() {
                            return "MUSIC Files (*.mus)";
                        }
                    });
                    int dialog = fileChooser.showOpenDialog(null);
                    if (dialog == JFileChooser.APPROVE_OPTION) {
                        File selected = fileChooser.getSelectedFile();
                        try {
                            BufferedReader br = new BufferedReader(new FileReader(selected));
                            String st;
                            mainArea.setText("");
                            while ((st = br.readLine()) != null)
                                mainArea.append(st + "\n");
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "???? ?????????????? ?????????????? ?????????????????? ????????");
                        }
                    }
                }
            });
        } else if (type.equals("new")) {
            item.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mainArea.setText("");
                    JFileChooser fileChooser = new JFileChooser();
                    fileChooser.setFileFilter(new FileFilter() {
                        @Override
                        public boolean accept(File pathname) {
                            if (pathname.isDirectory()) {
                                return true;
                            } else {
                                String name = pathname.getName().toLowerCase();
                                if (name.endsWith(".mus")) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override
                        public String getDescription() {
                            return "MUSIC Files (*.mus)";
                        }
                    });
                    int dialog = fileChooser.showSaveDialog(null);
                    if (dialog == JFileChooser.APPROVE_OPTION) {
                        File selected = new File(fileChooser.getSelectedFile().getAbsoluteFile() + ".mus");
                        try {
                            boolean flag = selected.createNewFile();
                            if (!flag) {
                                int choice = JOptionPane.showConfirmDialog(null, "???? ?????????????????????????? ???????????? ???????????????????????? ?????????", "Rewrite", JOptionPane.YES_NO_OPTION);
                                System.out.println(choice);
                                if (choice == 0) {
                                    FileOutputStream fooStream = new FileOutputStream(selected, false);
                                    byte[] myBytes = mainArea.getText().getBytes();
                                    fooStream.write(myBytes);
                                    fooStream.close();
                                }
                            } else {
                                FileOutputStream fooStream = new FileOutputStream(selected, true);
                                byte[] myBytes = mainArea.getText().getBytes();
                                fooStream.write(myBytes);
                                fooStream.close();
                            }
                        } catch (Exception ignored) {

                        }
                    }
                }
            });
        }

    }

    @Override
    public void saveFile(JMenuItem item, JTextArea mainArea) {
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new FileFilter() {
                    @Override
                    public boolean accept(File pathname) {
                        if (pathname.isDirectory()) {
                            return true;
                        } else {
                            String name = pathname.getName().toLowerCase();
                            if (name.endsWith(".mus")) {
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override
                    public String getDescription() {
                        return "MUSIC Files (*.mus)";
                    }
                });
                int dialog = fileChooser.showSaveDialog(null);
                if (dialog == JFileChooser.APPROVE_OPTION) {
                    File selected = fileChooser.getSelectedFile();
                    try {
                        boolean flag = selected.createNewFile();
                        if (!flag) {
                            int choice = JOptionPane.showConfirmDialog(null, "???? ?????????????????????????? ???????????? ???????????????????????? ?????????", "Rewrite", JOptionPane.YES_NO_OPTION);
                            System.out.println(choice);
                            if (choice == 0) {
                                FileOutputStream fooStream = new FileOutputStream(selected, false);
                                byte[] myBytes = mainArea.getText().getBytes();
                                fooStream.write(myBytes);
                                fooStream.close();
                            }
                        } else {
                            FileOutputStream fooStream = new FileOutputStream(selected, true);
                            byte[] myBytes = mainArea.getText().getBytes();
                            fooStream.write(myBytes);
                            fooStream.close();
                        }
                    } catch (Exception ignored) {

                    }
                }
            }
        });
    }

    @Override
    public JTextField getUpper() {
        JTextField upper = new JTextField("Music Document");
        upper.setEditable(false);
        upper.setBackground(Color.PINK);
        return upper;
    }
}
