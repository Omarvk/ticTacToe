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

    public void printField()
    {//THIS IS ALL GOING TO CHANGE FoR new Interface.                                                                                  
	for(int i = board.YDIMENSION - 1; i >= 0; i--)
	{
	    for(int j = 0; j < board.XDIMENSION; j++)
	    {
		System.out.printf("%c", board.getField()[j][i]);
		//don't print this when we are to the right of the table                                            
		if(j != board.XDIMENSION - 1)
		{
		    System.out.printf("|");
		}
	    }
	    System.out.println();
	    //don't print this when we are below the table                                                          
	    if(i != 0)
	    {
		System.out.println("-----");
	    }
	}
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
		    else //if it's not, let the same player choose again                                   
		    {
			tService.invalidMove();
			continue;
		    }
		}

		if(isGameWon())
		{
		    this.printField();
		    if(symbol == board.X)
		    {
			
			tService.playerWins(this.player1.getName());
			return;
		    }
		    else
		   {
		       
		       tService.playerWins(this.player2.getName());
		       return;
	    	  }
	        }
        }
    }
    public boolean isGameWon()
   {
       //check the diagonal lines                                                                     
       if(board.getField()[0][0] == board.getField()[1][1] && board.getField()[1][1] == board.getField()[2][2] && board.getField()[0][0] == board.getField()[2][2] && board.getField()[0][0] != board.EMPTY)
       {
	   return true;
       }
       if(board.getField()[0][2] == board.getField()[1][1] && board.getField()[1][1] == board.getField()[2][0] && board.getField()[0][2] == board.getField()[2][0] && board.getField()[1][1] != board.EMPTY)
       {
	   return true;
       }
       //check the horizontal and vertical lines                                                      
       for(int i = 0; i < board.XDIMENSION; i++)
       {
	   if(board.getField()[0][i] == board.getField()[1][i] && board.getField()[0][i] == board.getField()[2][i] && board.getField()[2][i] == board.getField()[1][i]  && board.getField()[0][i] != board.EMPTY)
	   {
	       return true;
	   }
	   if(board.getField()[i][0] == board.getField()[i][1] && board.getField()[i][0] == board.getField()[i][2] && board.getField()[i][2] == board.getField()[i][1]  && board.getField()[i][0] != board.EMPTY)
	   {
	       return true;
	   }
       }
       return false;
   }

    public static void main(String[] args)
    {
	TicTacToe game = new TicTacToe();
	game.initializeField();
	game.playRound();
	game.printField();
	return;
    }
}
