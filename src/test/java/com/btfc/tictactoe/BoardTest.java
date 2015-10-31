package com.btfc.test;

import com.btfc.tictactoe.Board;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardTest{

    @Test
    public void testSizeOfBoard(){
	
	Board board = new Board();
	assertEquals(9, board.getField().length*board.getField()[0].length);
    }
    @Test
    public void testDimensions(){
	
	Board board = new Board();
	assertEquals(3, (board.getYDimension()));
    }
    /**
    @Test
    public void setFieldTooBig(){
	Board board = new Board();
	board.getField[5][5] = 12;
	assertEquals(5, board.setField(board.getField()).length);
	
    }
    **/

}
