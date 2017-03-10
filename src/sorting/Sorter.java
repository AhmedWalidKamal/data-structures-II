package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter<T extends Comparable<T>> {

	public final void heapSort(final T[] array) {
		BinaryHeap<T> heap = new BinaryHeap<>(array);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(0, heap.getHeapSize() - 1);
			heap.removeLast();
			heap.heapify(0);
		}
	}

	public final void heapSort(final ArrayList<T> array) {
		BinaryHeap<T> heap = new BinaryHeap<>(array);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(0, heap.getHeapSize() - 1);
			heap.removeLast();
			heap.heapify(0);
		}
	}

	public final void heapSort(final T[] array, final Comparator<T> comparator) {
		BinaryHeap<T> heap = new BinaryHeap<>(array, comparator);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(0, heap.getHeapSize() - 1);
			heap.removeLast();
			heap.heapify(0);
		}
	}
}
