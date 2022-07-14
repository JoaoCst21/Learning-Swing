package main.keylistener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);
        addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);

        add(label);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        KeyTyped = invoked when a key is typed. Uses KeyChar, char output
        switch (e.getKeyChar()) {
            case 'a': label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w': label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's': label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd': label.setLocation(label.getX() + 10, label.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        KeyPressed = Invoked when a physical key is Pressed down. uses KeyCode, int output
        switch (e.getKeyCode()) {
            case 37: label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 39: label.setLocation(label.getX() + 10, label.getY());
                break;
            case 40: label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
//        KeyReleased = called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar()); // when unknown it gives "?" apparently
        System.out.println("You released key code: " + e.getKeyCode());
    }
}
