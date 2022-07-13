package main.opennewwindow;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LaunchPage {
    JFrame frame = new JFrame();
    JButton button = new JButton("New Window");
    LaunchPage() {
        button.setBounds(100, 160, 200, 40);
        button.setFocusable(false);
        button.addActionListener(e -> {
            if (e.getSource() == button) {
                frame.dispose();
                NewWindow window = new NewWindow();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
