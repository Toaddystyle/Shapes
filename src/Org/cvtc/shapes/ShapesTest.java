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
		//System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		ShapeFactory factory = new ShapeFactory(new MessageBox());
		
		//  Setting made up numbers to test and show Cuboid
		//Renderer cube1 = new Cuboid(2, 4, 6, new MessageBoxSub());
		Renderer cube1 = factory.make(ShapeType.Cuboid);
		// Setting message to display for Cuboid
		cube1.render();
		
		
		// Setting numbers to test Cylinder
		//Renderer cylinder1 = new Cylinder(2, 4, new MessageBoxSub());
		Renderer cylinder1 = factory.make(ShapeType.Cylinder);
		// Setting message to display for Cylinder
		cylinder1.render();
		
		// Setting numbers for Sphere
		//Renderer sphere1 = new Sphere(4, new MessageBoxSub());
		Renderer sphere1 = factory.make(ShapeType.Sphere);
		sphere1.render();
	}

	
	
}
