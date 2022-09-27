package com.ruby.java.ch07.inheritance;

public class Student extends Person{		//Student.자식.this, Person.부모.super
	private String major;
	
	public Student() {	//부모 생성자 호출
		System.out.println("Student 생성자 실행!");
	}
	
	public Student(String name, int age, String major) {
		super(name, age); //부모 class
		this.major = major;
		System.out.println("Student(name, age, major) 생성자 실행!");	
		}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {	//overriding
//		return this.getName() + ":" + this.getAge() + ":" + major;
		return super.toString() + ":" + major;
	}
}