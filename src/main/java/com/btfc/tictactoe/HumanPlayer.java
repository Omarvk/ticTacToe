import java.awt.Point;
import com.btfc.tictactoe.Player;

public class HumanPlayer extends Player
{
    //This is a very lazy temporory implementation
    public Point makeMove()
    {
        int x = -1, y = -1; 
	try{
	System.out.println("Enter the x, y coordinates you want move to");
	x = System.in.read();
	//clear out the comma and space
	System.in.read();
	System.in.read();
	y = System.in.read();
	//remove trailing newline character
	System.in.read();
	}
	catch(Exception e)
	{
	}
	return new Point(x,y);
    }
}
