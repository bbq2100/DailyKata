package kata.tdd.money;

public abstract class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == amount && getClass().equals(money.getClass());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public abstract Money times(int times);

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public String currency() {
		return currency;
	}

}
