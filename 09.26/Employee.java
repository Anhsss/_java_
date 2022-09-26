package com.ruby.java.ch07;
class Person{
	private String name;
	private int age;
	private String dept;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
}

public class Employee {

	private String name;
	private int age;
	private String dept;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Student s1 = new Student();
		Person p = new Person();
		p.setAge(55);
		s1.setAge(33);
		e.setAge(10);
		e.setName("hello");
		System.out.print("age = " + e.getAge() + "\n" + "age = " + e.getName());	
		System.out.println("\n" + "student = " + s1.getAge());
	}
}
