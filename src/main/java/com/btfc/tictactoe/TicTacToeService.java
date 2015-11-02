
package com.btfc.tictactoe;
import java.awt.Point;

public class TicTacToeService {

	Board board = new Board();
	public Board getBoard (){
		return board;
	}
	public Board setBoard(Point move){
		board.setSymbol(move, 1);
		return board;
	}


}
