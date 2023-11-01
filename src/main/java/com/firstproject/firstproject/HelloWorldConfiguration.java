package com.firstproject.firstproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {
	
	record Person (String name, int age, Address address) {}; 
	record Address (String location, int pincode) {}; 
	@Bean
	public String name() {
		return "Paurush";
	}
	@Bean
	public int age() {
		return 21;
	}
	@Bean
	public Person person() {
		return new Person("rahul", 21, new Address("laxminagar", 121006));
	}
	@Bean
	public Person person2() { /// By fx call
		return new Person( name(),age(),address());
	}
	@Bean
	public Person person3(String name, int age, Address meraaghr) { /// By parameters Passed
		return new Person(name, age, meraaghr);
	}
	@Bean
	public Address address() {
		return new Address("laxminagar", 121006);
	}
	@Bean(name = "meraaghr")
	public Address address2() {
		return new Address("laxminagar chutpaar mulviu", 121006);
	}
	
}
