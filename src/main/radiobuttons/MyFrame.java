package main.radiobuttons;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();

        pizzaButton = new JRadioButton("Pizza");
        hamburgerButton = new JRadioButton("Hamburger");
        hotDogButton = new JRadioButton("Hot dog");


        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        add(pizzaButton);
        add(hamburgerButton);
        add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) System.out.println("You order Pizza");
        if (e.getSource() == hamburgerButton) System.out.println("You order Hamburger");
        if (e.getSource() == hotDogButton) System.out.println("You order Hot Dog");
    }
}
