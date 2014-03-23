package kata.clazz.boundedqueue;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Test;

public class TestBoundedQueue {

	@Test
	public void testBasicQueueMechanism() {
		BoundedQueue<Integer> queue = new BoundedQueue<>(2);
		assertThat(queue.size(), equalTo(2));
		assertThat(queue.count(), equalTo(0));
		queue.enqueue(45);
		assertThat(queue.count(), equalTo(1));
		assertThat(queue.dequeue(), equalTo(45));
		assertThat(queue.count(), equalTo(0));
	}

	@Test
	public void testParallelAccess() throws InterruptedException, ExecutionException {
		final BoundedQueue<Integer> cut = new BoundedQueue<>(2);
		ExecutorService executorService = Executors.newCachedThreadPool();

		Callable<List<Integer>> readingTask = new Callable<List<Integer>>() {
			@Override
			public List<Integer> call() throws Exception {
				List<Integer> result = new ArrayList<>();
				result.add(cut.dequeue());
				result.add(cut.dequeue());
				result.add(cut.dequeue());
				result.add(cut.dequeue());
				result.add(cut.dequeue());
				return result;
			}
		};

		Runnable writingTask = new Runnable() {
			@Override
			public void run() {
				cut.enqueue(1);
				cut.enqueue(2);
				cut.enqueue(3);
				cut.enqueue(4);
				cut.enqueue(5);
			}
		};

		Future<List<Integer>> futureResultFromReadingThread = executorService.submit(readingTask);
		executorService.submit(writingTask);

		List<Integer> resultFromReadingThread = futureResultFromReadingThread.get();

		// implicit asserting the correct order
		assertThat(resultFromReadingThread, contains(1, 2, 3, 4, 5));

		executorService.shutdown();
	}

}
