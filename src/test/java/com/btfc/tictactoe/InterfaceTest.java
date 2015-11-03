//This is a test TDD class for Interface.java
package com.btfc.test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import com.btfc.tictactoe.*;

public class InterfaceTest
{
    @Test
    public void testPrintMenu()
    {
        Interface i = new Interface();
        i.printMenu();
        assertEquals("Welcome to Tic Tac Toe\n----------------------\n1. For new game\n2. To exit game\n----------------------\n", outContent.toString());
    }

    @Test
    public void testInvalidMove()
    {
        Interface i = new Interface();
        i.invalidMove();
        assertEquals("Invalid move", outContent.toString());
    }

    @Test
    public void testPlayerWins()
    {
        Interface i = new Interface();
        i.playerWins("Guest");
        assertEquals("Guest wins!", outContent.toString());
    }
	
    @Test
    public void testEnterPlayerName()
    {
        try 
        {
            ByteArrayInputStream in = new ByteArrayInputStream("test1\n".getBytes());
            System.setIn(in);
            Interface i = new Interface();
            String test = i.enterPlayerName();
            assertEquals("test1", test );
        }
        catch(IOException e)
        {
            System.err.println("Caught IOException: "); 
            //ehh
        }
    }
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() 
    {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void cleanUpStreams() 
    {
        System.setOut(null);
        System.setErr(null);
    }
}
