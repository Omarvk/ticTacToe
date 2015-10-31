package com.btfc.tictactoe;


public class PlayerService {
	
	Public Player getPlayer(){
		Player player = new Player();
		return player;
	}
	Public Player setPlayer(String name){
		Player player = new Player();
		player.setName(name);
		return player;
	}
}