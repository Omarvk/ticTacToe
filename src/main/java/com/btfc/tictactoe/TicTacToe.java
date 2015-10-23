package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToe
{
    //constants
    static final int XDIMENSION = 3;
    static final int YDIMENSION = 3;
    static final int X = 1;
    static final int O = 2;

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
	        field[i][j] = 0; 
	    }
	}
        return; 
    }

    public static void main(String[] args)
    {
        TicTacToe game = new TicTacToe();
	return;
    }
}
