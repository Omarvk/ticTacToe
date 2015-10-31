package com.btfc.tictactoe;


import spark.*;
import static spark.Spark.*;
import spark.servlet.SparkApplication;


public class Server implements SparkApplication {
	
   	@Override
	public void init() 
	{
		// Steindór er MOTHAFOKKA THROW WAY
		Player playa = new Player();
		String nub = "steindor";
		post("/fullname", (req, res) -> "test" );
		post("/name", (req, res) -> {
			res.status(200);
			return res;
		});
		/*post("", (req, res) -> {
			res.status(200);
			return res;
		});*/
	}
	
	/*post("/name", (req, res) ->{ 
		playa.setName(
			req.queryParams("n")
		);
    });*/
	public static void main(String[] args) {
		staticFileLocation("/public");
		SparkApplication server = new Server();
		server.init();
    }

}
