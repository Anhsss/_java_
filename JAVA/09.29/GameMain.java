package com.ruby.java.mission;

class Game {
	private String spe;
	private String attack;
	private double move;
	
	public Game(String spe, String attack, double move) {
		this.spe = spe;
		this.attack = attack;
		this.move = move;
	}

	public  void game() {
		System.out.printf("%s이 %s를(을) 쏩니다. 최대 사거리는 %.1fkm 입니다.\n",spe, attack, move);
	}

}
class Tank extends Game{
	public Tank(String spe,String attack, double move) {

		super(spe,attack, move);

	}

	public void game() {

		System.out.print("[TANK]");

		super.game();

	}

}
class Airplane extends Game{
	public Airplane(String spe,String attack, double move) {

		super(spe,attack, move);

	}

	public void game() {

		System.out.print("[AIRPLANE]");

		super.game();

	}

}
class Submarine extends Game{
	public Submarine(String spe,String attack, double move) {

		super(spe,attack, move);

	}

	public void game() {

		System.out.print("[SUBMARINE]");

		super.game();

	}

}
class Soldier extends Game{
	public Soldier(String spe,String attack, double move) {

		super(spe,attack, move);

	}

	public void game() {

		System.out.print("[SOLDIER]");

		super.game();
	}
}
public class GameMain {

	public static void main(String[] args) {
		
		Tank t = new Tank("K9","포",40);
		t.game();
		
		Airplane a = new Airplane("타이푼","미사일",100);
		a.game();
		
		Submarine s = new Submarine("맥커럴","어뢰",1.8);
		s.game();
		
		Soldier so = new Soldier("연합군","총",3.3);
		so.game();
		
		
	}
}
