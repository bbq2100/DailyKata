package kata.functional.happynumber;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class HappyNumberTest {

	@Test
	public void testIsAHappyNumber() {
		assertThat(new HappyNumber(19).isAHappyNumber(), is(true));
		assertThat(new HappyNumber(1).isAHappyNumber(), is(true));
		assertThat(new HappyNumber(7).isAHappyNumber(), is(true));
		assertThat(new HappyNumber(656).isAHappyNumber(), is(true));
		assertThat(new HappyNumber(188).isAHappyNumber(), is(true));
	}

	@Test
	public void testIsNotAHappyNumber() {
		assertThat(new HappyNumber(-1).isAHappyNumber(), is(false));
		assertThat(new HappyNumber(20).isAHappyNumber(), is(false));
		assertThat(new HappyNumber(777).isAHappyNumber(), is(false));
		assertThat(new HappyNumber(127).isAHappyNumber(), is(false));
	}

}
