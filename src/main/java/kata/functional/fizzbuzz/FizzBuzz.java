package kata.functional.fizzbuzz;

public class FizzBuzz {

	public String getResult(int number) {
		final int baseOf3 = 3;
		final int baseOf5 = 5;

		if(isNotAValidNumber(number)) return "Invalid Number";
		else if (isMultipleOfBase(number, baseOf3) && isMultipleOfBase(number, baseOf5)) return "FizzBuzz";
		else if (isMultipleOfBase(number, baseOf3)) return "Fizz";
		else if (isMultipleOfBase(number, baseOf5)) return "Buzz";
		
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
