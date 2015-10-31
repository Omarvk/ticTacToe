package com.btfc.tictactoe;


public class PlayerService {
	Player player = new Player();
	
	Public Player getPlayer(){
		return player;
	}
	Public Player setPlayer(String name){
		player.setName(name);
		return player;
	}
}