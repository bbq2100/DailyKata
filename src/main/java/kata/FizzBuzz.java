package kata;

public class FizzBuzz {

	public String getResult(int i) {
		if(isNotAValidNumber(i)) return "Invalid Number";
		else if (isMultipleOf3(i) && isMultipleOf5(i)) return "FizzBuzz";
		else if (isMultipleOf3(i)) return "Fizz";
		else if (isMultipleOf5(i)) return "Buzz";
		return getOrdinaryNumber(i);
	}

	private String getOrdinaryNumber(int i) {
		return Integer.toString(i);
	}

	private boolean isNotAValidNumber(int i) {
		return i < 0 || i > 100;
	}

	private boolean isMultipleOf5(int i) {
		return i % 5 == 0;
	}

	private boolean isMultipleOf3(int i) {
		return i % 3 == 0;
	}
}
