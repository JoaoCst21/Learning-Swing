package main.flowlayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 40, 30));
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 300));
        panel.setBackground(Color.yellow);
//        panel.setLayout(new FlowLayout()); // Default
//        panel.setVisible(true);

        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("Hello im " + i));
        }

        frame.add(panel);

    }
}
