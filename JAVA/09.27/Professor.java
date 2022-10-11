package com.ruby.java.ch07.inheritance;

public class Professor extends Person {
	private String subject;
	
	public Professor() {	//부모 생성자 호출
		System.out.println("Professor 생성자 실행!");
	}
	
	public Professor(String name, int age, String subject) {
		super(name, age); //부모 class
		this.subject = subject;
		System.out.println("Professor(name, age, subject) 생성자 실행!");	
		}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String toString() {
//		return this.getName() + ":" + this.getAge() + ":" + subject;
		return super.toString() + ":" + subject;
	}
}