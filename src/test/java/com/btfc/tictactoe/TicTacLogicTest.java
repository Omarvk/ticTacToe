package com.btfc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.btfc.tictactoe.*;
import java.util.Arrays;

import java.awt.Point;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class TicTacLogicTest{
    
    /**
    @Test OLD CONSOLE INTERFACE TEST
    public void testFieldHasChangedWhenMoveIsMade(){
	
	ByteArrayInputStream in = new ByteArrayInputStream("0, 0").getBytes());
	System.setIn(in);

	Board b = new Board();
	TicTacLogic game = new TicTacLogic();
	game.playRound();
	
        assertFalse(Arrays.equals(b.getField(), game.board.getField()));
		System.setIn(System.in);
			
    }
    **/
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
