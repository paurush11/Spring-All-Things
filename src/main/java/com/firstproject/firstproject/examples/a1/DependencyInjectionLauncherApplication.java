package com.firstproject.firstproject.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class Business {

	Dependency1 dependency1;
	Dependency2 dependency2;

	public Business(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}

	@Override
	public String toString() {
		return "this " + dependency1 + " and " + dependency2;
	}

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		try (var gamingContext = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)) {
//			Arrays.stream(gamingContext.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(gamingContext.getBean(Business.class));

		}

	}

}
