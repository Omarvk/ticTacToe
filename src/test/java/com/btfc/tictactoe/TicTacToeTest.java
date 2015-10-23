package com.btfc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.btfc.tictactoe.*;

public class TicTacToeTest {

    @Test
    public void testInitializeField()
    {
        TicTacToe game = new TicTacToe();
	int[][] emptyArray = new int[game.XDIMENSION][game.YDIMENSION];
	game.initializeField();
    }
}
