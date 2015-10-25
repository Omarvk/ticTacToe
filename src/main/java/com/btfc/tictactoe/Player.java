package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Player
{
        private String name;
        private int playerScore;
		
		public Player
		{
			this.name = 'Guest';
			this.playerscore = 0;
		}

        public void setName(String n)
        {
            this.name = n;
        }
       
		public String getName()
        {
			return this.name;
        }

		public void setScore(int n)
        {
			this.playerScore = n;
        }
        
		public int getScore()
        {
			return this.playerScore;
        }
}
