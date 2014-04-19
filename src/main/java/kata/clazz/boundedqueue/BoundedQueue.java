package kata.clazz.boundedqueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedQueue<T> {
	private Queue<T> blockingQueue = new ConcurrentLinkedQueue<>();
	private final int maxSize;
	private boolean isBlocked;

	public BoundedQueue(int size) {
		this.maxSize = size;
	}

	public synchronized void enqueue(T element) {
		blockIfQueueHasReachedMax();
		this.blockingQueue.add(element);
		unblockSiblingThread();
	}

	private void unblockSiblingThread() {
		if (isBlocked) {
			notify();
			isBlocked = false;
		}
	}

	private void blockIfQueueHasReachedMax() {
		if ((blockingQueue.size() == maxSize)) {
			try {
				isBlocked = true;
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public synchronized T dequeue() {
		blockIfQueueIsEmpty();
		T poll = blockingQueue.poll();
		unblockSiblingThread();
		return poll;
	}

	private void blockIfQueueIsEmpty() {
		if ((blockingQueue.size() == 0)) {
			try {
				isBlocked = true;
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public int count() {
		return blockingQueue.size();
	}

	public int size() {
		return maxSize;
	}

}
