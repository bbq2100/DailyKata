package kata.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {
	
	@Test
	public void testParsingFromRomanToDecimal() {
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("I"), is(equalTo(1990)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("II"), is(equalTo(2)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("IV"), is(equalTo(4)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("V"), is(equalTo(5)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("IX"), is(equalTo(9)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("XLII"), is(equalTo(42)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("XCIX"), is(equalTo(99)));
		assertThat(RomanNumeralParser.parseFromRomanToDecimal("MMXIII"), is(equalTo(2013)));
	}

}
