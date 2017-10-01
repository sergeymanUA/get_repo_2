package classes;

public class ClassToTest {
	
	private String message;
	
	public String concat(String one, String two) {
		return one + two;
	}
	public int multiply(int numb1, int numb2) {
		return numb1 * numb2;
	}
	
	public ClassToTest() {
		
	}
	public ClassToTest(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		return message;
	}
}
