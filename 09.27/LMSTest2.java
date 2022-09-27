package com.ruby.java.ch07.inheritance;

public class LMSTest2 {
	public static void main(String[] args) {
		Employee e = new Employee("mike", 30, "data");
		Professor p = new Professor("banz", 35, "pitcher");
		Student s = new Student("amy", 24, "computer");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
	}
}