package com.ruby.java.ch11;

public class Test01 {

	public static void main(String[] args ) {
		try {
			int a = 10 / 0;

			//		 int arr[] = new int[3];
			//		 arr[3] = 30;
			//		 System.out.println("OK");

			System.out.println(a);
		} catch (ArrayIndexOutOfBoundsException e) {		
			System.out.println(e.getMessage()); // 예외처리 오류 메시지 출력
		} catch (ArithmeticException e2) {     // 나누기 0
			System.out.println(e2.getMessage());
		}
		System.out.println("GOOD");
	}
}

