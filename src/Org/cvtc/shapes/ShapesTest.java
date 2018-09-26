package Org.cvtc.shapes;

/**
 * 
 */

/**
 * @author tcondon
 *
 */
public class ShapesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Component frame = null;
		
		// Todd's Helper code to display current directory path
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));

		
		//  Setting made up numbers to test and show Cuboid
		//Cuboid cube1 = new Cuboid(2, 4, 6); - Changed!
		Renderer cube1 = new Cuboid(2, 4, 6, new MessageBoxSub());
		// Setting message to display for Cuboid
		cube1.render();
		
		
		// Setting numbers to test Cylinder
		//Cylinder cylinder1 = new Cylinder(2, 4);
		Renderer cylinder1 = new Cylinder(2, 4, new MessageBoxSub());
		// Setting message to display for Cylinder
		cylinder1.render();
		
		// Setting numbers for Sphere
		//Sphere sphere1 = new Sphere(4);
		Renderer sphere1 = new Sphere(4, new MessageBoxSub());
		sphere1.render();
	}

	
	
}
