package com.btfc.tictactoe;

public class Board
{

    static final int XDIMENSION = 3;
    static final int YDIMENSION = 3;
    static final int X = 88; // char 'X'
    static final int O = 79; // char 'O'
    static final int EMPTY = 32; // char ' '

    private int[][] field = new int[XDIMENSION][YDIMENSION];

    public Board()
    {
        initializeField();
    }
    public void initializeField()
    {
        for(int i = 0; i < XDIMENSION; i++)
        {
            for(int j = 0; j < YDIMENSION; j++)
            {
                field[i][j] = EMPTY;
            }
        }
        return;
    }

    public int getXDimension()
    {
        return XDIMENSION;
    }

    public int getYDimension()
    {
        return YDIMENSION;
    }

    public int[][] getField()
    {
        return field;
    }

    public void setField(int[][] field)
    {
        this.field = field;
        return;
    }

    public void setSymbol(int x, int y, int symbol)
    {
        this.field[x][y] = symbol;
    }

    public int getSymbol(int x, int y)
    {
        return this.field[x][y];
    }
}
