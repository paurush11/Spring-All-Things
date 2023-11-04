package com.firstproject.firstproject.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner {
	private GamingConsole game;
	public Gamerunner(@Qualifier("mario") GamingConsole game) {
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
