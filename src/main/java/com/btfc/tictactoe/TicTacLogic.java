package com.btfc.tictactoe;

import com.btfc.tictactoe.*;
import java.awt.Point;



public class TicTacLogic{
    HumanPlayer player1;
    HumanPlayer player2;
    public Board board;
    public TService tService;
    public TicTacLogic()
    {
	board = new Board();
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
	tService = new TService();
    }

    public void printField(){

	


    }
    
    
    public void playRound()
    {
        board.initializeField();
        Point move;
        int symbol = 0;
        //make moves while the field is not full or either player won                                  
        for(int i = 0; i < board.XDIMENSION * board.YDIMENSION; i++)
	{
		while(true)
		{
		    this.printField();
		    //let the players make their move                                                      
		    if(i % 2 == 0)
		    {
			move = player1.makeMove();
			symbol = board.X;
		    }
		    else
		    {
			move = player2.makeMove();
			symbol = board.O;
		    }
		    //check if the move is within the bounds of our array  
		    if(move.x >= board.XDIMENSION || move.x < 0 || move.y >= board.YDIMENSION || move.y < 0 )
		    {
			tService.invalidMove();
			continue;
		    }
		    //check if the chosen field is empty                                                   
		    else if(board.getField()[move.x][move.y] == board.EMPTY)
		    {
			board.setSymbol(move,symbol);
			break;
		    }
		    
		}
        }
   }


}
