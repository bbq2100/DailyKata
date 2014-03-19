package kata.functional.romannumerals;

import static org.junit.Assert.*;
import kata.functional.romannumerals.RomanNumeralParser;

import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {

	RomanNumeralParser cut = new RomanNumeralParser();
	
	@Test
	public void testParsingFromRomanToDecimal() {
		assertThat(cut.parseFromRomanToDecimal("I"), is(equalTo(1)));
		assertThat(cut.parseFromRomanToDecimal("II"), is(equalTo(2)));
		assertThat(cut.parseFromRomanToDecimal("IV"), is(equalTo(4)));
		assertThat(cut.parseFromRomanToDecimal("V"), is(equalTo(5)));
		assertThat(cut.parseFromRomanToDecimal("VI"), is(equalTo(6)));
		assertThat(cut.parseFromRomanToDecimal("IX"), is(equalTo(9)));
		assertThat(cut.parseFromRomanToDecimal("XLII"), is(equalTo(42)));
		assertThat(cut.parseFromRomanToDecimal("XCIX"), is(equalTo(99)));
		assertThat(cut.parseFromRomanToDecimal("MMXIII"), is(equalTo(2013)));
		assertThat(cut.parseFromRomanToDecimal("MMXIV"), is(equalTo(2014)));
		assertThat(cut.parseFromRomanToDecimal("MCMXC"), is(equalTo(1990)));
		assertThat(cut.parseFromRomanToDecimal("MDCLXVI"), is(equalTo(1666)));
		assertThat(cut.parseFromRomanToDecimal("MMVIII"), is(equalTo(2008)));
	}

}
