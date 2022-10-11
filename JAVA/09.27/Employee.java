package com.ruby.java.ch07.inheritance;

public class Employee extends Person {
	private String dept;
	
	public Employee() {	//부모 생성자 호출
		System.out.println("Employee 생성자 실행!");
	}
	
	public Employee(String name, int age, String dept) {
		super(name, age); //부모 class, super()문에 인자값 지정
//		super.setName(name);//중복값
//		super.setAge(age); 	//중복값
		this.dept = dept;
		System.out.println("Employee(name, age, dept) 생성자 실행!");	
		}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String toString() {
//		return this.getName() + ":"+ this.getAge() + ":"+dept;
		return super.toString() + ":" + dept;		//super 부모 method 호출
	}
}
