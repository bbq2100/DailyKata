package kata.tdd.money;

public class Sum implements Expression {

	public Expression augend;
	public Expression addend;
	
	public Sum(Expression augend, Expression addend) {
		this.augend = augend;
		this.addend = addend;
	}

	@Override
	public Money reduce(String to, Bank bank) {
		int amount = addend.reduce(to, bank).amount + augend.reduce(to, bank).amount;
		return new Money(amount, to);
	}

	public Expression plus(Expression addend) {
		return null;
	}

}
