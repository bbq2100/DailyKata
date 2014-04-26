package kata.tdd.money;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
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
		Expression expression = fiveDollar.plus(fiveDollar);
		Money reduced = bank.reduce(expression, "USD");
		assertEquals(Money.dollar(10), reduced);
	}

	@Test
	public void testPlusReturnSum() {
		Money fiveDollar = Money.dollar(5);
		Expression result = fiveDollar.plus(fiveDollar);
		assertThat(result, is(Sum.class));
		Sum sum = (Sum) result;
		assertEquals(fiveDollar, sum.augend);
		assertEquals(fiveDollar, sum.addend);
	}

	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Money reduce = new Bank().reduce(sum, "USD");
		assertEquals(Money.dollar(7), reduce);
	}

	@Test
	public void testReduceMoney() {
		Money fiveDollar = Money.dollar(5);
		Money reduce = new Bank().reduce(fiveDollar, "USD");
		assertEquals(Money.dollar(5), reduce);
	}
}
