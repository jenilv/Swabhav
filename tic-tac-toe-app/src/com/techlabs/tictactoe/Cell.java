package com.techlabs.tictactoe;

public class Cell {

	private Mark mark;

	public Cell() {
		mark = Mark.BLANK;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		this.mark = mark;
	}

}
