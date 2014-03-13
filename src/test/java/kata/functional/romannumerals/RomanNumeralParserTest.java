package kata.functional.romannumerals;

import static org.junit.Assert.*;
import kata.functional.romannumerals.RomanNumeralParser;

import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {

	@Test
	public void testParsingFromRomanToDecimal() {
		assertThat(new RomanNumeralParser("I").parseFromRomanToDecimal(), is(equalTo(1)));
		assertThat(new RomanNumeralParser("II").parseFromRomanToDecimal(), is(equalTo(2)));
		assertThat(new RomanNumeralParser("IV").parseFromRomanToDecimal(), is(equalTo(4)));
		assertThat(new RomanNumeralParser("V").parseFromRomanToDecimal(), is(equalTo(5)));
		assertThat(new RomanNumeralParser("VI").parseFromRomanToDecimal(), is(equalTo(6)));
		assertThat(new RomanNumeralParser("IX").parseFromRomanToDecimal(), is(equalTo(9)));
		assertThat(new RomanNumeralParser("XLII").parseFromRomanToDecimal(), is(equalTo(42)));
		assertThat(new RomanNumeralParser("XCIX").parseFromRomanToDecimal(), is(equalTo(99)));
		assertThat(new RomanNumeralParser("MMXIII").parseFromRomanToDecimal(), is(equalTo(2013)));
		assertThat(new RomanNumeralParser("MMXIV").parseFromRomanToDecimal(), is(equalTo(2014)));
		assertThat(new RomanNumeralParser("MCMXC").parseFromRomanToDecimal(), is(equalTo(1990)));
		assertThat(new RomanNumeralParser("MDCLXVI").parseFromRomanToDecimal(), is(equalTo(1666)));
		assertThat(new RomanNumeralParser("MMVIII").parseFromRomanToDecimal(), is(equalTo(2008)));
	}

}
