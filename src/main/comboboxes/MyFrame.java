package main.comboboxes;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"};
        JComboBox comboBox = new JComboBox(animals);

        comboBox.addActionListener(e -> {
            if (e.getSource() == comboBox) System.out.println(comboBox.getSelectedItem());
        });


//        comboBox.setEditable(true);
//        System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
//        comboBox.removeAllItems();
//        comboBox.removeItem("pig");
//        comboBox.removeItemAt(2);

        comboBox.setSelectedIndex(0); // IMPORTANT;
        add(comboBox);

        pack();
        setVisible(true);
    }
}
