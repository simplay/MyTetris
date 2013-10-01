package Models;

public class GameManager {
	private Board bord;
	private ShapeManager shapeManager;
	
	public GameManager(){
		this.bord = new Board();
		this.shapeManager = new ShapeManager();
	}
}
