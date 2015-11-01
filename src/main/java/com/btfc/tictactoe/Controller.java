package com.btfc.tictactoe;

import spark.template.freemarker.*;
import java.util.*;
import spark.*;
import spark.ModelAndView;
import static spark.Spark.*;
import static com.btfc.tictactoe.JsonUtil.*;

public class Controller {
	private static Player players = new Player();
	private static Map<String, Object> attri = new HashMap<>();
	public Controller(final PlayerService player) {
	    //post("/", (req, res) ->{
		//	return "Playername: "+ player.setPlayer(req.queryParams("getName")).getName(); 
		//});
		//get("/",(req, res)  ->"Playername: " + player.getPlayer().getName());
		get("/",(req, res) ->
		{
			return new ModelAndView(null, "index.ftl"); 
		}, new FreeMarkerEngine());

		post("/name", (req, res) -> 
		{
			
			//res.redirect("/");
			return new ModelAndView(player.getPlayer().getName(), "Index.ftl");
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
		new Controller(new PlayerService());					
	}	
}
