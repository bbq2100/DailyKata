package kata.tdd.money;

import static org.junit.Assert.*;
import kata.tdd.money.Dollar;

import org.junit.Test;

public class TestMoney {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
