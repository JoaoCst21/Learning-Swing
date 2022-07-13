package main.joptionpane;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "this is some useless info", "useless", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "this is some useless info", "useless", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "this is some useless info", "useless", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "this is some useless info", "useless", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "this is some useless info", "useless", JOptionPane.ERROR_MESSAGE);

        JOptionPane.showInputDialog("What is your name?");
        System.out.println(JOptionPane.showConfirmDialog(null, "Are you sure", "Confirm Dialog", JOptionPane.YES_NO_CANCEL_OPTION));

        String[] responses = {"No, I Dont", "I can teach you bitch", "*c muere*"};

        JOptionPane.showOptionDialog(null, "Do you even code?", "annoying", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, responses, 0);
    }
}
