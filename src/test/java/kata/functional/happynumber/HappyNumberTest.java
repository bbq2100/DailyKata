package kata.functional.happynumber;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class HappyNumberTest {

	HappyNumber cut = new HappyNumber();
	
	@Test
	public void testIsAHappyNumber() {
		assertThat(cut.isAHappyNumber(19), is(true));
		assertThat(cut.isAHappyNumber(1), is(true));
		assertThat(cut.isAHappyNumber(7), is(true));
		assertThat(cut.isAHappyNumber(656), is(true));
		assertThat(cut.isAHappyNumber(188), is(true));
	}

	@Test
	public void testIsNotAHappyNumber() {
		assertThat(cut.isAHappyNumber(-1), is(false));
		assertThat(cut.isAHappyNumber(20), is(false));
		assertThat(cut.isAHappyNumber(777), is(false));
		assertThat(cut.isAHappyNumber(127), is(false));
	}

}
