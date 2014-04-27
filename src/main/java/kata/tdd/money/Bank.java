package kata.tdd.money;

import java.util.Hashtable;
import java.util.Map;

public class Bank {

	private Map<Pair, Integer> currencies = new Hashtable<>();

	public Expression reduce(Expression source, String to) {
		return source.reduce(to, this);
	}

	public void addRate(String source, String destination, int rate) {
		currencies.put(new Pair(source, destination), rate);
	}

	public int rate(String source, String destination) {
		int identityValue = 1;
		if(source.equals(destination)) return identityValue;
		return currencies.get(new Pair(source, destination));
	}

}
