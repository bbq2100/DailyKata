package kata.tdd.money;

public class Dollar extends Money {

	public Dollar(int amount, String currency) {
		super(amount, currency);
	}

	@Override
	public Money times(int factor) {
		return Money.dollar(factor * amount);
	}
}
