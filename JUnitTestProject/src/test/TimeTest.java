package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import classes.MessageUtil;

/*
 * JUnit provides a handy option of Timeout. If a test case takes more time than the specified 
 * number of milliseconds, 
 * then JUnit will automatically mark it as failed.
 */
public class TimeTest {
	String message = "Robert";	
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(timeout = 1000)
	public void testPringMessage() {
		System.out.println("Inside testPrintMessage()");
		messageUtil.printMessage();
	}
	
	@Test
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		message = "Hi!" + "Robert";
		assertEquals(message, messageUtil.salutationMessage());
	}
}
