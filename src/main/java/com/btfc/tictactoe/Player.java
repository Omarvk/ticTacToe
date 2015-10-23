package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Player
{
        String name;
        int playerScore;

        public void setName(String n)
        {
                name = n;
        }
        public String getName(String n)
        {
                return n;
        }

	public void setScore(int n)
        {
                playerScore = n;
        }
        public int Score(int n)
        {
                return n;
        }
}
