package kata.functional.romannumerals;

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

	public static int getDecimalValueForRomanChar(char charAt) {
		return valueOf(String.valueOf(charAt)).getDecimalValue();
	}

	private final int decimalValue;

	private RomanNumber(int value) {
		decimalValue = value;
	}

}
