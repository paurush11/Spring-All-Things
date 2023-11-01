package com.firstproject.firstproject.springVsJavaVsPOJO;

import java.io.Serializable;

class Pojo {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "name: " + this.name + " age: " + this.age;
	}
}
class JavaBean implements Serializable { // Enterprise Java Bean
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public JavaBean() {
		
	}


	private String name;
	private int age;
	@Override
	public String toString() {
		return "name: " + this.name + " age: " + this.age;
	}
}
public class SpringbeanvsJavabeanvsPOJO {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo pojo =  new Pojo();
		System.out.println(pojo);
		
	}

}
