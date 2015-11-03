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
    public void testFieldHasChangedWhenMoveIsMade()
    {
	TicTacLogic game = new TicTacLogic();
	TicTacLogic game2 = new TicTacLogic();
	
	//Put points in
	game.makeMove(0,0); 
	assertFalse(Arrays.deepEquals(game2.board.getField(), game.board.getField()));    
    }
     @Test
     public void testFieldHasNotChangedWhenMoveIsMadeOnTheSameCoordinates()
    {
        TicTacLogic game = new TicTacLogic();
	TicTacLogic game2 = new TicTacLogic();

        //Put same points in twice 
	game2.makeMove(1,1);

        game.makeMove(1,1);
	game.makeMove(1,1);
	//System.println(game.board.getField();
	//Test that field has not changed.
        assertTrue(Arrays.deepEquals(game2.board.getField(), game.board.getField()));
    }

    @Test
    public void testIsGameWonHorizontalFirstLine()
    {
	final int X = 88;
	final int Y = 79;
	final int E = 32; //shorthand for empty                                                        
	TicTacLogic game = new TicTacLogic();
	int[][] wonGame1 = {{X,X,X}, {E,E,E}, {E,E,E}};  
	game.board.setField(wonGame1);
	assertEquals(true, game.isGameWon());
	
	   
    }
    @Test
    public void testIsGameWonHorizontalSecLine()
    {   
	final int X = 88;
	final int Y = 79;
	final int E = 32; //shorthand for empty    
	TicTacLogic game = new TicTacLogic();
	int[][] wonGame2 = {{E,E,E}, {X,X,X}, {E,E,E}};
	game.board.setField(wonGame2);
	assertEquals(true, game.isGameWon());
    }
    @Test
    public void testIsGameWonHorizontalThirdLine()
    {   
	final int X = 88;
	final int Y = 79;
	final int E = 32; //shorthand for empty   
	TicTacLogic game = new TicTacLogic(); 
	int[][] wonGame3 = {{E,E,E}, {E,E,E}, {X,X,X}};
	game.board.setField(wonGame3);
	assertEquals(true, game.isGameWon());
    }
    @Test
    public void testIsGameWonDiagonalNegativeSlope()
    {
	final int X = 88;
	final int Y = 79;
	final int E = 32; //shorthand for empty    
	TicTacLogic game = new TicTacLogic();
	int[][] wonGame1 = {{X,E,E}, {E,X,E}, {E,E,X}};
	
	game.board.setField(wonGame1);
	assertEquals(true, game.isGameWon());
	

    }
    @Test
    public void testIsGameWonDiagonalPositiveSlope()
    {
	final int X = 88;
	final int Y = 79;
	final int E = 32; //shorthand for emptO   
	TicTacLogic game = new TicTacLogic(); 
	int[][] wonGame2 = {{E,E,X}, {E,X,E}, {X,E,E}};
	game.board.setField(wonGame2);
	assertEquals(true, game.isGameWon());
    }

    @Test
    public void testNotWonGameAllEmpty()
    {
	final int X = 88;
	final int O = 79;
	final int E = 32; //shorthand for empty                                                        
	TicTacLogic game = new TicTacLogic();
	//create a bunch of scenarios                                                                  
	
	int[][] notWonGame1 = {{E,E,E}, {E,E,E}, {E,E,E}};
	
	//set the game field to our scenarios and ensure we are getting the right results              
	game.board.setField(notWonGame1);
	assertEquals(false, game.isGameWon());
	   
    }

    @Test
    public void testNotWonGameXShape()
    {

	final int X = 88;
	final int O = 79;
	final int E = 32; //shorthand for empty                                                        
	TicTacLogic game = new TicTacLogic();
	int[][] notWonGame = {{E,X,E}, {X,E,X}, {E,X,E}};
	game.board.setField(notWonGame);
	assertEquals(false, game.isGameWon());
	
    }
    @Test
    public void testNotWonGameThree()
    {
	final int X = 88;
	final int O = 79;
	final int E = 32; //shorthand for empty                                                        
	TicTacLogic game = new TicTacLogic();
	int[][] notWonGame3 = {{X,O,X}, {X,O,O}, {O,X,O}};
	game.board.setField(notWonGame3);
	assertEquals(false, game.isGameWon());
	
    }






}
