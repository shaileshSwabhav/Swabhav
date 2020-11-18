package com.techlab.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame {
	
	private JLabel l1, l2, l3, l4, l5, l6, l7;
	private JTextField t1, t2, t3;
	private JComboBox c1, c2;
	private JRadioButton r1, r2;
	private JButton b;

	
	public void registrationPage() {
		
		l1 = new JLabel("First Name:");
		l2 = new JLabel("Last Name:");
		l3 = new JLabel("Age:");
		l4 = new JLabel("Gender:");
		l5 = new JLabel("Select Course:");
		l6 = new JLabel("Organization:");
		l7 = new JLabel();
		
		l1.setBounds(10, 10, 70, 20);
		l2.setBounds(10, 30, 70, 20);
		l3.setBounds(10, 50, 50, 20);
		l4.setBounds(10, 70, 70, 20);
		l5.setBounds(10, 90, 120, 20);
		l6.setBounds(10, 110, 120, 20);
		l7.setBounds(10, 160, 3000, 20);
		
		
		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		l4.setForeground(Color.blue);
		l5.setForeground(Color.blue);
		l6.setForeground(Color.blue);

		t1 = new JTextField(25);
		t2 = new JTextField(25);
		t3 = new JTextField(25);
		
		t1.setBounds(85, 10, 350, 20);
		t2.setBounds(85, 30, 350, 20);
		t3.setBounds(90, 110, 350, 20);
		
		String age[] = {"18", "19", "20", "21", "22", "23", "24", "25"}; 
		c1 = new JComboBox(age);
		c1.setBounds(45, 50, 50, 20);
		
		r1 = new JRadioButton("Male");
		r2 = new JRadioButton("Female");
		
		r1.setBounds(60, 70, 60, 20);
		r2.setBounds(140, 70, 70, 20);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		
		String courses[] = {"CoreJava", "JavaScript", "GoLang"};
		c2 = new JComboBox(courses);
		c2.setBounds(110, 90, 120, 18);
		
		b = new JButton("Submit");
		b.setBounds(100, 135, 100, 20);
		
		add(l1);
		add(t1);
		
		add(l2);
		add(t2);
		
		add(l3);
		add(c1);
		
		add(l4);
		add(r1);
		add(r2);
		
		add(l5);
		add(c2);
		
		add(l6);
		add(t3);
		
		add(b);
		add(l7);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = "Registration Successful...Welcome to ";
				text += t3.getText();
				l7.setText(text);
				add(l7);
				
			}
		});
		
		
		setLayout(null);
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
}
