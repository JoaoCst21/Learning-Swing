package main.menubars;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame {
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File Menu");
        JMenu editMenu = new JMenu("Edit Menu");
        JMenu helpMenu = new JMenu("Help Menu");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("save");
        JMenuItem exitItem = new JMenuItem("exit");

        loadItem.addActionListener(e -> {
            if (e.getSource() == loadItem) System.out.println("You load a file");
        });

        saveItem.addActionListener(e -> {
            if (e.getSource() == saveItem) System.out.println("You save a file");
        });

        exitItem.addActionListener(e -> {
            if (e.getSource() == exitItem) System.out.println("You are exit");
        });

        fileMenu.setMnemonic(KeyEvent.VK_F);
        editMenu.setMnemonic(KeyEvent.VK_E);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_X);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
        setVisible(true);
    }
}
