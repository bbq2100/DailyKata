package kata.tdd.money;

import static org.junit.Assert.*;
import kata.tdd.money.Dollar;

import org.junit.Test;

public class TestMoney {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
		
		assertTrue(new Franc(5).equals(new Franc(5)));
		assertFalse(new Franc(5).equals(new Franc(16)));
		
		assertFalse(new Franc(5).equals(new Dollar(5)));
	}
	
	@Test
	public void testFrancMultiplication(){
		Franc franc = new Franc(5);
		assertEquals(new Franc(10), franc.times(2));
		assertEquals(new Franc(15), franc.times(3));
	}
	
}
