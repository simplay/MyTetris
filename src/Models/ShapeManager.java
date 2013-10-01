package Models;

import java.util.List;

public class ShapeManager {
	private Dice dice;
	private MaskManager maskManager;
	
	public ShapeManager(){
		this.dice = new Dice();
		initializeMasks();
	}
	
	private void initializeMasks(){
		
	}
	
	public int getNextShape(){
		
		return 2;
	}
}
