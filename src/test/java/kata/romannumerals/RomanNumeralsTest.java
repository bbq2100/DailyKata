package kata.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void testParseOrdinaryRomanFiguresToDecimal() {
		assertEquals(1, RomanNumerals.parseFromRomanToDecimal("I")); 
		assertEquals(2, RomanNumerals.parseFromRomanToDecimal("II"));
		assertEquals(3, RomanNumerals.parseFromRomanToDecimal("III"));
		assertEquals(4, RomanNumerals.parseFromRomanToDecimal("IV"));
		assertEquals(5, RomanNumerals.parseFromRomanToDecimal("V"));
	}
	
}
