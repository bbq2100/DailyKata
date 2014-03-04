package kata;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testOrdinaryFigures() {
		FizzBuzz fizzBuzz = new FizzBuzz();

		String result = fizzBuzz.getResult(1);
		assertEquals("1", result);
		
		String result2 = fizzBuzz.getResult(2);
		assertEquals("2", result2);
		
	}

	@Test
	public void testInvalidNumber() {
		assertEquals("Invalid Number", new FizzBuzz().getResult(-4848));
	}
	
	@Test
	public void testMultipleOf3() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.getResult(3));
		assertEquals("Fizz", fizzBuzz.getResult(6));
		assertEquals("Fizz", fizzBuzz.getResult(99));
	}

	@Test
	public void testMultipleOf5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Buzz", fizzBuzz.getResult(5));
	}
	
	@Test
	public void testMultipleOf3And5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.getResult(15));
		assertEquals("FizzBuzz", fizzBuzz.getResult(30));
	}
	
}
