package kata.romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.Matchers.*;

public class RomanNumeralParserTest {

	@Test
	public void test() {
		assertThat(new RomanNumeralParser(), is(notNullValue()));
	}

}
