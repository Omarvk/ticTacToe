package com.btfc.tictactoe;

import com.btfc.tictactoe.*;
import java.awt.Point;



public class TicTacLogic{
    HumanPlayer player1;
    HumanPlayer player2;
    public Board board;
    int counter;
    boolean isGameOver;

    public TicTacLogic()
    {
	board = new Board();
        player1 = new HumanPlayer();
        player2 = new HumanPlayer();
	counter = 0;
	newGame();
    }

    public int getSymbol(int x, int y)
    {
        return board.getSymbol(x, y); 
    }

    //returns the result of the action as a string
    //returns a empty string upon success
    public String makeMove(int x, int y)
    {
	Player actingPlayer;
	//Take no action if the game is over
	if(isGameOver)
	{
	    return "Game is over";
	}
        //Check which players turn it is
        if(counter % 2 == 0)
	{
	    actingPlayer = player1;
	}
	else
	{
	    actingPlayer = player2;
	}
	counter++;
	//Check if the selected field is empty
        if(board.getSymbol(x, y) == ' ')
	{
            board.setSymbol(x, y, actingPlayer.getSymbol());
	    //check if someone has won the game
	    if(isGameWon())
	    {
	        isGameOver = true;
	        return actingPlayer.getName() + " won!";
	    }
	    //check if the game is drawn
	    if(counter == 9)
	    {
	        isGameOver = true;
	        return "Draw"; 
	    }
	    return "";
	}
	//the selected filed was not empty
	else
	{
	    counter--;
            return "Invalid move";	
	}
    }
    
    public void newGame()
    {
        board.initializeField();
	isGameOver = false;
	player1.setName("Player1");
	player2.setName("Player2");
	player1.setSymbol(1);
	player2.setSymbol(2);
	counter = 0;
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
}
