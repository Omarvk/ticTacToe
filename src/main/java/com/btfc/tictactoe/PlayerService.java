package com.btfc.tictactoe;


public class PlayerService {
	
	public Player getPlayer(){
		Player player = new Player();
		return player;
	}
	public Player setPlayer(String name){
		Player player = new Player();
		player.setName(name);
		return player;
	}
}
