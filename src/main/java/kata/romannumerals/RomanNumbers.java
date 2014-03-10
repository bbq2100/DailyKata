package kata.romannumerals;

public enum RomanNumbers {
	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);

	RomanNumbers(int number) {
		this.decimalValue = number;
	}
	
	int decimalValue;
}
