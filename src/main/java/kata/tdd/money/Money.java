package kata.tdd.money;

public class Money {

	protected int amount;

	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == amount;
	}

}
