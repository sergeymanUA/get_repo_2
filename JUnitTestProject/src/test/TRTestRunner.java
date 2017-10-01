package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*This is a short comment */
public class TRTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestResultClass.class);
		
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
