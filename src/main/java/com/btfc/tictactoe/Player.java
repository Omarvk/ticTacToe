package com.btfc.tictactoe;

public interface Player
{
    public void setName(String name);

    public String getName();

    public void setSymbol(int n);

    public void setScore(int n);

    public int getScore();

    public int getSymbol();
}
