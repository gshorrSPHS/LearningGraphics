package com.mistershorr.learninggraphics;

import javax.swing.*;

/**
 * Created by gshorr on 5/5/17.
 */
public class Hangman {
    private JPanel panel1;
    private JTextField textField1;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hangman");
        frame.setContentPane(new Hangman().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
