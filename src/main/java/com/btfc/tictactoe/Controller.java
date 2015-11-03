package com.btfc.tictactoe; 
import spark.template.freemarker.*;
import java.util.*;
import spark.*;
import spark.ModelAndView;
import static spark.Spark.*;
import java.awt.Point;

public class Controller {
	private static Map<String, Object> attri = new HashMap<>();
	public Controller(final TicTacLogic tic) {
		get("/",(req, res) ->	
		{
		    int size = 3;
		    for(int x = 0; x < size; x++)
		    {
			for(int y = 0; y < size; y++)
			{
			    //gets the value of all squares
			    int tala = tic.getSymbol(x, y);				
			    String value  = String.valueOf(tala);
			    String cell = "a" + String.valueOf(x) + String.valueOf(y);
			    System.out.println(x + ", " + y);
			    attri.put(cell, value);
			}
		    }
		    return new ModelAndView(attri, "board.ftl"); 
		}, new FreeMarkerEngine());

		post("/move", (req, res) -> 
		{
		        //get the string labelled cell
			String cell = req.queryParams("cell");
			//convert the 2nd and 3d characters to integers, the first one is useless
			String px = Character.toString(cell.charAt(1));
			String py = Character.toString(cell.charAt(2));
			int x = Integer.parseInt(px);
			int y = Integer.parseInt(py);
			//here we need to do something smart with the point
			tic.makeMove(x, y);
			System.out.println("move: " + x + ", " + y);
			return null;
		});
	}
	public static void main(String[] args) {
		staticFileLocation("/public");
		new Controller(new TicTacLogic());					
	}	
}
