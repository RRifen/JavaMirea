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

public class GUI extends JFrame {
    IDocument document;
    ICreateDocument creator;
    JTextField upper;

    JTextArea mainArea = new JTextArea();
    public GUI(ICreateDocument creator) {
        super("GUI");
        this.creator = creator;
        document = creator.createOpen();

        JMenu file = new JMenu("File");

        JMenuItem newMenu = new JMenuItem("New");
        document = creator.createNew();
        document.doAction(newMenu, mainArea);

        JMenuItem openMenu = new JMenuItem("Open");
        document = creator.createOpen();
        document.doAction(openMenu, mainArea);

        JMenuItem saveMenu = new JMenuItem("Save");
        document.saveFile(saveMenu, mainArea);

        JMenuItem exitMenu = new JMenuItem("Exit");
        exitMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        file.add(newMenu);
        file.add(openMenu);
        file.add(saveMenu);
        file.add(exitMenu);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file);
        setJMenuBar(menuBar);

        JScrollPane jp = new JScrollPane(mainArea);
        add(jp, BorderLayout.CENTER);
        upper = document.getUpper();
        add(upper, BorderLayout.NORTH);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }
}
