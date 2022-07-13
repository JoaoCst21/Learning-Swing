package main.opennewwindow;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello");
    NewWindow() {
        label.setBounds(0, 0, 100, 50);
        label.setFont(new Font(null, Font.PLAIN, 25));
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
