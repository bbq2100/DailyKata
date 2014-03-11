package kata.romannumerals;

public class RomanNumeralParser {

	enum RomanNumber {
		I(1), 
		V(5),
		X(10),
		L(50), 
		C(100),
		D(500),
		M(1000);

		private final int decimalValue;

		private RomanNumber(int value) {
			decimalValue = value;
		}
	}

	public static int parseFromRomanToDecimal(String romanNumber) {
		int result = 0;
		char[] romanCharArray = romanNumber.toCharArray();
		for (int i = 0; i < romanCharArray.length; i++) {
			if(i + 1 < romanCharArray.length) {
				if(RomanNumber.valueOf(String.valueOf(romanCharArray[i])).compareTo(RomanNumber.valueOf(String.valueOf(romanCharArray[i+1]))) < 0) {
					result = RomanNumber.valueOf(String.valueOf(romanCharArray[i+1])).decimalValue - RomanNumber.valueOf(String.valueOf(romanCharArray[i])).decimalValue;
				}
				else {
					result = RomanNumber.valueOf(String.valueOf(romanCharArray[i+1])).decimalValue + RomanNumber.valueOf(String.valueOf(romanCharArray[i])).decimalValue;
				}
				i++;
			}
			else {
				result += RomanNumber.valueOf(String.valueOf(romanCharArray[i])).decimalValue;
			}
		}
		return result;
	}
}
