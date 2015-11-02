package com.btfc.tictactoe;

import spark.template.freemarker.*;
import java.util.*;
import spark.*;
import spark.ModelAndView;
import static spark.Spark.*;
import java.awt.Point;

public class Controller {
	private static Map<String, Object> attri = new HashMap<>();
	public Controller(final TicTacToeService tic) {
	    //post("/", (req, res) ->{
		//	return "Playername: "+ player.setPlayer(req.queryParams("getName")).getName(); 
		//});
		//get("/",(req, res)  ->"Playername: " + player.getPlayer().getName());
		get("/",(req, res) ->	
		{
			int size = 3;
			for(int x = 0; x < size; x++){
				for(int y = 0; y < size; y++){
					int tala = tic.getBoard().getField()[x][y];				
					String value  = String.valueOf(tala);
					String cell = "a" + String.valueOf(x) + String.valueOf(y);
					attri.put(cell, value);
					System.out.println(cell+ " wat " +value );
				}
			}
			//attri.put("name", player.getPlayer().getName());
			return new ModelAndView(attri, "board.ftl"); 
		}, new FreeMarkerEngine());

		post("/move", (req, res) -> 
		{
			String cell = req.queryParams("cell");
			String px = Character.toString(cell.charAt(1));
			String py = Character.toString(cell.charAt(2));
			System.out.println(" Noob "+cell+" "+px+" "+py);
			int x = Integer.parseInt(px);
			int y = Integer.parseInt(py);
			Point point = new Point(x, y);
			tic.setBoard(point);
			//res.redirect("/");
			return null;
		});
		/*post("/name",new Route(){ 
		////	req.queryParams("name")
			@Override
			public Object handle(Request request, Response response)
			{
				//String name = request.params("name");
				//String score = "0";
			    //playa.put("1", player.setPlayer(name));
				return "PlayerName: " + players.getName();
			}
		});
		/*after((req, res) -> {
			res.type("application/json");
		});*/
	}
	public static void main(String[] args) {
		staticFileLocation("/public");
		new Controller(new TicTacToeService());					
	}	
}
