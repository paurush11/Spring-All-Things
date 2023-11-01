package com.firstproject.firstproject;

import com.firstproject.firstproject.game.Gamerunner;
import com.firstproject.firstproject.game.Mario;
import com.firstproject.firstproject.game.Packman;
import com.firstproject.firstproject.game.SuperContra;

public class App01GamingBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var game1 = new Packman();
		var game2 = new Mario();
		var game3 = new SuperContra();
		var gameRunner  = new Gamerunner(game1);
		gameRunner.run();
	}

}
