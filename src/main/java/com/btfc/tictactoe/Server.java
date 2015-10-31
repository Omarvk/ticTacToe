	

import spark.*:
import static spark.Spark.*
import spark.servlet.SparkApplication;


public class Server implements SparkApplication {
	
   	@Override
	public void init() 
	{
	Player playa = new Player();
		post("/name", (req, res) ->{
			Player.setName(
				req.queryParams("fname") += " "+req.queryParams("lname")
			);
		});
		post("/fullname", (req, res) -> playa.getName());
		res.status(200);
		return res;
		
	}
	public static void main(String[] args) {
		staticFileLocation("/public");
		sparkApplication server = new Server();
		server.init();
	}

}
