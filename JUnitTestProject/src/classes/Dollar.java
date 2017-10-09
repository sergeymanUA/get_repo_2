package classes;

public class Dollar {
	public int amount = 10;
	
	public Dollar(int amount) {
		this.amount = amount;
	} 
	public void times(int multiplier) {
		amount *= multiplier;
	}
}
