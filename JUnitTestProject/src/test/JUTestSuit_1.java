package test;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class JUTestSuit_1 {

	public static void main(String[] args) {
		TestSuite suite = new TestSuite(TestMessageUtil.class, TRTestRunner.class, TestRunner2.class);
		TestResult result = new TestResult();
		suite.run(result);
		System.out.println("Number of test cases = " + result.runCount());
	}

}
