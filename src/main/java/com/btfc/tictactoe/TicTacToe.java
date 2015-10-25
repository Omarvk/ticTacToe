package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.awt.Point;

import com.btfc.tictactoe.HumanPlayer;

/*
Creates a TicTacToe Game
The playing field array is interperted like the following diagram
2 | |
 -----
1 | |
 -----
0 | |
 0 1 2
*/

public class TicTacToe
{
    //constants
    static final int XDIMENSION = 3;
    static final int YDIMENSION = 3;
    static final int X = 88;
    static final int O = 79;
    static final int EMPTY = 32;
    HumanPlayer player1;
    HumanPlayer player2;

    public TicTacToe()
    {
        player1 = new HumanPlayer(); 
        player2 = new HumanPlayer(); 
    }
    //variables
    private int[][] field = new int[XDIMENSION][YDIMENSION];

    //Play a single game of TicTacToe
    public void playRound()
    {
        initializeField();
	Point move;
	int symbol = 0;
	//make moves while the field is not full or either player won
	for(int i = 0; i < XDIMENSION * YDIMENSION; i++)
	{
	    while(true){
		this.printField();
	        //let the players make their move
		if(i % 2 == 0)
		{
		    move = player1.makeMove(); 
		    symbol = X;
		}	
		else
		{
		    move = player2.makeMove(); 
		    symbol = O;
		}	
		//check if the move is within the bounds of our array
		if(move.x >= XDIMENSION || move.x < 0 || move.y >= YDIMENSION || move.y < 0 )
		{
		   System.out.println("Invalid move");
		   continue;
		}
		//check if the chosen field is empty
		else if(field[move.x][move.y] == EMPTY)
		{
		    field[move.x][move.y] = symbol;
		    break;
		}
		else //if it's not, let the same player choose again
		{
		   System.out.println("Invalid move");
	           continue;	
		}
	    }
	    if(isGameWon())
	    {
		this.printField();
		if(symbol == X)
		{
		    //NOTE: this needs to be replaced with player specific stuff
		    System.out.println("Player1 wins!");
		    return;	
		} 
		else
		{
		    //NOTE: this needs to be replaced with player specific stuff
		    System.out.println("Player2 wins!");
		    return;	
		}
	    }
	}
    }

    //set the whole playing field to EMPTY 
    public void initializeField()
    {
        for(int i = 0; i < XDIMENSION; i++)
	{
	    for(int j = 0; j < YDIMENSION; j++)
	    {
	        field[i][j] = EMPTY; 
	    }
	}
        return; 
    }

    //Checks if either player has won the game
    //This is hardcoded to a 3x3 playing field and will have to be remade if that is to be changed
    public boolean isGameWon()
    {
        //check the diagonal lines
        if(field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] == field[2][2] && field[0][0] != EMPTY)
	{
            return true;	
	}
        if(field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] == field[2][0] && field[1][1] != EMPTY)
	{
            return true;	
	}
	//check the horizontal and vertical lines
	for(int i = 0; i < XDIMENSION; i++)
	{
	    if(field[0][i] == field[1][i] && field[0][i] == field[2][i] && field[2][i] == field[1][i] && field[0][i] != EMPTY)
	    {
	       return true; 
	    }
	    if(field[i][0] == field[i][1] && field[i][0] == field[i][2] && field[i][2] == field[i][1] && field[i][0] != EMPTY)
	    {
	       return true; 
	    }
	}
        return false;  
    }

    public int getXDimension()
    {
        return XDIMENSION; 
    }

    public int getYDimension()
    {
        return YDIMENSION; 
    }

    public int[][] getField()
    {
        return field; 
    }

    public void setField(int[][] field)
    {
        this.field = field; 
	return;
    }

    //Print the playing field to console
    public void printField()
    {
        for(int i = YDIMENSION - 1; i >= 0; i--)
	{
	    for(int j = 0; j < XDIMENSION; j++)
	    {
		System.out.printf("%c", field[j][i]); 
		//don't print this when we are to the right of the table
	        if(j != XDIMENSION - 1) 
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

    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
	game.initializeField();
	game.playRound();
	game.printField();
	return;
    }
}
