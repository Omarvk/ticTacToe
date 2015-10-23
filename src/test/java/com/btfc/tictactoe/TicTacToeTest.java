package com.btfc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.btfc.tictactoe.*;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

public class TicTacToeTest {

    @Test
    public void testInitializeField()
    {
        //Redirect output to a stream we can easily access
	//Full credit to SO user Plant Thelda for this http://stackoverflow.com/questions/19322345/how-do-i-change-the-default-index-page-in-apache
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	System.setOut(new PrintStream(outContent));
	//Initialize a empty game
        TicTacToe game = new TicTacToe();
	game.initializeField(); 
	game.printField();
	//Assert that we have successfully created a empty playing field
	assertEquals(" | | \n-----\n | | \n-----\n | | \n", outContent.toString());
	//Clear the output, this is apparantly neccessary
	System.setOut(null);
    }
}
