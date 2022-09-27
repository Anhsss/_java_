package com.ruby.java.ch07.inheritance;

public class LMSTest {
	public static void main(String[] args) {
		Employee e = new Employee();     //자동 형변환
		Professor p = new Professor();
		Student s = new Student();
		
		e.setName("mike");
		e.setAge(30);
		e.setDept("data");
		
		p.setName("banz");
		p.setAge(35);
		p.setSubject("pitcher");
		
		s.setName("amy");
		s.setAge(24);
		s.setMajor("computer");
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString());
		
	}

}
