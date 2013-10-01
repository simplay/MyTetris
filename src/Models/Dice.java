package Models;

import java.util.Random;

public class Dice {
	private Random randomizer;
	public Dice(){
		this.randomizer = new Random();
	}
	
	public int roll(){
		return 1;
	}
}
