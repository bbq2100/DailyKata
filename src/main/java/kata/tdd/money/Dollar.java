package kata.tdd.money;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public void times(int factor) {
		amount *= factor;
	}

}