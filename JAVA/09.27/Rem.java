package com.ruby.java.mission;

import java.util.Scanner;

public class Rem {
	
	int num1;  //정수 2개 정의
	int num2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl+shift+o import생성 단축키
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
		
		Rem r = new Rem();
		r.num1 = a;
		r.num2 = b;
		
		r.print();	//print함수
		
		sc.close();
	}
	private void print() {
		// num1 = a, num2 = b
		int max,  min;	//두 정수의 최대, 최솟값
		
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
