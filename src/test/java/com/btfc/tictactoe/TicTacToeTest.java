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
	//NOTE: This is dirty but inserting the same filling algorithm here seems dum
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
        final int X = 88;
        final int Y = 79;
	final int E = 32; //shorthand for empty 
        TicTacToe game = new TicTacToe();
	//create a bunch of scenarios
	int[][] wonGame1 = {{X,X,X}, {E,E,E}, {E,E,E}};
	int[][] wonGame2 = {{X,E,X}, {Y,X,Y}, {X,E,E}};
	int[][] wonGame3 = {{X,X,X}, {E,X,E}, {Y,Y,Y}};
	int[][] notWonGame1 = {{E,E,E}, {E,E,E}, {E,E,E}};
	int[][] notWonGame2 = {{E,X,E}, {X,E,X}, {E,X,E}};
	int[][] notWonGame3 = {{X,Y,X}, {X,Y,Y}, {Y,X,Y}};
	//set the game field to our scenarios and ensure we are getting the right results
	game.setField(wonGame1);
	assertEquals(true, game.isGameWon());
	game.setField(wonGame2);
	assertEquals(true, game.isGameWon());
	game.setField(wonGame2);
	assertEquals(true, game.isGameWon());
	game.setField(notWonGame1);
	assertEquals(false, game.isGameWon());
	game.setField(notWonGame3);
	assertEquals(false, game.isGameWon());
	game.setField(notWonGame3);
	assertEquals(false, game.isGameWon());
    }
}
