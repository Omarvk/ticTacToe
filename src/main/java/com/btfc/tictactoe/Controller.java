package com.btfc.tictactoe;


import spark.*;
import static spark.Spark.*;
import static com.btfc.tictactoe.JsonUtil.*;

public class Controller {
	public Controller(final PlayerService player) {
	
		//post("/fullname", (req, res) -> player.getPlayer());
		post("/name", (req, res) -> { 
		////	req.queryParams("name")
		
			res.status(200);
			return player.getPlayer();
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
