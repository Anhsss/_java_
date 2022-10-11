package edu;

public class Armor1 {

	public static void main(String[] args) {
//		객체 생성
		Armor ar = new Armor();

//		name
		System.out.println("name : " + ar.getName());
		
		Armor ar1 = new Armor("홍길동");
		System.out.println("name : " + ar1.getName());
		
//		(String name, int heigh, int weight, String color, boolean isFly)
		Armor ar2 = new Armor("Ironman", 100, 100, "RED", true);
		System.out.println("name : " + ar2.getName());
		System.out.println("heigh : " + ar2.getHeigh());
		System.out.println("weight : " + ar2.getWeight());
		System.out.println("color : " + ar2.getColor());
		System.out.println("isFly : " + ar2.isFly());
		
		System.out.println("ar2 : " + ar2.toString());
	}
}