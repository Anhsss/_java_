package com.ruby.java.mission;

import java.util.Scanner;

public class GTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Object o = new Object(); //java는 object class자동상속
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
		
		Rem1 g1 = new Rem1();  //create constructor Rem1()
		g1.setNum1(a);
		g1.setNum2(b);
		g1.print();
		
		Rem1 g2 = new Rem1(a, b);
		g2.print();
		
		sc.close();
	}
}