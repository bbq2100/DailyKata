package kata.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {
	RomanNumeralParser cut = new RomanNumeralParser();

	@Test
	public void testParseOrdinaryNumber() {
		assertThat(cut.parseRomanNumeralToSyntaxTree("I"), is(notNullValue()));
	}

}
