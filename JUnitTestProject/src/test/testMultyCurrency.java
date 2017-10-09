package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import classes.Dollar;

public class testMultyCurrency {
	private Dollar five;
	
	@Before
	public void setUp() {
		five = new Dollar(5);
	}
	
	@Test
	public void testDollar() {
		five.times(2);
		assertEquals(10, five.amount);
	}
	
}
