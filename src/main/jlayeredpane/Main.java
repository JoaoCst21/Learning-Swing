package main.jlayeredpane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
//        JLayered Pane = Swing container that provides a
//        third dimension for positioning components
//        ex. depth, z-index
        JLayeredPane layeredPane = new JLayeredPane();
        for (int i = 0; i < 3; i++) {
            JLabel label = new JLabel("Hola");
            label.setBackground(new Color((0 + i) * 125, 40 * i, 60 * i));
            label.setOpaque(true);
            label.setBounds(50 * i, 50 * i, 100, 100);
            layeredPane.add(label);
        }


        JLabel label = new JLabel("PA PAPA");
        label.setBackground(Color.green);
        label.setOpaque(true); // to see Background
        label.setBounds(150, 150, 100, 100);
//        layeredPane.add(label, JLayeredPane.DRAG_LAYER);

//        layeredPane.add(label, 0); // This is nonsense, cuz while more lower number more to the top
        layeredPane.add(label, Integer.valueOf(1)); // better, cuz while bigger the number, is higher in the hierarchy (top)


        layeredPane.setBackground(Color.yellow);
        layeredPane.setBounds(10, 10, 590, 590);

        JFrame frame = new JFrame("JLayeredPane");
        frame.add(layeredPane); // it won't be visible until we add something to the layeredPane
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
