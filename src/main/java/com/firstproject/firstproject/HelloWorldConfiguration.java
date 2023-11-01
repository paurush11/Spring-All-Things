package com.firstproject.firstproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
	public Person person3(String name, int age, @Qualifier("newAddress") Address address) { /// By parameters Passed
		return new Person(name, age, address);
	}
//	@Bean
//	public Person person3(String name, int age,  Address meraghr) { /// By parameters Passed
//		return new Person(name, age, meraghr);
//	}
	@Bean
	@Primary
	public Address address() {
		return new Address("laxminagar", 121006);
	}
	@Bean(name = "meraghr")
	@Qualifier("newAddress")
	public Address address2() {
		return new Address("laxminagar chutpaar mulviu", 121006);
	}
	
}
