package test;

import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import classes.PrimeNumberChecker;

/*
 * Parameterized tests allow a developer to run the same test over and over again 
 * using different values.
 */

@RunWith(Parameterized.class)
public class ParametrizedTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	public ParametrizedTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;		
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		
	}
	
}
