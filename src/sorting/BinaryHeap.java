package sorting;

import java.util.Comparator;
import java.util.List;

public class BinaryHeap<T extends Comparable<T>> {

	private int heapSize = 0;

	public BinaryHeap() {
		this.heapSize = 0;
	}

	public void buildHeap(final T[] array) {
		this.heapSize = array.length;
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(array, i);
		}
	}

	public void buildHeap(final T[] array, final Comparator<T> comparator) {
		this.heapSize = array.length;
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(array, i, comparator);
		}
	}

	public void buildHeap(final List<T> list) {
		this.heapSize = list.size();
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(list, i);
		}
	}

	public void buildHeap(final List<T> list, final Comparator<T> comparator) {
		this.heapSize = list.size();
		for (int i = heapSize / 2; i >= 0; i--) {
			heapify(list, i, comparator);
		}
	}

	public int getHeapSize() {
		return this.heapSize;
	}

	public void heapify(final List<T> list, final int index) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && list.get(leftChild).
				compareTo(list.get(index)) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && list.get(rightChild).
				compareTo(list.get(highestPriority)) > 0) {
			highestPriority = rightChild;
		}
		if (highestPriority != index) {
			swap(list, index, highestPriority);
			heapify(list, highestPriority);
		}
	}

	public void heapify(final List<T> list, final int index, final Comparator<T> comparator) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && comparator.
				compare(list.get(leftChild), list.get(index)) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && comparator.
				compare(list.get(rightChild), list.get(highestPriority)) > 0) {
			highestPriority = rightChild;
		}
		if (highestPriority != index) {
			swap(list, index, highestPriority);
			heapify(list, highestPriority, comparator);
		}
	}

	public void heapify(final T[] array, final int index) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && array[leftChild].
				compareTo(array[index]) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && array[rightChild].
				compareTo(array[highestPriority]) > 0) {
			highestPriority = rightChild;
		}

		if (highestPriority != index) {
			swap(array, index, highestPriority);
			heapify(array, highestPriority);
		}
	}

	public void heapify(final T[] array, final int index, final Comparator<T> comparator) {
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		int highestPriority = index;
		if (leftChild < heapSize && comparator.compare(array[leftChild], array[index]) > 0) {
			highestPriority = leftChild;
		}
		if (rightChild < heapSize && comparator.compare(array[rightChild], array[highestPriority]) > 0) {
			highestPriority = rightChild;
		}

		if (highestPriority != index) {
			swap(array, index, highestPriority);
			heapify(array, highestPriority, comparator);
		}
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
}
