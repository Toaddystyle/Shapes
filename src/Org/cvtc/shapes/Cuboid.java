package Org.cvtc.shapes;
import javax.swing.*;

/**
 * @author tcondon
 *
 */
public class Cuboid extends Shape implements Renderer {
	
	private float width = 0;
	private float height = 0;
	private float depth = 0;
	private JFrame frame;
	
	// Verify number is not 0 or negative, if it is, set to 1.
	public Cuboid(float width, float height, float depth, Dialog msgbx) {
		super(msgbx);
		this.width = (width <= 0) ? 1 : width;
		this.height = (height <= 0) ? 1 : height;
		this.depth = (depth <= 0) ? 1 : depth;
	}
	
	// Calculating surface area
	@Override
	public float surfaceArea() {
		// Calculate the area 2 (lw + wh + hl)
		return (2 * ((depth*width) + (width*height) + (height*depth)));
	}


	// Calculating volume
	@Override
	public float volume() {
		return (width*height*depth);
	}

	
	public void render() {
		String CuboidMessage = "Surface area is: " + surfaceArea() + "\nVolume is: " + volume();
		this.messagebox.show(CuboidMessage, "Cuboid");
	}

	public float getWidth() {
		return width;
	}



	private void setWidth(float width) {
		this.width = width;
	}



	public float getHeight() {
		return height;
	}



	private void setHeight(float height) {
		this.height = height;
	}



	public float getDepth() {
		return depth;
	}



	private void setDepth(float depth) {
		this.depth = depth;
	}

	
	
}
