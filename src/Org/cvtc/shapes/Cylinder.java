package Org.cvtc.shapes;
import javax.swing.*;

/**
 * 
 */

/**
 * @author tcondon
 *
 */
public class Cylinder extends Shape implements Renderer {

	private float radius = 0;
	private float height = 0;
	private JFrame frame;
	
	// Verify number is not 0 or negative, if it is, set to 1.
	// Constructor
	public Cylinder(float radius, float height, Dialog msgbx){
		super(msgbx);
		this.radius = (radius <= 0) ? 1 : radius;
		this.height = (height <= 0) ? 1 : height;
	}
	
	@Override
	public float surfaceArea() {
		return (float) ((2 * (Math.PI * radius * height)) + (2 * (Math.PI * (radius * radius))));
	}

	@Override
	public float volume() {
		return (float) (Math.PI * (radius * radius) * height);
	}

	public void render() {
		String CylinderMessage = "Surface area is: " + surfaceArea() + "\nVolume is: " + volume();
		// Displaying message
		this.messagebox.show(CylinderMessage, "Cylinder");
		
	}
	
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}

	

}
