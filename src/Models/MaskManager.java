package Models;

import java.util.LinkedList;
import java.util.List;

public class MaskManager {
	private static MaskManager instace = null;
	private List<Mask> masks;
	
	
	private MaskManager() {
		this.masks = new LinkedList<Mask>();
		initializeMasks();
	}

	private void initializeMasks() {
		boolean[][] currentMask = new boolean[4][4];
		
		//LinePiece
		currentMask[0][0] = false;
		currentMask[0][1] = true;
		currentMask[0][2] = false;
		currentMask[0][3] = false;
		
		currentMask[1][0] = false;
		currentMask[1][1] = true;
		currentMask[1][2] = false;
		currentMask[1][3] = false;
		
		currentMask[2][0] = false;
		currentMask[2][1] = true;
		currentMask[2][2] = false;
		currentMask[2][3] = false;
		
		currentMask[3][0] = false;
		currentMask[3][1] = true;
		currentMask[3][2] = false;
		currentMask[3][3] = false;
		
		this.masks.add(new Mask(currentMask));
	}

	public static Mask getShape(int shapeNr) {
		if (instace == null) {
			instace = new MaskManager();
		}
		return instace.masks.get(0);
	}
}
