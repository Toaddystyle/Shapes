package Org.cvtc.shapes;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	@Test
	// Test #1
	public void testSurfaceArea1() {
		// THIS IS TESTING TO SEE IF Things WORKS!!!***
		Cuboid cube1= new Cuboid(3,3,3, new MessageBoxSub());
		assertEquals(54, cube1.surfaceArea(), 0.0002);
		//54 is the anticipated value
	}
	@Test
	// Test #2
	public void testSurfaceArea2() {
		// THIS IS TESTING TO SEE IF Things WORKS!!!***
		Cuboid cube1= new Cuboid(4,2,6, new MessageBoxSub());
		assertEquals(88, cube1.surfaceArea(), 0.0002);
	}
	@Test
	// Test #3
	public void testSurfaceArea3() {
		// THIS IS TESTING TO SEE IF Things WORKS!!!***
		Cuboid cube1= new Cuboid(2,4,5, new MessageBoxSub());
		assertEquals(76, cube1.surfaceArea(), 0.0002);
	}

	@Test
	// Test #1
	public void testVolume1() {
		Cuboid cube1 = new Cuboid(2,4,6, new MessageBoxSub());
		assertEquals(48, cube1.volume(), 0.0002);
	}
	
	@Test
	// Test #2
	public void testVolume2() {
		Cuboid cube1 = new Cuboid(3,3,3, new MessageBoxSub());
		assertEquals(27, cube1.volume(), 0.0002);
	}
	
	@Test
	// Test #3
	public void testVolume3() {
		Cuboid cube1 = new Cuboid(8,7,6, new MessageBoxSub());
		assertEquals(336, cube1.volume(), 0.0002);
	}

	@Test 
	public void testCuboid() {
		Cuboid cube1 = new Cuboid (-1,0,-24, new MessageBoxSub());
		assertEquals(1,cube1.getWidth(), 0.0002);
		assertEquals(1, cube1.getHeight(), 0.0002);
		assertEquals(1, cube1.getDepth(), 0.0002);
	}

	@Test
	public void testGetWidth() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(1, cube1.getWidth(), 0.0002);
	}

	@Test
	public void testGetHeight() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(2, cube1.getHeight(), 0.0002);
	}

	@Test
	public void testGetDepth() {
		Cuboid cube1 = new Cuboid(1,2,2, new MessageBoxSub());
		assertEquals(2, cube1.getDepth(), 0.0002);
	}

}
