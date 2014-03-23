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
		blockIfQueueHasReachedMax();
		this.blockingQueue.add(element);
	}

	public void blockIfQueueHasReachedMax() {
		while(blockingQueue.size() == maxSize);
	}

	public T dequeue() {
		blockIfQueueIsEmpty(); 
		return blockingQueue.poll();
	}

	public void blockIfQueueIsEmpty() {
		while(blockingQueue.size() == 0);
	}
 
	public int count() {
		return blockingQueue.size();
	}

	public int size() {
		return maxSize;
	}

}
