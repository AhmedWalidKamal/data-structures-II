package heap;

import java.util.Comparator;
import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {

	private int heapSize = 0;
	private Comparator<T> comparator;
	public BinaryHeap(final Comparator<T> comparator) {
		this.heapSize = 0;
		this.comparator = comparator;
	}

	public void buildHeap(final T[] array) {
		this.heapSize = array.length;
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(array, i);
		}
	}

	public void buildHeap(final List<T> list) {
		this.heapSize = list.size();
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(list, i);
		}
	}

	public int getHeapSize() {
		return this.heapSize;
	}

	public void heapify(final List<T> list, final int index) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && this.comparator.
				compare(list.get(leftChild), list.get(index)) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && this.comparator.
				compare(list.get(rightChild), list.get(highestPriority)) > 0) {
			highestPriority = rightChild;
		}
		if (highestPriority != index) {
			swap(list, index, highestPriority);
			heapify(list, highestPriority);
		}
	}

	public void heapify(final T[] array, final int index) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && this.comparator.
				compare(array[leftChild], array[index]) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && this.comparator.
				compare(array[rightChild], array[highestPriority]) > 0) {
			highestPriority = rightChild;
		}
		if (highestPriority != index) {
			swap(array, index, highestPriority);
			heapify(array, highestPriority);
		}
	}

	private int parent(final int index) {
		if (index == 0) {
			return -1;
		}
		return (index - 1) / 2;
	}

	public void swap(final T[] array, final int firstIndex, final int secondIndex) {
		T temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
	}

	public void swap(final List<T> list, final int firstIndex, final int secondIndex) {
		T temp = list.get(firstIndex);
		list.set(firstIndex, list.get(secondIndex));
		list.set(secondIndex, temp);
	}

	public void removeLast() {
		this.heapSize--;
	}

	public void addElement() {
		this.heapSize++;
	}

	public void clear() {
		this.heapSize = 0;
	}

	public T peek(final List<T> list) {
		return list.get(0);
	}

	public T extractTop(final List<T> list) {
		T topElement = list.get(0);
		list.set(0, list.get(list.size() - 1));
		removeLast();
		list.remove(list.size() - 1);
		heapify(list, 0);
		return topElement;
	}

	public void siftUp(final List<T> list, int index) {
		while (index > 0 && comparator.compare(list.get(index), list.get(parent(index))) > 0) {
			swap(list, index, parent(index));
			index = parent(index);
		}
	}
}
