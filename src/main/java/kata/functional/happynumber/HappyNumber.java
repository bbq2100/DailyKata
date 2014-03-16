package kata.functional.happynumber;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

	private int number;
	
	public HappyNumber(int number) {
		this.number = number;
	}

	public boolean isAHappyNumber() {
		if(isPositiv()) {
			return determineHappiness();
		}
		return false;
	}

	private boolean determineHappiness() {
		List<Integer> digits = new ArrayList<>();
		while(isNotMostLeftDigit()) {
			int mostRightDigit = number % 10;
			digits.add(mostRightDigit);
			number /= 10;
		}
	}

	private boolean isNotMostLeftDigit() {
		return ! (number / 10 == 0);
	}

	public boolean isPositiv() {
		return number > 0;
	}

}
