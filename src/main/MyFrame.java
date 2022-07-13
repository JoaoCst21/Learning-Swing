package main;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

public class MyFrame extends JFrame {

    MyFrame() {
        setTitle("JFrame title goes here");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what You probably always want

//        setResizable(false); // prevent frame from being resized;
//        setSize(700, 500); // sets the x-dimension, and y-dimension (width and height)
        ImageIcon logo = createImageIcon("../resources/dice-1.png", "relative path");
        Border border = BorderFactory.createLineBorder(Color.green, 3);
        setIconImage(logo.getImage()); // change Icon of frame
//        setLayout(null);

        JLabel label = new JLabel("Doouuu");
        add(label);
        label.setIcon(createImageIcon("../resources/dice-1.png", "labelIcon"));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.green); // set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); // set Font
        label.setIconTextGap(-30);

        label.setBackground(Color.black);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0, 0, 250, 250);
        getContentPane().setBackground(new Color(0, 30, 100)); // create Custom Color, Hexadecimal are valid tools
        pack();
        setVisible(true); // make frame visible ALWAYS TO THE END
    }

    protected ImageIcon createImageIcon(String path, String description) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
}