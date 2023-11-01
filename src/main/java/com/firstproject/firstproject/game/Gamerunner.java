package com.firstproject.firstproject.game;

public class Gamerunner {
	private GamingConsole game;
	public Gamerunner(Packman game) {
		this.game = game;
	}
	public void run() {
		
		System.out.println("Game Running" + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
