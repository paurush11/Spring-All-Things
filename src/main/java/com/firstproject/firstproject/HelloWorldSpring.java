package com.firstproject.firstproject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.firstproject.firstproject.game.Gamerunner;
import com.firstproject.firstproject.game.Mario;
import com.firstproject.firstproject.game.Packman;
import com.firstproject.firstproject.game.SuperContra;

public class HelloWorldSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Launch a spring context
		/// Configure things we want spring to manage
		
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		System.out.println(context.getBean("name"));
	}

}
