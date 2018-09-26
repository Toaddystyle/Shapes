package Org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea1() {
		Sphere sphere1 = new Sphere(4, new MessageBoxSub());
		assertEquals(201.0619354248047 , sphere1.surfaceArea(), 0.0002);
	}
	
	@Test
	public void testSurfaceArea2() {
		Sphere sphere1 = new Sphere(8, new MessageBoxSub());
		assertEquals(804.2477416992188 , sphere1.surfaceArea(), 0.0002);
	}
	
	@Test
	public void testSurfaceArea3() {
		Sphere sphere1 = new Sphere(12, new MessageBoxSub());
		assertEquals(1809.557373046875 , sphere1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume1() {
		Sphere sphere1 = new Sphere(4, new MessageBoxSub());
		assertEquals(268.08258056640625 , sphere1.volume(), 0.0002);
	}
	
	@Test
	public void testVolume2() {
		Sphere sphere1 = new Sphere(8, new MessageBoxSub());
		assertEquals(2144.66064453125 , sphere1.volume(), 0.0002);
	}
	
	@Test
	public void testVolume3() {
		Sphere sphere1 = new Sphere(2, new MessageBoxSub());
		assertEquals(33.51032257080078 , sphere1.volume(), 0.0002);
	}
	
	

	@Test
	public void testSphere() {
		Sphere sphere1 = new Sphere(-7, new MessageBoxSub());
		assertEquals(1, sphere1.getRadius(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(4, new MessageBoxSub());
		assertEquals(4, sphere1.getRadius(), 0.0002);
	}

}
