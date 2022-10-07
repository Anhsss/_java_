package com.ruby.java.ch14;       //람다식 구현

interface Multiply {
	double getValue();
}

public class Test02 {

	public static void main(String[] args) {

		Multiply m1, m2;
		m1 = () -> 3.14 * 2 * 3;
		System.out.println(m1.getValue());

		m2 = () -> 10 * 3;
		System.out.println(m2.getValue());
	}
}