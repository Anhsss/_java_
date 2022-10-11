package edu;

public class Armor {
	private String name;
	private int heigh;
	private int weight;
	private String color;
	private boolean isFly;
	
	public Armor() {
		name = "jhon";
		
	}
	public Armor(String name) {
		this.name = name;
	}
	
	public Armor(String name, int heigh, int weight, String color, boolean isFly) {
		super();
		this.name = name;
		this.heigh = heigh;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeigh() {
		return heigh;
	}
	public void setHeigh(int heigh) {
		this.heigh = heigh;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFly() {
		return isFly;
	}
	public void setFly(boolean isFly) {
		this.isFly = isFly;
	}
	@Override
	public String toString() {
		return "Armor [name=" + name + ", heigh=" + heigh + ", weight=" + weight + ", color=" + color + ", isFly="
				+ isFly + "]";
	}
	
}