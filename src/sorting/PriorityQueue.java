package sorting;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {

	private List<T> priorityQueue;
	private BinaryHeap<T> heap;

	public PriorityQueue() {
		this.priorityQueue = new ArrayList<T>();
		this.heap = new BinaryHeap<>();
	}

	public void add(final T element) {
		this.heap.addElement();
		priorityQueue.add(element);
		this.heap.siftUp(priorityQueue, priorityQueue.size() - 1);
	}

	public void clear() {
		priorityQueue.clear();
		heap.clear();
	}

	public T peek() {
		if (this.heap.getHeapSize() > 0) {
			return this.heap.peek(this.priorityQueue);
		}
		return null;
	}

	public T poll() {
		if (this.heap.getHeapSize() == 0) {
			return null;
		}
		return this.heap.extractTop(priorityQueue);
	}

	//TODO: To be implemented
	public void remove(final T element) {

	}

	//TODO: To be implemented
	public boolean contains(final T element) {
		return true;
	}

	public int size() {
		return this.priorityQueue.size();
	}
}
