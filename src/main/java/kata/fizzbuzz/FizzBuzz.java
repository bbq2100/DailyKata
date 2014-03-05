package kata.fizzbuzz;

public class FizzBuzz {

	public String getResult(int number) {
		if(isNotAValidNumber(number)) return "Invalid Number";
		else if (isMultipleOfBase(number, 3) && isMultipleOfBase(number, 5)) return "FizzBuzz";
		else if (isMultipleOfBase(number, 3)) return "Fizz";
		else if (isMultipleOfBase(number, 5)) return "Buzz";
		return getOrdinaryNumber(number);
	}

	private String getOrdinaryNumber(int number) {
		return Integer.toString(number);
	}

	private boolean isNotAValidNumber(int number) {
		return number < 0 || number > 100;
	}

	private boolean isMultipleOfBase(int number, int base) {
		return number % base == 0;
	}
}
