package com.btfc.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Player
{
        private String name;
        private int playerScore;
		
		public Player
		{
			this.name = "Guest";
			this.playerscore = 0;
		}

        public void setName(String name)
        {
            this.name = name;
        }
       
		public String getName()
        {
			return this.name;
        }

		public void setScore(int score)
        {
			this.playerScore = score;
        }
        
		public int getScore()
        {
			return this.playerScore;
        }
}
