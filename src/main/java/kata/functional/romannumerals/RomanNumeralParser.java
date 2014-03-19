package kata.functional.romannumerals;

public class RomanNumeralParser {
	private String romanNumber;
	
	public int parseFromRomanToDecimal(String romanNumber) {
		int result = 0;
		this.romanNumber = romanNumber;
		for (int position = 0; position < romanNumber.length(); position++) {
			if(hasMoreCharacters(position)) {
				if(isNextValueGreaterThen(position)) {
					result += RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position + 1)) - RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position));
					position++;
				}
				else if (isNextValueLessThen(position)) {
					result += RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position));
				}
				else {
					result += RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position)) + RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position + 1));
					position++;
				}
			}
			else {
				result += RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position));
			}
		}
		return result;
	}

	private boolean isNextValueLessThen(int position) {
		return (RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position + 1)) < RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position)));
	}

	private boolean isNextValueGreaterThen(int position) {
		return (RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position + 1)) > RomanNumber.getDecimalValueForRomanChar(romanNumber.charAt(position))); 
	}

	private boolean hasMoreCharacters(int position) {
		return (position < romanNumber.length() -1 );
	}
}
