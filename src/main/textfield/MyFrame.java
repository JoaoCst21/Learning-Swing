package main.textfield;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class MyFrame extends JFrame {
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        JButton submit = new JButton("Submit");
        submit.addActionListener(e -> {
            if (e.getSource() == submit) {
                System.out.println(textField.getText());
//                textField.setEditable(false);
                textField.setEnabled(false);
                submit.setEnabled(false);
            }
        });

        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.black);
        textField.setBackground(Color.yellow);
        textField.setCaretColor(Color.blue);
        textField.setText("username");
        add(submit);
        add(textField);



        pack();
        setVisible(true);


    }
}
