package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BinaryHeap<T extends Comparable<T>> {

	private ArrayList<T> heap;
	private int heapSize = 0;
	private Comparator<T> comparator = null;

	public BinaryHeap(final T[] data) {
		this.heap = new ArrayList<>(Arrays.asList(data));
		this.heapSize = heap.size();
		buildHeap();
	}

	public BinaryHeap(final ArrayList<T> data) {
		this.heap = data;
		this.heapSize = heap.size();
		buildHeap();
	}

	public BinaryHeap(final T[] data, final Comparator<T> comparator) {
		this.heap = new ArrayList<>(Arrays.asList(data));
		this.heapSize = heap.size();
		this.comparator = comparator;
		buildHeap();
	}

	public BinaryHeap(final ArrayList<T> data, final Comparator<T> comparator) {
		this.heap = data;
		this.heapSize = heap.size();
		this.comparator = comparator;
		buildHeap();
	}

	public void buildHeap() {
		for (int i = heapSize / 2 - 1; i >= 0; i--) {
			heapify(i);
		}
	}

	public int getHeapSize() {
		return this.heapSize;
	}

	public void heapify(final int index) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (this.comparator == null) {
			if (leftChild < heapSize && heap.get(leftChild).
					compareTo(heap.get(index)) > 0) {
				highestPriority = leftChild;
			}
			if (rightChild < heapSize && heap.get(rightChild).
					compareTo(heap.get(highestPriority)) > 0) {
				highestPriority = rightChild;
			}
		} else {
			if (leftChild < heapSize && this.comparator.
					compare(heap.get(leftChild), heap.get(index)) > 0) {
				highestPriority = leftChild;
			}
			if (rightChild < heapSize && this.comparator.
					compare(heap.get(rightChild), heap.get(highestPriority)) > 0) {
				highestPriority = rightChild;
			}
		}
		if (highestPriority != index) {
			swap(index, highestPriority);
			heapify(highestPriority);
		}
	}

	public void swap(final int firstIndex, final int secondIndex) {
		T temp = heap.get(firstIndex);
		heap.set(firstIndex, heap.get(secondIndex));
		heap.set(secondIndex, temp);
	}

	public void removeLast() {
		this.heapSize--;
	}
}
