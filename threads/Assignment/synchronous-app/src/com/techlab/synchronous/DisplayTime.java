package com.techlab.synchronous;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DisplayTime extends JFrame implements ActionListener {

	private JButton d1, d2;

	public void createFrame() {
		d1 = new JButton();
		d2 = new JButton();

		d1.setText("Display Time");
		d2.setText("Hello");

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

			while (true) {
				SimpleDateFormat sd = new SimpleDateFormat("HH:mm:ss");
				Date d = new Date();
				System.out.println(sd.format(d));
			}

		} else if (e.getSource() == d2) {
			JOptionPane.showMessageDialog(this, "Hello!!!!");
		}
	}

}
