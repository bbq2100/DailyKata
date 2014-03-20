package kata.clazz.boundedqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedQueue<T> {
	private Queue<T> blockingQueue = new ConcurrentLinkedQueue<>();
	private final int maxSize;

	public BoundedQueue(int size) {
		this.maxSize = size;
	}

	public void enqueue(T element) {
		this.blockingQueue.add(element);
	}

	public T dequeue() {
		return blockingQueue.poll();
	}
 
	public int count() {
		return blockingQueue.size();
	}

	public int size() {
		return maxSize;
	}

}
