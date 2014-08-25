package com.Mohax.Frame;
import java.awt.*;
import java.awt.event.*;

import com.Mohax.Utils.*;
import com.Mohax.Encoder.*;

import javax.swing.*;

import com.Mohax.main.*;
public class Frame extends JFrame {
JTextField field = new JTextField("enter a string");
JTextField field2 = new JTextField();
Action act = new AbstractAction(){
	public void actionPerformed(ActionEvent e){
		AlphabetSwitcher.AlphaS(Encoder.cutter(field.getText()));
		Main.Lo();
		label.setText(Main.g);
	}

};
JLabel label = new JLabel("Your code");
public Frame(){
super();
this.setLayout(new BorderLayout());
this.setVisible(true);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setSize(500, 150);

this.add(field, BorderLayout.PAGE_START);

JButton button = new JButton();
button.setAction(act);
this.add(button, BorderLayout.LINE_END);

JButton button2 = new JButton();
this.add(button2, BorderLayout.LINE_START);

this.add(label, BorderLayout.CENTER);
}
}
