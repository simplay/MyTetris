package Models;

public class Mask {
	private boolean[][] mask;
	public Mask(boolean[][] mask){
		this.mask = mask;
	}
	
	public boolean[][] getMask(){
		return this.mask;
	}
	
	@Override
	public String toString(){
		String tmp = new String();
		for(int k = 0; k < 4; k++){
			for(int t = 0; t < 4; t++){
				tmp+=mask[k][t] + " ";
			}
			tmp+="\n";
		}
		return tmp;
	}
	
}
