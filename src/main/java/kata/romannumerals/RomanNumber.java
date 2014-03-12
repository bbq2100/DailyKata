package kata.romannumerals;

public enum RomanNumber {
	I(1), 
	V(5),
	X(10),
	L(50), 
	C(100),
	D(500),
	M(1000);

	public int getDecimalValue() {
		return decimalValue;
	}

	private final int decimalValue;

	private RomanNumber(int value) {
		decimalValue = value;
	}

}
