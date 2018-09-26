package Org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea1() {
		Cylinder cylinder1 = new Cylinder(2, 4, new MessageBoxSub());
		assertEquals(75.39822387695312, cylinder1.surfaceArea(), 0.0002);
	}
	
	@Test
	public void testSurfaceArea2() {
		Cylinder cylinder1 = new Cylinder(1, 3, new MessageBoxSub());
		assertEquals(25.132741928100586, cylinder1.surfaceArea(), 0.0002);
	}
	
	@Test
	public void testSurfaceArea3() {
		Cylinder cylinder1 = new Cylinder(5, 2, new MessageBoxSub());
		assertEquals(219.91148376464844, cylinder1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume1() {
		Cylinder cylinder1 = new Cylinder(2,4, new MessageBoxSub());
		assertEquals(50.26548385620117, cylinder1.volume(), 0.0002);
	}
	
	@Test
	public void testVolume2() {
		Cylinder cylinder1 = new Cylinder(1,3, new MessageBoxSub());
		assertEquals(9.42477798461914, cylinder1.volume(), 0.0002);
	}
	
	@Test
	public void testVolume3() {
		Cylinder cylinder1 = new Cylinder(6,3, new MessageBoxSub());
		assertEquals(339.2919921875, cylinder1.volume(), 0.0002);
	}

	@Test
	public void testCylinder() {
		Cylinder cylinder1 = new Cylinder(-1,0, new MessageBoxSub());
		assertEquals(1,cylinder1.getRadius(), 0.0002);
		assertEquals(1, cylinder1.getHeight(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder (2, 4, new MessageBoxSub());
		assertEquals(2, cylinder1.getRadius(), 0.002);
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder (2,4, new MessageBoxSub());
		assertEquals(4, cylinder1.getHeight(), 0.002);
	}

}
