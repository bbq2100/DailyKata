package kata.tdd.money;

public class Franc extends Money {

	public Franc(int amount, String currency) {
		super(amount, currency);
	}

	@Override
	public Money times(int factor) {
		return Money.franc(factor * amount);
	}

}
