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

    public void printField()
    {
        for(int i = 0; i < XDIMENSION; i++)
	{
	    for(int j = 0; j < YDIMENSION; j++)
	    {
	        if(j != (YDIMENSION - 1))
		{
		    System.out.printf("%c|", field[i][j]); 
		}
	    }
	    System.out.println();
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
