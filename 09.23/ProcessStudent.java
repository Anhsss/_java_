package com.ruby.java.ch06;

class Student{
	private int snu;		//1
	private String sname;
	private double weight;
	public void getStudent(int a, String b, double c) {		//2
		snu = a;
		sname = b;
		weight = c;
	}
	public void showStudent() {		//2
		System.out.println("학번 : " + snu +"\n"+ "이름 : " + sname+"\n"+ "몸무게 : " + weight);
	}
}

public class ProcessStudent{			//1
	public static void main(String [] args) {
		Student s = new Student();

		s.getStudent(11, "안현수",70.2 );			
		s.showStudent();
	}	
}
