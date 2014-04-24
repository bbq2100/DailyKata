package kata.tdd.money;

public class Money {

	protected int amount;
	protected String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == amount && currency().equals(money.currency());
	}

	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}

	public String currency() {
		return currency;
	}

	@Override
	public String toString() {
		return "Money [amount=" + amount + ", currency=" + currency + "]";
	}

	public Money times(int factor) {
		return new Money(factor * amount, currency);
	}

	
}
