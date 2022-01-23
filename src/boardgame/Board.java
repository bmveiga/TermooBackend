package boardgame;

import words.Letters;

public class Board {

	private Integer rows;
	private Integer columns;
	private Letters[][] letters;

	public Board(Integer rows, Integer columns) {
		if(rows < 1 || columns <1) {
			throw new BoardException("Error, there must be at least more than 1 position in the board!");
		}
		this.rows = rows;
		this.columns = columns;
		letters = new Letters[rows][columns];
	}

	public Integer getRows() {
		return rows;
	}

	public Integer getColumns() {
		return columns;
	}

}
