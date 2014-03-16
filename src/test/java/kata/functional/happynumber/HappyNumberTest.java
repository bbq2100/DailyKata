package kata.functional.happynumber;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void testIsAHappyNumber() {
		HappyNumber happyNumber = new HappyNumber(19);
		assertThat(happyNumber.isAHappyNumber(), is(true));
	}

	@Test
	public void testIsNotAHappyNumber() {
		HappyNumber happyNumber = new HappyNumber(-1);
		assertThat(happyNumber.isAHappyNumber(), is(false));
		// assertThat(happyNumber.isAHappyNumber(20), is(false));
	}

}
