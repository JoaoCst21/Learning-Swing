package main.panels;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class Main {

    public static void main(String[] args) {
        JLabel label = new JLabel("Hi!");
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set Font
        label.setBounds(0, 0, 100, 100);

        JPanel redPanel = new JPanel();
        redPanel.setLayout(null);
        redPanel.setBackground(Color.red);
        redPanel.setBounds(100, 100, 400, 300);
        redPanel.add(label);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(10, 500, 300, 200);
        bluePanel.add(label); // you cant pass an Object to two different containers

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(300, 400, 200, 200);
//        greenPanel.setLayout(new BorderLayout());
        greenPanel.add(label);

        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        frame.setVisible(true);
    }
}