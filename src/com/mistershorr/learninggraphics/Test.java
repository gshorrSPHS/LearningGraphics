package com.mistershorr.learninggraphics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gshorr on 5/5/17.
 */
public class Test {
    private JButton button1;
    private JButton button2;
    private JTextArea textArea2;
    private JTextArea textArea3;
    private JButton button3;
    private JButton button4;
    private JTextArea textArea4;
    private JTextArea textArea1;
    private JTextArea textArea5;
    private JPanel panel;
    private JButton button5;
    private JButton button6;
    private int hi = 0;

    public Test() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("" + hi++);
            }
        });
        button1.setText("");
        button1.setBackground(Color.BLACK);
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea2.setText(textArea2.getText() + "HI!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setContentPane(new Test().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
