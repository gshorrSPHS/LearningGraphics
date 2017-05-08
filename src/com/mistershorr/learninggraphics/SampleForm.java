package com.mistershorr.learninggraphics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gshorr on 5/8/17.
 */
public class SampleForm {
    private JTextField textField1;
    private JPanel panel1;
    private JButton button1;
    private JTextPane textPane1;

    public SampleForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = textField1.getText();
                String result = "";
                if(value != null){
                    for(int i = 0; i<10; i++)
                    {
                        result += value + "\n";
                    }
                }
                textPane1.setText(result);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SampleForm");
        frame.setContentPane(new SampleForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
