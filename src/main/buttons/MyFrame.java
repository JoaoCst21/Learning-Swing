package main.buttons;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;
    MyFrame() {
        JLabel label = new JLabel("Joao");
        label.setBounds(150, 250, 100, 100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 400, 500);
        button.addActionListener(e -> {
            System.out.println("Hola");
            button.setEnabled(false);
            label.setVisible(true);
        });
        ImageIcon imageButton = new ImageIcon(getClass().getResource("../../resources/pum.png"));
        button.setText("Im a Button");
        button.setIcon(imageButton);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(700, 600);
        setVisible(true);
        add(button);
        add(label);

    }
}
