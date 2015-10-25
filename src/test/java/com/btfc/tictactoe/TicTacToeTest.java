package com.btfc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.btfc.tictactoe.*;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

public class TicTacToeTest {

    @Test
    public void testInitializeField() throws Exception
    {
        TicTacToe game = new TicTacToe();
	int[][] gameField = new int[game.getXDimension()][game.getYDimension()];
	int[][] nonEmptyField = new int[game.getXDimension()][game.getYDimension()];
	int[][] emptyField = {{32, 32, 32}, {32, 32, 32}, {32, 32, 32}};
	//insert a couple of random characters into random positions in the array
	for(int i = 0; i < 10; i++)
	{
	    nonEmptyField[(int)(Math.random()*game.getXDimension())][(int)(Math.random()*game.getXDimension())] = (int)(Math.random() * 256);
	}
	//set the game field as the non-zero field, then zero it out and assert that it's actuall empty
	game.setField(nonEmptyField);
	game.initializeField();
        gameField = game.getField();	
	for(int i = 0; i < game.getYDimension(); i++)
	{
	    assertArrayEquals(emptyField[i], gameField[i]);
	}
    }

    @Test
    public void testIsGameWon()
    {
        //We can't actually perform moves yet  
	assertEquals(1, 1);
    }
}
