package com.techlab.asynchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DisplayTime extends JFrame implements ActionListener, Runnable {

	private JButton d1, d2;
	Thread t1, t2;
	
	public DisplayTime() {
		t1 = new Thread(this);
	}
	
	public void createFrame() {
		d1 = new JButton("Display Time");
		d2 = new JButton("Hello");
		
		add(d1);
		add(d2);
		
		d1.addActionListener(this);
		d2.addActionListener(this);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == d1) {
			t1.start();

		} else if (e.getSource() == d2) {
			JOptionPane.showMessageDialog(this, "Hello!!!!");
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
			Date d = new Date();
			System.out.println(sd.format(d));
		}

	}


	
}
