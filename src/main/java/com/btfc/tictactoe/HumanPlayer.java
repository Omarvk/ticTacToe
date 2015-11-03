package com.btfc.tictactoe;
import com.btfc.tictactoe.Player;

public class HumanPlayer implements Player
{
    private String name;
    private int playerScore;
    private int playerSymbol;

    public void Player()
    {
        this.name = "Guest";
        this.playerScore = 0;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setSymbol(int n)
    {
        playerSymbol = n;
    }

    public void setScore(int n)
    {
        this.playerScore = n;
    }

    public int getScore()
    {
        return this.playerScore;
    }

    public int getSymbol()
    {
        return this.playerSymbol;
    }
}
