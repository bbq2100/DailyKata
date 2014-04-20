package kata.tdd.money;

public class Franc extends Money {

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int factor) {
		return new Franc(amount * factor); 
	}

}
