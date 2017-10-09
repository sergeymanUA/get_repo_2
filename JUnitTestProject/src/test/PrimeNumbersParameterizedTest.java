package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import classes.PrimeNumberChecker;

/*
 * Parameterized tests allow a developer to run the same test over and over again 
 * using different values.
 */

@RunWith(Parameterized.class)
public class PrimeNumbersParameterizedTest {
	private Integer inputNumber;
	private Boolean expectedResult;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		primeNumberChecker = new PrimeNumberChecker();
	}

	public PrimeNumbersParameterizedTest(Integer inputNumber, Boolean expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;		
	}
	
	//test data set
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{ 2, true },
			{ 6, false },
			{ 19, true },
			{ 22, false },
			{ 23, true }
		});
	}
	
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parametrized Number is: " + inputNumber);
		assertEquals(expectedResult, 
				primeNumberChecker.validate(inputNumber));
	}
	
	
}
