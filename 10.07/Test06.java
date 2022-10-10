package com.ruby.java.ch14;

interface MyFunc<T> {
	T modify(T t);
}

public class Test06 {

	public static void main(String[] args) {
		
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length();
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));

		MyFunc<Double> mf2 = (n) -> n * 2;
		System.out.println(mf2.modify(4.341e+3));
		System.out.println(mf2.modify(1.3827e-2));
		
		MyFunc<Float> mf3 = (n) -> n * 2;
		System.out.println(mf3.modify(4.34f));
		System.out.println(mf3.modify(12.15f));
		
		MyFunc<Boolean> mf4 = (n) -> n;
		System.out.println(mf4.modify(true));
		System.out.println(mf4.modify(false));
		
	}
}