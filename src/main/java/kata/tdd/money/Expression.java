package kata.tdd.money;

public interface Expression {

	Money reduce(String to, Bank bank);

	Expression plus(Expression addend);

	Expression times(int times);

}
