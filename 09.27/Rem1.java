package com.ruby.java.mission;

public class Rem1 {
	
	private int num1;
	private int num2;
	
	public Rem1(){		//create constructor Rem1()
	}
	public Rem1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void print() {
		int max,  min;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		}else {
			max = num1;
			min = num2;
		}
		int rem = max % min;
		while(rem != 0) {
			max = min;
			min = rem;
			rem = max % min;
		}
		if(min ==1) {
			System.out.println("최대공약수 : 서로소");
		}else {
			System.out.println("최대공약수 : " + min);
		}
		System.out.println("최소공배수 : " + (num1 * num2)/min);
	}
}