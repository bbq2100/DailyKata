package kata.tdd.money;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int factor) {
		return new Dollar(amount * factor); 
	}

	@Override
	public boolean equals(Object obj) {
		Dollar dollar = (Dollar) obj;
		return dollar.amount == amount;
	}
}
