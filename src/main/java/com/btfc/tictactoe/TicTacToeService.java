
package com.btfc.tictactoe;
import java.awt.Point;

public class TicTacToeService {

	public Board getBoard (Board board){
		return board;
	}
	public Board setBoard(Board board, Point move){
		board.setSymbol(move, 1);
		return board;
	}


}
