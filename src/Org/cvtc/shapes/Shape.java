package Org.cvtc.shapes;
/**
 * 
 */

/**
 * @author tcondon
 *

 */

public abstract class Shape {
	
	protected Dialog messagebox;
	
	public abstract float surfaceArea();
	
	public abstract float volume();
	
	public Shape(Dialog mb) {
		messagebox = mb;
	}
	
}
