package kata.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {

	@Test
	public void testParsingFromRomanToDecimal() {
		assertThat(new RomanNumeralParser("I").parseFromRomanToDecimal(), is(equalTo(1)));
		assertThat(new RomanNumeralParser("II").parseFromRomanToDecimal(), is(equalTo(2)));
		assertThat(new RomanNumeralParser("IV").parseFromRomanToDecimal(), is(equalTo(4)));
//		assertThat(RomanNumeralParser.parseFromRomanToDecimal("V"), is(equalTo(5)));
//		assertThat(RomanNumeralParser.parseFromRomanToDecimal("IX"), is(equalTo(9)));
//		assertThat(RomanNumeralParser.parseFromRomanToDecimal("XLII"), is(equalTo(42)));
//		assertThat(RomanNumeralParser.parseFromRomanToDecimal("XCIX"), is(equalTo(99)));
//		assertThat(RomanNumeralParser.parseFromRomanToDecimal("MMXIII"), is(equalTo(2013)));
	}

}
