package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import classes.ClassToTest;

public class MessageTest {
	private ClassToTest testedClass;
	String msg = "Hello world!";
	
	@Before
	public void setUp() {
		testedClass = new ClassToTest(msg);
	}
	
	@Test
	public void testPrintMessage() {
		assertEquals(msg, testedClass.printMessage());
		
	}

}
