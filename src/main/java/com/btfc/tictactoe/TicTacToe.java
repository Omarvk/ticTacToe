package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
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
    public static final int XDIMENSION = 3;
    public static final int YDIMENSION = 3;
    static final int X = 88;
    static final int O = 79;
    static final int EMPTY = 32;

    //variables
    private int[][] field = new int[XDIMENSION][YDIMENSION];

    //Play a single game of TicTacToe
    public void playRound()
    {
        initializeField();
    }

    //set the whole playing field to 0
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
	}
	for(int i = 0; i < XDIMENSION; i++)
	{
	    if(field[i][0] == field[i][1] && field[i][0] == field[i][2] && field[i][2] == field[i][1] && field[i][0] != EMPTY)
	    {
	       return true; 
	    }
	}
        return false;  
    }

    //Print the playing field to console
    public void printField()
    {
        for(int i = 0; i < XDIMENSION; i++)
	{
	    for(int j = 0; j < YDIMENSION; j++)
	    {
		System.out.printf("%c", field[i][j]); 
		//don't print this when we are to the right of the table
	        if(j != (YDIMENSION - 1)) 
		{
		    System.out.printf("|");
		}
	    }
	    System.out.println();
	    //don't print this when we are below the table
	    if(i != (XDIMENSION - 1)) 
	    {
		System.out.println("-----");
	    }
	}
    }

    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
	game.initializeField();
	game.printField();
	return;
    }
}
