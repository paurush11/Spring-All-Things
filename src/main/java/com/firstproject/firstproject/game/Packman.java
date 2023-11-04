package com.firstproject.firstproject.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Packman implements GamingConsole{
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Up done for Pacman");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Down done for Pacman");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Left done for Pacman");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Right done for Pacman");
		
	}
	

}
