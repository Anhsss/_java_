package com.ruby.java.mission;
import java.util.ArrayList;
import java.util.List;

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
		
		{
		Tank t = new Tank("K9","포",40);
		t.game();
		
		Airplane a = new Airplane("타이푼","미사일",100);
		a.game();
		
		Submarine s = new Submarine("맥커럴","어뢰",1.8);
		s.game();
		
		Soldier so = new Soldier("연합군","총",3.3);
		so.game();
		}
		System.out.println("===================================================================");
		{
			List<Game> list = new ArrayList<>();
			
			list.add(new Tank("K9", "포", 40));
			list.add(new Airplane("타이푼", "미사일", 100));
			list.add(new Submarine("맥커럴", "어뢰", 1.8));
			list.add(new Soldier("연합군", "총", 3.3));
			
			for (Game g : list) {
				g.game();
		}
		System.out.println("===================================================================");
		{
			Game[] d = new Game[4];
			
			d[0] = new Tank("K9", "포", 40);
			d[1] = new Airplane("타이푼", "미사일", 100);
			d[2] = new Submarine("맥커럴", "어뢰", 1.8);
			d[3] = new Soldier("연합군", "총", 3.3);
			
			for (Game g1 : d) {
				g1.game();
				}
			}
		}
	}
}
	

