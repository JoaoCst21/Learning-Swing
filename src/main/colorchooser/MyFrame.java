package main.colorchooser;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        button = new JButton("Im a Button");
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("This is some text");
        label.setFont(new Font("Consolas", Font.BOLD, 20));

        button.addActionListener(this);
        add(button);
        add(label);
        label.setOpaque(true);



        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color... i guess", Color.black);
            label.setBackground(color);
        }
    }
}
