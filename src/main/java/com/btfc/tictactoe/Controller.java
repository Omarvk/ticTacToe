package com.btfc.tictactoe; 
import spark.template.freemarker.*;
import java.util.*;
import spark.*;
import spark.ModelAndView;
import static spark.Spark.*;
import java.awt.Point;

public class Controller {
	private static Map<String, Object> attri = new HashMap<>();
	attri.put("Message","");
	public Controller(final TicTacLogic tic) {
		get("/",(req, res) ->	
		{
			// size of the board
			int size = 3;
			// loop the board
			for(int x = 0; x < size; x++){
				for(int y = 0; y < size; y++){
					// get value of cell
					int tala = tic.getSymbol(x, y);
					String value = "";
				   // change values into mark
				    if( tala == 1)
					{
						value = "<img src=\"../graphics/red_x.svg\" id=\"i"+x+""+y+"\" alt=\"Cell "+x+"."+y+"\" />";
					}
					else if( tala == 2)
					{
						value = "<img src=\"../graphics/blue_circle.svg\" id=\"i"+x+""+y+"\" alt=\"Cell "+x+"."+y+"\" />";
					}
					else
					{
						value = "<img src=\"../graphics/empty.svg\" id=\"i"+x+""+y+"\" alt=\"Cell "+x+"."+y+"\" />";
					}
					// put string into hashmap for modelview
					String cell = "a" + String.valueOf(x) + String.valueOf(y);
					attri.put(cell, value);
				}
	
			
		    }
		    return new ModelAndView(attri, "board.ftl"); 
		}, new FreeMarkerEngine());

		post("/move", (req, res) -> 
		{
		    //get the val labelled cell from javascript
			String cell = req.queryParams("cell");
			//convert the 2nd and 3d characters to integers, the first one is useless
			String px = Character.toString(cell.charAt(1));
			String py = Character.toString(cell.charAt(2));
			int x = Integer.parseInt(px);
			int y = Integer.parseInt(py);
			//here we need to do something smart with the point
			String result;
			result = tic.makeMove(x, y);
			attri.put("Message", result);
			return null;
		});
		post("/newGame", (req, res) ->
		{
			tic.newGame();
			return null;
		}
	}
	public static void main(String[] args) {
		staticFileLocation("/public");
		new Controller(new TicTacLogic());					
	}	
}
