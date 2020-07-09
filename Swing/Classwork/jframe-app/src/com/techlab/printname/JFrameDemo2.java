package com.techlab.printname;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameDemo2 extends JFrame{
	
	public JFrameDemo2() {
		
		JButton b = new JButton("Shailesh");
		
		add(b);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}
