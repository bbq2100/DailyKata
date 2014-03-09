package kata.romannumerals;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void testParseOrdinaryRomanFiguresToDecimal() {
		assertThat(1, is(equalTo(RomanNumerals.parseFromRomanToDecimal("I"))));
		assertThat(2, is(equalTo(RomanNumerals.parseFromRomanToDecimal("II"))));
		assertThat(3, is(equalTo(RomanNumerals.parseFromRomanToDecimal("III"))));
		assertThat(4, is(equalTo(RomanNumerals.parseFromRomanToDecimal("IV"))));
		assertThat(5, is(equalTo(RomanNumerals.parseFromRomanToDecimal("V"))));
	}

}
