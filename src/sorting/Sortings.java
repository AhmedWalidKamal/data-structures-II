package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sortings<T extends Comparable<T>> {

	public final void heapSort(final T[] array) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(array);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(array, 0, i);
			heap.removeLast();
			heap.heapify(array, 0);
		}
	}

	public final void heapSort(final List<T> list) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(list);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(list, 0, i);
			heap.removeLast();
			heap.heapify(list, 0);
		}
	}

	public final void heapSort(final T[] array, final Comparator<T> comparator) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(array, comparator);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(array, 0, i);
			heap.removeLast();
			heap.heapify(array, 0, comparator);
		}
	}

	public final void heapSort(final List<T> list, final Comparator<T> comparator) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(list, comparator);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(list, 0, i);
			heap.removeLast();
			heap.heapify(list, 0, comparator);
		}
	}

	public static <T extends Comparable<T>> void selectionSort(final T[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[index]) < 0) {
					index = j;
				}
			}
			swap(array, i, index);
		}
	}

	private static<T extends Comparable<T>> void swap(final T[] array, final int ind1, final int ind2) {
		T temp = array[ind1];
		array[ind1] = array[ind2];
		array[ind2] = temp;
	}

	public static <T extends Comparable<T>> void bubbleSort(final T[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j + 1].compareTo(array[j]) < 0) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	public static <T extends Comparable<T>> void insertionSort(final T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (array[j + 1].compareTo(array[j]) < 0) {
					swap(array, j, j + 1);
				}
			}
		}
	}

	public static <T extends Comparable<T>> void mergeSort(final T[] array,
			final int start, final int end) {
		if (end > start) {
			int middle = (start + end) / 2;
			mergeSort(array, start, middle);
			mergeSort(array, middle + 1, end);
			merge(array, start, middle, middle + 1, end);
		}
	}

	private static <T extends Comparable<T>> void merge(final T[] array,
			int firstHalfStart, final int firstHalfEnd,
			int secondHalfStart, final int secondHalfEnd) {
		int length = secondHalfEnd - firstHalfStart + 1, from = firstHalfStart;
		List<T> auxilary = new ArrayList<>();
		while (firstHalfStart <= firstHalfEnd && secondHalfStart <= secondHalfEnd) {
			if (array[firstHalfStart].compareTo(array[secondHalfStart]) < 0) {
				auxilary.add(array[firstHalfStart++]);
			} else {
				auxilary.add(array[secondHalfStart++]);
			}
		}
		while (firstHalfStart <= firstHalfEnd) {
			auxilary.add(array[firstHalfStart++]);
		}
		while (secondHalfStart <= secondHalfEnd) {
			auxilary.add(array[secondHalfStart++]);
		}

		for (int i = 0; i < length; i++) {
			array[i + from] = auxilary.get(i);
		}
	}
}
