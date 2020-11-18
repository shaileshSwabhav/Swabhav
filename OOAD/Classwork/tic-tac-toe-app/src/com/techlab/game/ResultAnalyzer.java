package com.techlab.game;

public class ResultAnalyzer {

	private Board board;
	private Result result = Result.INPROGRESS;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public String checkWinner() {

		if (board.isBoardFull())
			return Result.DRAW.toString();
		if (checkRow().equals(Result.WIN))
			return Result.WIN.toString();
		if (checkColumn().equals(Result.WIN))
			return Result.WIN.toString();
		if (checkDiagonal().equals(Result.WIN))
			return Result.WIN.toString();

		return result.toString();
	}

	public Result checkRow() {

		int j = 0, resultCount = 1;
		Result result = Result.INPROGRESS;

		for (int i = 1; i < board.getBoard().length; i++) {

			if (!board.getBoard()[j].equals("-") && board.getBoard()[j].equals(board.getBoard()[i])) {

				if (++resultCount == board.getSize()) {
					result = Result.WIN;
					break;
				}
			} else {
				i = j + board.getSize();
				j = j + board.getSize();
				result = Result.INPROGRESS;
			}
		}

		return result;
	}

	public Result checkColumn() {

		int j = 0, resultCount = 1;
		Result result = Result.INPROGRESS;

		for (int i = board.getSize(); j < (board.getBoard().length / board.getSize()); i += board.getSize()) {

			if (!board.getBoard()[j].equals("-") && board.getBoard()[j].equals(board.getBoard()[i])) {

				if (++resultCount == board.getSize()) {
					result = Result.WIN;
					break;
				}

			} else {

				j++;
				i = j;
				result = Result.INPROGRESS;

			}
		}

		return result;
	}

	public Result checkDiagonal() {

		int j = 0, resultCount = 1;
		boolean resultFound = false;
		Result result = Result.INPROGRESS;

		for (int i = (board.getSize() + 1); i < board.getBoard().length; i += (board.getSize() + 1)) {

			if (!board.getBoard()[j].equals("-") && board.getBoard()[j].equals(board.getBoard()[i])) {
				if (++resultCount == board.getSize()) {
					result = Result.WIN;
					resultFound = true;
					break;
				}
			} else {
				resultCount = 1;
				break;
			}
		}
		
		j = board.getSize() - 1;
		
		for (int i = (j * 2) ; i < board.getBoard().length - j;  i += j) {
			
			if (resultFound) {
				break;
			}
			if (!board.getBoard()[j].equals("-") && board.getBoard()[j].equals(board.getBoard()[i])) {
				if(++resultCount == board.getSize()) {
					 result = Result.WIN;
					 break;
				 }
			}
		}

		return result;
	}
}
