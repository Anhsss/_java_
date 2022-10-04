package com.ruby.java.ch11;

public class Test02 {

	public static void main(String[] args) {
		try {
			System.out.println("1");
			System.out.println("2");
			
			String s = null;
//			s.length();		//의미없는 코드
			System.out.println(s.length());
			
			System.out.println("3");
		} catch(Exception e) {
			System.out.println("오류발생");
		} finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}
}