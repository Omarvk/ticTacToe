package com.btfc.tictactoe;

import java.awt.Point;

import com.btfc.tictactoe.Player;

public class HumanPlayer extends Player
{
    //This is a very lazy temporory implementation
    public Point makeMove()
    {
        int x = 0, y = 0; 
	try{
	System.out.println("Enter the x, y coordinates you want move to");
	x = (System.in.read() - 48);
	//clear out the comma and space
	System.in.read();
	System.in.read();
	y = (System.in.read() - 48);
	//remove trailing newline character
	System.in.read();
	System.out.println(x + ", " + y);
	}
	catch(Exception e)
	{
	    //heh
	}
	return new Point(x,y);
    }
}
