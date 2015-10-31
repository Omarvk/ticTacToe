package com.btfc.tictactoe;


import spark.*;
import static spark.Spark.*;
import static com.btfc.tictactoe.JsonUtil.*;
import spark.servlet.SparkApplication;

public class Controller {
	public Controller(final PlayerService player) {
	
		get("/name", (req, res) -> player.getName(), json());
		post("/name", (req, res -> player.setName(
			req.queryParams("name");
		),json();
		after((req, res) -> {
			res.type("application/json");
		});
		public static void main(String[] args) {
			staticFileLocation("/public");
			SparkApplication server = new Controller(new PlayerService());
			
		}
	}
}