package com.firstproject.firstproject.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class Mario implements GamingConsole{
	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Up done for Mario");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Down done for Mario");
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Left done for Mario");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Right done for Mario");
		
	}
	

}
