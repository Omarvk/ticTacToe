package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public interface Player
{
        public void setName(String name);
       
	public String getName();

        public void setSymbol(int n);

	public void setScore(int n);
        
	public int getScore();

        public int getSymbol();
}
