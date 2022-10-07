package com.ruby.java.ch14;

interface Verify {
	boolean check(int n);
}

interface Verify2 {
	boolean check(int n, int d);
}

public class Test03 {
	public static void main(String[] args) {
		Verify isEven = (n) -> (n % 2) == 0;          //짝수
		System.out.println(isEven.check(17));

		Verify isPositive = (n) -> n <= 0;
		System.out.println(isPositive.check(-4));
		
		Verify2 baesu = (n,d) -> (n % d) != 0;        
		System.out.println(baesu.check(19, 4));

	}
}