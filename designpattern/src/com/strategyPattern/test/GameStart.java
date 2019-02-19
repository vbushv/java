package com.strategyPattern.test;

public class GameStart {

	public static void main(String[] args) {
		
			Game game = new Game();

			game.setWeapon(new Sword());
			game.attack();
			
			game.setWeapon(new Ax());
			game.attack();
			
			game.setWeapon(new Knife());
			game.attack();
			
			game.setDefance(new Bangpae());
			game.defance();
			
	}
	
}
