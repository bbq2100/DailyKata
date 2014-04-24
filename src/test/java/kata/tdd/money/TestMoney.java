package kata.tdd.money;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMoney {

	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}

	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}

	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

	@Test
	public void testSimpleAddition() {
		Money fiveDollar = Money.dollar(5);
		Bank bank = new Bank();
		Expression expression = fiveDollar.plus(Money.dollar(5));
		Money reduced = bank.reduce(expression, "USD");
		assertEquals(Money.dollar(10), reduced);
	}
}
