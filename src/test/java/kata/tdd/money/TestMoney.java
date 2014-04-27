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
		Expression fiveDollar = Money.dollar(5);
		Bank bank = new Bank();
		Expression expression = fiveDollar.plus(fiveDollar);
		Expression reduced = bank.reduce(expression, "USD");
		assertEquals(Money.dollar(10), reduced);
	}

	@Test
	public void testPlusReturnSum() {
		Expression fiveDollar = Money.dollar(5);
		Expression result = fiveDollar.plus(fiveDollar);
		assertThat(result, is(Sum.class));
		Sum sum = (Sum) result;
		assertEquals(fiveDollar, sum.augend);
		assertEquals(fiveDollar, sum.addend);
	}

	@Test
	public void testReduceSum() {
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Expression reduce = new Bank().reduce(sum, "USD");
		assertEquals(Money.dollar(7), reduce);
	}

	@Test
	public void testReduceMoney() {
		Expression fiveDollar = Money.dollar(5);
		Expression reduce = new Bank().reduce(fiveDollar, "USD");
		assertEquals(Money.dollar(5), reduce);
	}

	@Test
	public void testReduceMoneyDifferentCurrency() {
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression reduce = bank.reduce(Money.franc(2), "USD");
		assertEquals(Money.dollar(1), reduce);
	}

	@Test
	public void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}

	@Test
	public void testMixedCurrencyAddition() {
		Expression fiveDollar = Money.dollar(5);
		Expression tenFrancs = Money.franc(10);
		Bank bank = new Bank();

		bank.addRate("CHF", "USD", 2);
		Expression mixedCurrencyResult = fiveDollar.plus(tenFrancs);
		assertThat(mixedCurrencyResult, is(Sum.class));

		Expression reducedMoney = bank.reduce(mixedCurrencyResult, "USD");
		assertEquals(Money.dollar(10), reducedMoney);
	}

	@Test
	public void testSumPlusMoney() {
		Expression fiveDollar = Money.dollar(5);
		Expression tenFranc = Money.franc(10);
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveDollar, tenFranc).plus(fiveDollar);
		Expression result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(15), result);
	}

	@Test
	public void testSumTimes() {
		Expression fiveDollar = Money.dollar(5);
		Expression tenFranc = Money.franc(10);
		Bank bank = new Bank();
		bank.addRate("CHF", "USD", 2);
		Expression sum = new Sum(fiveDollar, tenFranc).times(2);
		Expression result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(20), result);
	}

}
