package main.progressbar;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;

public class ProgressBarDemo {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    ProgressBarDemo() {
        bar.setBounds(10, 10, 400, 50);
        bar.setStringPainted(true); // default i think
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.LIGHT_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(bar);
        bar.setStringPainted(true);


        frame.setVisible(true);

        fill();
    }

    private void fill() {
        for (int i = 100; i >= 0; i-=1) {
            bar.setValue(i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        bar.setString("You Died :(");
    }
}
