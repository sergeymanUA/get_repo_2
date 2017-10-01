package test;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

/* 
 * TestResult - collects the results of executing a test case.
 */
public class TestResultClass extends TestResult {
	public synchronized void addError(Test test, Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	public synchronized void addFailure(Test test, AssertionFailedError t) {
		super.addFailure((junit.framework.Test) test, t);
	}
	
	@Test
	public void testAdd() {
		// add any test
	}
	
	public synchronized void stop() {
		// stop test here
	}
	
	

}
