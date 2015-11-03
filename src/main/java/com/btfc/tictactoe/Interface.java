//This is the console interface class expected to be replaced later with web gui
package com.btfc.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interface 
{
    public void  printMenu()
    {
        System.out.print("Welcome to Tic Tac Toe\n");
        System.out.print("----------------------\n");
        System.out.print("1. For new game\n");
        System.out.print("2. To exit game\n");
        System.out.print("----------------------\n");
    }

    public String  enterPlayerName() throws IOException 
    {
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
        String newPName = in.readLine();

        return newPName;
    }

    public void invalidMove()
    {
        System.out.print("Invalid move");
    }
    //This need to be refactored once we have player name implemented properly
    public void playerWins(String pName)
    {
        System.out.print(pName + " wins!");
    }
}

