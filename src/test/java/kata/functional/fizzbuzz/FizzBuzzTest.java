package kata.functional.fizzbuzz;

import static org.junit.Assert.*;
import kata.functional.fizzbuzz.FizzBuzz;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz cut = new FizzBuzz();
	
	@Test
	public void testOrdinaryFigures() {
		assertEquals("1", cut.getResult(1));
		assertEquals("2", cut.getResult(2));
	}

	@Test
	public void testInvalidNumber() {
		assertEquals("Invalid Number", cut.getResult(-4848));
	}
	
	@Test
	public void testMultipleOf3() {
		assertEquals("Fizz", cut.getResult(3));
		assertEquals("Fizz", cut.getResult(6));
		assertEquals("Fizz", cut.getResult(99));
	}

	@Test
	public void testMultipleOf5() {
		assertEquals("Buzz", cut.getResult(5));
		assertEquals("Buzz", cut.getResult(55));
	}
	
	@Test
	public void testMultipleOf3And5() {
		assertEquals("FizzBuzz", cut.getResult(15));
		assertEquals("FizzBuzz", cut.getResult(30));
	}
	
}
