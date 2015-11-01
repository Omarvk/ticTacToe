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

    @Test
    public void testFieldHasChangedWhenMoveIsMade(){
	
	ByteArrayInputStream in = new ByteArrayInputStream("1, 2".getBytes());
	System.setIn(in);

	Board b = new Board();
	TicTacLogic game = new TicTacLogic();
	game.playRound();
	//game.board.field =
	    //  for(int i = 0; i < game.getYDimension(); i++) 
        assertFalse(Arrays.equals(b.getField(), game.board.getField()));
	System.setIn(System.in);
			

    }






}
