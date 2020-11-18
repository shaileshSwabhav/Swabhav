package com.techlab.game;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cell extends JFrame {

	Mark playerMark;
	
	public void setMark(Mark playerMark) {
		this.playerMark = playerMark;
	}

	public void addMark(JButton btn) throws CellAlreadyOccupiedException {
		
		if (!btn.getText().equals("-")) {
			throw new CellAlreadyOccupiedException();
		}
		btn.setFont(new Font("Arial", Font.BOLD, 25));
		btn.setText(playerMark.toString());
	}

}
