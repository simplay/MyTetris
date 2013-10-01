import Models.Mask;
import Models.MaskManager;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mask a = MaskManager.getShape(4);
		System.out.println(a.toString());
	}

}
