package test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionTest {

	// execute once (on start)
	@BeforeClass
	public static void beforeClass() {
		System.out.println("in before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("in after class");
	}

	// execute for each test
	@Before
	public void before() {
		System.out.println("in before");
	}

	// execute for each test, after executing test
	@After
	public void after() {
		System.out.println("in after");
	}

	// test case 1
	@Test
	public void testCase1() {
		System.out.println("in test case 1");
	}

	// test case 2
	@Test
	public void testCase2() {
		System.out.println("in test case 2");
	}

}
