package kata.functional.happynumber;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	private static final int HAPPY_NUMBER = 1;
	private int number;
	
	public boolean isAHappyNumber(int number) {
		this.number = number;
		if(isPositiv()) {
			return determineHappiness();
		}
		return false;
	}

	private boolean determineHappiness() {
		while (true) {
			List<Integer> digitsFromNumber = getDigitsFromNumber();
			number = squareAndSumAllDigits(digitsFromNumber);
			if(number == HAPPY_NUMBER) return true;
			else if(isSingleDigitLeft()) return false;
		}
	}
	 
	private boolean isSingleDigitLeft() {
		return (number / 10 == 0 );
	}

	private int squareAndSumAllDigits(List<Integer> digitsFromNumber) {
		int result = 0;
		for (Integer digit : digitsFromNumber) {
			result += digit * digit;
		}
		return result;
	}

	private List<Integer> getDigitsFromNumber(){
		List<Integer> digits = new ArrayList<>();

		while(isNotMostLeftDigit()) {
			int mostRightDigit = number % 10;
			digits.add(mostRightDigit);
			number /= 10;
		}
		
		return digits;
	}
	
	
	private boolean isNotMostLeftDigit() {
		return ! (number == 0);
	}

	public boolean isPositiv() {
		return number > 0;
	}

}
