package kata.clazz.boundedqueue;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TestBoundedQueue {

	@Test
	public void test() {
		BoundedQueue<Integer> queue = new BoundedQueue<>(2);
		assertThat(queue, notNullValue());
	}

}
