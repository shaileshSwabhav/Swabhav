package com.techlab.game;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class Game extends JFrame implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel player1, player2, player, instructions1, instructions2, instructions3, boardSize; 
	private JComboBox boardSizeCB;
	private JTextField t1, t2;
	private JButton submit;
	private JButton[] playBoard;
	private Board board;
	private ArrayList<Player> players;
	private ResultAnalyzer analyzer;
	private int CURRENT_PLAYER = 0;
	private static String name;

	public Game(Board board, ResultAnalyzer analyzer) {
		super("Tic-Tac-Toe");
		this.board = board;
		this.analyzer = analyzer;
		players = new ArrayList<Player>();

		player1 = new JLabel("Enter Player 1 Name: ");
		player2 = new JLabel("Enter Player 2 Name: ");
		boardSize = new JLabel("Enter Board Size: ");

		t1 = new JTextField();
		t2 = new JTextField();
		List<Integer> boardSizeList = new ArrayList<Integer>();
		for (int i = 2; i <= 5; ++i) {
			boardSizeList.add(i);
		}
		boardSizeCB = new JComboBox(boardSizeList.toArray());


		submit = new JButton("Start Game");

		player1.setBounds(20, 100, 200, 20);
		player2.setBounds(20, 140, 150, 20);
		boardSize.setBounds(20, 180, 100, 20);

		player1.setForeground(Color.blue);
		player2.setForeground(Color.blue);
		boardSize.setForeground(Color.blue);
		boardSizeCB.setBackground(Color.white);

		t1.setBounds(145, 100, 220, 20);
		t2.setBounds(145, 140, 220, 20);
		boardSizeCB.setBounds(125, 180, 100, 20);

		submit.setBounds(110, 220, 100, 20);

		add(player1);
		add(player2);
		add(t1);
		add(t2);
		add(boardSize);
		add(boardSizeCB);
		add(submit);

		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String player1Name = null, player2Name = null;
				player1Name = checkTextFields(t1);
				player2Name = checkTextFields(t2);

				int boardSize = (int) boardSizeCB.getSelectedItem();

				players.add(new Player(player1Name, Mark.X));
				players.add(new Player(player2Name, Mark.O));
				board.setBoardSize(boardSize);

				play();
				dispose();
			}
		});

		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static String checkTextFields(JTextField tf) {

		try {
			if (!tf.getText().equals("")) {
				name = tf.getText();
			} else {
				throw new EmptyTextException();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, new EmptyTextException());
		}

		return name;
	}

	
	public void play() {

		frame = new JFrame("Tic-Tac-Toe");
		panel = new JPanel();

		player = new JLabel();
		instructions1 = new JLabel();
		instructions2 = new JLabel();
		instructions3 = new JLabel();

		frame.setLayout(null);

		board.gameBoard();
		playBoard = board.getBoard();

		for (int i = 0; i < playBoard.length; i++) {

			panel.add(playBoard[i]);
			playBoard[i].addActionListener(this);

		}

		String inst1 = "Welcome To TIC-TAC-TOE.";
		String inst2 = getCurrentPlayer().getPlayerName() + " has mark " + getCurrentPlayer().getPlayerMark();
		changePlayer();
		String inst3 = getCurrentPlayer().getPlayerName() + " has mark " + getCurrentPlayer().getPlayerMark();
		changePlayer();

		instructions1.setText(inst1);
		instructions2.setText(inst2);
		instructions3.setText(inst3);

		instructions1.setBounds(15, 5, 400, 40);
		instructions2.setBounds(15, 20, 400, 40);
		instructions3.setBounds(15, 35, 400, 40);

		instructions1.setForeground(Color.blue);
		instructions2.setForeground(Color.blue);
		instructions3.setForeground(Color.blue);

		player.setText("It's " + getCurrentPlayer().getPlayerName() + "'s turn");
		player.setForeground(Color.red);
		player.setBounds(15, 50, 100, 40);

		frame.add(instructions1, JLabel.CENTER);
		frame.add(instructions2, JLabel.CENTER);
		frame.add(instructions3, JLabel.CENTER);
		frame.add(player, JLabel.CENTER);

		panel.setLayout(new GridLayout(board.getBoardSize(), board.getBoardSize()));
		panel.setBounds(40, 100, 250, 250);

		frame.add(panel);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		board.addMarkToCell(getCurrentPlayer().getPlayerMark(), (JButton) e.getSource());
		if (getStatus().equals("WIN")) {

			int output = JOptionPane.showConfirmDialog(frame,
					getCurrentPlayer().getPlayerName() + " is WINNER!!\nDo you want to continue?", "Game Over",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (output == JOptionPane.YES_OPTION) {
				frame.dispose();
				changePlayer();
				play();				
			} else if (output == JOptionPane.NO_OPTION) {
				frame.dispose();
			}

		} else if (getStatus().equals("DRAW")) {

			int output = JOptionPane.showConfirmDialog(frame,
					"It's a DRAW...\nDo you want to continue?", "Game Over",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (output == JOptionPane.YES_OPTION) {
				frame.dispose();
				changePlayer();
				play();
			} else if (output == JOptionPane.NO_OPTION) {
				frame.dispose();
			}

		}

		changePlayer();

		player.setText("It's " + getCurrentPlayer().getPlayerName() + " turn");
		player.setBounds(15, 50, 100, 40);
		player.setForeground(Color.red);
		frame.add(player, JLabel.CENTER);

	}

	public Player getCurrentPlayer() {

		return players.get(CURRENT_PLAYER);
	}

	public void changePlayer() {

		if (CURRENT_PLAYER == 0) {
			CURRENT_PLAYER++;
		} else {
			CURRENT_PLAYER--;
		}
	}

	public String getStatus() {
		return analyzer.checkWinner();
	}
}
