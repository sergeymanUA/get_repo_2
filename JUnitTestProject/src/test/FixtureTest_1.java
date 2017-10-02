package test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class FixtureTest_1 extends TestCase {
	protected int val1, val2;
	
	@Before
	protected void setUp() {
		val1 = 3;
		val2 = 3;
	}

	@Test
	public void testAdd() {
		double result = val1 + val2;
		assertTrue(result == 6);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
