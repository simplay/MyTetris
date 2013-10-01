package Models;

public class MetaShape {
	private boolean[][] mask;
	
	public MetaShape(Mask container){
		this.mask = container.getMask();
	}
}
