package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
