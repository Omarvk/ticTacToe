package com.btfc.tictactoe;

import spark.template.freemarker.*;
import java.util.*;
import spark.*;
import spark.ModelAndView;
import static spark.Spark.*;
import static com.btfc.tictactoe.JsonUtil.*;
import java.awt.Point;

public class Controller {
	private static Map<String, Object> attri = new HashMap<>();
	Board board = new Board();
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
					attri.put(String.valueOf(x) + String.valueOf(y), tic.getBoard(board).getField()[x][y]);
				}
			}
			//attri.put("name", player.getPlayer().getName());
			return new ModelAndView(attri, "board.ftl"); 
		}, new FreeMarkerEngine());

		post("/move", (req, res) -> 
		{
			int x = Integer.parseInt(req.queryParams("col"));
			int y = Integer.parseInt(req.queryParams("row"));
			Point point = new Point(x, y);
			attri.put(req.queryParams("col") + req.queryParams("row"), tic.setBoard(board, point));
			res.redirect("/");
			return null;
		}, new FreeMarkerEngine());
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
