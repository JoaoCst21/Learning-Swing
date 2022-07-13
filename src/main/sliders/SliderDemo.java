package main.sliders;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.awt.Font;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    SliderDemo() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);
        slider.setPreferredSize(new Dimension(400, 200));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true); // default
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Consolas", Font.TRUETYPE_FONT, 20));

        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);


        label.setFont(new Font("Consolas", Font.LAYOUT_RIGHT_TO_LEFT, 40));
        label.setText("*C = " + slider.getValue());


        panel.add(slider);
        panel.add(label);
        frame.add(panel);

        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("*C = " + slider.getValue());
    }
}
