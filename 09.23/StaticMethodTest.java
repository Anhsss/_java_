package com.ruby.java.ch06;

public class StaticMethodTest {
	int num = 123;
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest s= new StaticMethodTest();
		s.print2();
	}
	
	public static void print1() {
		System.out.println("hello");
	}
	
	public void print2() {
	
		System.out.println("java");
	}
}