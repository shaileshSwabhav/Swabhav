package com.techlab.game;

public class ResultAnalyzer {

	private Board board;
	private Result result = Result.INPROGESS;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public boolean checkWinner() {

		if (checkRow().equals(Result.WIN))
			return true;
		if (checkColumn().equals(Result.WIN))
			return true;
		if (checkDiagonal().equals(Result.WIN))
			return true;

		return false;
	}

	public Result checkRow() {

		for (int i = 0; i < board.getBoard().length; i += 3) {
			if (!board.getBoard()[i].equals("-") && board.getBoard()[i].equals(board.getBoard()[i + 1])
					&& board.getBoard()[i].equals(board.getBoard()[i + 2])) {
				result = Result.WIN;
				break;
			}
		}

		return result;
	}

	public Result checkColumn() {

		for (int i = 0; i < (board.getBoard().length / 3); i++) {
			if (!board.getBoard()[i].equals("-") && board.getBoard()[i].equals(board.getBoard()[i + 3])
					&& board.getBoard()[i].equals(board.getBoard()[i + 6]))
				return Result.WIN;
		}

		return result;
	}

	public Result checkDiagonal() {

		if (!board.getBoard()[0].equals("-") && board.getBoard()[0].equals(board.getBoard()[4]) && board.getBoard()[0].equals(board.getBoard()[8]))
			return Result.WIN;
		if (!board.getBoard()[2].equals("-") && board.getBoard()[2].equals(board.getBoard()[4]) && board.getBoard()[2].equals(board.getBoard()[6]))
			return Result.WIN;

		return result;
	}
}
