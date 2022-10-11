package com.ruby.java.ch07;

public class TestStatic {
	
	static void show(int a[][]) {
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
			 System.out.print(a[i][j]+ "\t");				
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
	//	show(a);
		TestStatic.show(a);
	}
}