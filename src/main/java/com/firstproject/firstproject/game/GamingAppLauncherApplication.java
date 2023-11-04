package com.firstproject.firstproject.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan("com.firstproject.firstproject.game")
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
		try (var gamingContext = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			
			gamingContext.getBean(Gamerunner.class).run();
		}

	}

}
