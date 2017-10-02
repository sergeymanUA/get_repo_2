package test;

import org.junit.Test;

/*JUnit provides an option of tracing the exception handling of code. 
 * You can test whether the code throws a desired exception or not.
 * */

import classes.MessageUtil;

public class ExceptionTest {
	String message = "Robert";
	MessageUtil messageUtil = new MessageUtil(message);
	
	@Test(expected = ArithmeticException.class)
	public void testPrintMessage3() {
		System.out.println("Inside testPrintMessage3()");
		messageUtil.printMessage3();
	}
}
