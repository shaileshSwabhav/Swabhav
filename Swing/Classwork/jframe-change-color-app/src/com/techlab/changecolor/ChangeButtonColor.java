package com.techlab.changecolor;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeButtonColor extends JFrame implements ActionListener {
	
	
	JButton b1;
	JButton b2;
	
	public ChangeButtonColor(){
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void changeButtonColor() {
		
		b1 = new JButton("Red");
		b2 = new JButton("Blue");
		
		add(b1);
		add(b2);
		
//		b1.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				b1.setBackground(Color.red);
//			}
//		});
		
		b1.addActionListener(this);
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b2.setBackground(Color.blue);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			b1.setBackground(Color.red);
		} else if(e.getSource() == b2) {
			b2.setBackground(Color.blue);
		}
	}

}
