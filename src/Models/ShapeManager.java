package Models;

public class ShapeManager {
	private Dice dice;
	
	public ShapeManager(){
		this.dice = new Dice();
	}
	
	public MetaShape getNextShape(){
		int face = dice.roll();
		Mask mask = MaskManager.getShape(face);	
		return new MetaShape(mask);
	}
}
