package com.btfc.tictactoe;
import java.awt.Point;

public class TicTacToeService {

	Board board = new Board();
	public Board getBoard (){
		return board;
	}
	public Board setBoard(int x, int y){
		board.setSymbol(x, y, 1);
		return board;
	}


}
