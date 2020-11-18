package com.techlab.game;

public class ResultAnalyzer {

	private Board board;
	private Result result = Result.INPROGRESS;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public String checkWinner() {


		if (checkRow().equals(Result.WIN))
			return Result.WIN.toString();
		if (checkColumn().equals(Result.WIN))
			return Result.WIN.toString();
		if (checkDiagonal().equals(Result.WIN))
			return Result.WIN.toString();
		if (board.isBoardFull())
			return Result.DRAW.toString();

		return result.toString();
	}

	public Result checkRow() {

		int j = 0, resultCount = 1;
		Result result = Result.INPROGRESS;

		for (int i = 1; i < board.getBoard().length; i++) {
			if (!board.getBoard()[j].getText().equals("-") && board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {

				if (++resultCount == board.getBoardSize()) {
					result = Result.WIN;
					break;
				}
			} else {
				i = j + board.getBoardSize();
				j = j + board.getBoardSize();
				resultCount = 1;
				result = Result.INPROGRESS;
			}
		}

		return result;
	}

	public Result checkColumn() {

		int j = 0, resultCount = 1;
		Result result = Result.INPROGRESS;

		for (int i = board.getBoardSize(); j < (board.getBoard().length / board.getBoardSize()); i += board.getBoardSize()) {
			if (!board.getBoard()[j].getText().equals("-") && board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = Result.WIN;
					break;
				}

			} else {

				j++;
				i = j;
				resultCount = 1;
				result = Result.INPROGRESS;

			}
		}

		return result;
	}

	public Result checkDiagonal() {

		int j = 0, resultCount = 1;
		boolean resultFound = false;
		Result result = Result.INPROGRESS;

		for (int i = (board.getBoardSize() + 1); i < board.getBoard().length; i += (board.getBoardSize() + 1)) {

			if (!board.getBoard()[j].getText().equals("-") && board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = Result.WIN;
					resultFound = true;
					break;
				}
			} else {
				resultCount = 1;
				break;
			}
		}

		j = board.getBoardSize() - 1;

		for (int i = (j * 2); i < board.getBoard().length - j; i += j) {

			if (resultFound) {
				break;
			}
			if (!board.getBoard()[j].getText().equals("-") && board.getBoard()[j].getText().equals(board.getBoard()[i].getText())) {
				if (++resultCount == board.getBoardSize()) {
					result = Result.WIN;
					break;
				}
			}
		}

		return result;
	}
}
