package kata.clazz.boundedqueue;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class TestBoundedQueue {

	@Test
	public void test() {
		BoundedQueue<Integer> queue = new BoundedQueue<>(2);
		assertThat(queue.size(), equalTo(2));
		assertThat(queue.count(), equalTo(0));
		queue.enqueue(45);
		assertThat(queue.count(), equalTo(1));
		assertThat(queue.dequeue(), equalTo(45));
		assertThat(queue.count(), equalTo(0));
	}

}
