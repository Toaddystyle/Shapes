package Org.cvtc.shapes;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author tcondon
 *
 */
public class Sphere extends Shape implements Renderer {

	private float radius = 0;
	private JFrame frame;
	
	// Verify number is not 0 or negative, if it is, set to 1.
	public Sphere(float radius, Dialog msgbx) {
		super(msgbx); 
		this.radius = (radius >= 0) ? radius : 1;
	}
	
	@Override
	public float surfaceArea() {
		return (float) (4 * (Math.PI * (radius * radius)));
	}

	@Override
	public float volume() {
		return (float) ((4.0/3) * (Math.PI * (radius * radius * radius)));
	}

	public void render() {
		// Setting message to display for Sphere
		String SphereMessage = "Surface area is " + surfaceArea() + "\nVolume is: " + volume();
		this.messagebox.show(SphereMessage, "Sphere");
				
	}
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	
}
