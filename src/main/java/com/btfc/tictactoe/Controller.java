package com.btfc.tictactoe;

import java.util.*;
import spark.*;
import spark.Route;
import static spark.Spark.*;
import static com.btfc.tictactoe.JsonUtil.*;
public class Controller {
	private static Player players = new Player();
	private static Map<String, Player> playa = new HashMap<String, Player>();
	public Controller(final PlayerService player) {
		
		//post("/fullname", (req, res) -> player.getPlayer());
		post("/name",new Route(){ 
		////	req.queryParams("name")
			@Override
			public Object handle(Request request, Response response)
			{
				String name = request.params("name");
				String score = "0";
				player.setPlayer(name);
			    playa.put("1", player.getPlayer());
				return "PlayerName: " + playa;
			}
		});
		/*after((req, res) -> {
			res.type("application/json");
		});*/
	}
	public static void main(String[] args) {
		staticFileLocation("/public");
		new Controller(new PlayerService());					
	}	
}
