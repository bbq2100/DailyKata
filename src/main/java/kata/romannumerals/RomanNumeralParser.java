package kata.romannumerals;

public class RomanNumeralParser {

	public static int parse(String romanFigure) {
		int result = 0;
		char[] charArray = romanFigure.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == 'I') {
				if(i+1 < charArray.length) {
					if(charArray[i+1] == 'V') {
						result += 4;
						i += 2; //jump to next second char
					}
					else {
						result += 1;
					}
				}
				else {
					result += 1;
				}
			}
			else if (charArray[i] == 'V') {
				result += 5;
			}
			
		}
		return result;
	}

}
