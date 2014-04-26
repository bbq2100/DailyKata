package kata.tdd.money;

public class Pair {

	private String from;
	private String to;

	public Pair(String from, String to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public boolean equals(Object obj) {
		Pair pair = (Pair) obj;
		return (pair.from.equals(from) && pair.to.equals(to));
	}
	
	@Override
	public int hashCode() {
		return 0;
	}
}
