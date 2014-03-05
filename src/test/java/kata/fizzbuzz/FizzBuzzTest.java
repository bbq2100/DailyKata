package kata.fizzbuzz;

import static org.junit.Assert.*;
import kata.fizzbuzz.FizzBuzz;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testOrdinaryFigures() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("1", fizzBuzz.getResult(1));
		assertEquals("2", fizzBuzz.getResult(2));
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
		assertEquals("Buzz", new FizzBuzz().getResult(5));
	}
	
	@Test
	public void testMultipleOf3And5() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("FizzBuzz", fizzBuzz.getResult(15));
		assertEquals("FizzBuzz", fizzBuzz.getResult(30));
	}
	
}
