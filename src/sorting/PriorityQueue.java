package sorting;

import java.util.ArrayList;
import java.util.List;

public class PriorityQueue<T extends Comparable<T>> {

	private List<T> priorityQueue;
	private BinaryHeap heap;

	public PriorityQueue() {
		this.priorityQueue = new ArrayList<>();
		this.heap = new BinaryHeap<>();
	}

	public void modifyKey(final int index, final T newKey) {

	}
	public void add(final T element) {
		this.heap.addElement();
		//priorityQueue
	}

	public T peek() {
		if (this.heap.getHeapSize() > 0) {
			return this.priorityQueue.get(0);
		}
		return null;
	}

	public T poll() {
		return null;
	}

	public void remove(final T element) {

	}

	public boolean contains(final T element) {
		return true;
	}
	public int size() {
		return this.priorityQueue.size();
	}
}
