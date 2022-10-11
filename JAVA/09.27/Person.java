package com.ruby.java.ch07.inheritance;

public class Person {   //부모 클래스
	private String name;
	private int age;
	
	public Person() {	//부모 생성자 호출
		System.out.println("Person 생성자 실행!");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	public String toString() {  //method를 재정의하여 사용
		return name + ":" + age; 
	}
}