package com.ruby.java.ch07;

class Point{
	private int x, y;			//해당 class에서만 private
	
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void getPoint() {
		System.out.println(x+y);
	}
}
class ColorPoint extends Point{
	private String color;
	public void setColor(int x, int y, String s) {
		this.color = s;
		//this.x = x;		//x는 private 호출불가
		setPoint(x, y);		//private class에서 x, y 불러오기
	}
	public void getColor() {
		System.out.println("color : "+ color);
	}
}
public class TestPoint {
	private int x, y;
	
	public int getPoint() {
		return x;
	}
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public static void main(String[] args) {
		Point p = new Point();
		p.setPoint(10,20);
		p.getPoint();
		
		ColorPoint c = new ColorPoint();
		c.setColor(10, 20, "red");
		c.getColor();
	}
}
