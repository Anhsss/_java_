package com.ruby.java.ch07.abstraction;

abstract class Drinks{
	private String name;
	private int price;
	
	public Drinks(String name, int price) {
		this.name = name;		//this 미지정시 null, 0값 출력
		this.price = price;
	}

	public void drink() {
		System.out.printf("%s를 마십니다. 가격은 %d원 입니다.\n", name, price);
	}
}

class Juice extends Drinks{
	public Juice(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[JUICE]");

		super.drink();

	}

}
class Coffee extends Drinks{
	public Coffee(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[COFFEE]");

		super.drink();

	}

}
class Beer extends Drinks{
	public Beer(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[BEER]");

		super.drink();
	}

}
class Water extends Drinks{
	public Water(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[WATER]");

		super.drink();

	}

}
class Tea extends Drinks{
	public Tea(String name, int price) {

		super(name, price);

	}

	public void drink() {

		System.out.print("[TEA]");

		super.drink();

	}

}
public class DrinksMain {

	public static void main(String[] args) {
		{

			Juice j = new Juice("오렌지 주스", 3000);		j.drink();

			Coffee c = new Coffee("카푸치노", 4000);		c.drink();

			Beer b = new Beer("아사히", 5000);			b.drink();

			Water w = new Water("아이시스", 900);			w.drink();

			Tea t = new Tea("캐모마일", 3500);				t.drink();

		}

	}

}
