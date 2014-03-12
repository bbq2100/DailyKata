package kata.romannumerals;

public final class RomanNumeralParser {
	private final String romanNumber;
	
	public RomanNumeralParser(String romanNumber) {
		this.romanNumber = romanNumber;
	}

	public int parseFromRomanToDecimal() {
		int result = 0;
		for (int position = 0; position < romanNumber.length(); position++) {
			if(hasMoreCharacters(position)) {
				if(isNextValueGreaterThenOrEqual(position)) {
					
				}
			}
			result += getRomanValueForChar(romanNumber.charAt(position));
		}
		return result;
	}

	private boolean isNextValueGreaterThenOrEqual(int position) {
		return false;
	}

	private boolean hasMoreCharacters(int position) {
		return (position < romanNumber.length());
	}

	public static int getRomanValueForChar(char charAt) {
		return RomanNumber.valueOf(String.valueOf(charAt)).getDecimalValue();
	}
}
