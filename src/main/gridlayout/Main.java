package main.gridlayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 10, 20));
        frame.setSize(500, 500);

        for (int i = 1; i <= 10; i++) {
            frame.add(new JButton("Im a Button Number " + i));
        }

        frame.setVisible(true);
    }
}
