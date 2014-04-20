package kata.tdd.money;

public class Franc {

	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int factor) {
		return new Franc(amount * factor); 
	}

	@Override
	public boolean equals(Object obj) {
		Franc dollar = (Franc) obj;
		return dollar.amount == amount;
	}
}
