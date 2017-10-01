package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import classes.ClassToTest;

public class ConcateTest {
	private ClassToTest testedClass;

	@Before
	public void setUp() {
		testedClass = new ClassToTest();
	}
	@Test
	public void testConcatenate() {
		ClassToTest test = new ClassToTest();
		String result = test.concat("one", "two");
		
		//String result = testedClass.concat("one", "two");
		
		assertEquals("onetwo", result);
	}

}
