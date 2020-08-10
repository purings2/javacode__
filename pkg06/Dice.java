package pkg06;

import java.util.Random;

public class Dice {
	private String name ;
	private int su = 5 ;
	private Random random ;
	private int[] jusawee ;
	private int total ;
	
	private void total() {
		for (int i = 0; i < jusawee.length; i++) {
			this.total += jusawee[i] ;
		}
	}
	
	private void roll() {
		for (int i = 0; i < jusawee.length; i++) {
			this.jusawee[i] = this.random.nextInt(6) + 1 ;
		}
	}
	
	public void getInfo() {
		System.out.println("이름 : " + this.name );
		for (int i = 0; i < jusawee.length; i++) {
			System.out.print( jusawee[i] + " ");
		}
		System.out.println();
		System.out.println("합계 : " + this.total );
	}
	
	public Dice(String name, int su) {
		this.name = name;
		this.su = su;
		this.random = new Random();
		this.jusawee = new int[su];
		this.roll();
		this.total();
	}
	public Dice(String name) {
		this.name = name;
		this.random = new Random();
		this.jusawee = new int[this.su];
		this.roll();
		this.total();
	}
	
}