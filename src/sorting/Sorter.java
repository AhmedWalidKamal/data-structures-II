package sorting;

import java.util.ArrayList;
import java.util.Comparator;

public class Sorter<T extends Comparable<T>> {

	public final void heapSort(final T[] array) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(array);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(array, 0, i);
			heap.removeLast();
			heap.heapify(array, 0);
		}
	}

	public final void heapSort(final ArrayList<T> list) {
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

	public final void heapSort(final ArrayList<T> list, final Comparator<T> comparator) {
		BinaryHeap<T> heap = new BinaryHeap<T>();
		heap.buildHeap(list, comparator);
		for (int i = heap.getHeapSize() - 1; i >= 1; i--) {
			heap.swap(list, 0, i);
			heap.removeLast();
			heap.heapify(list, 0, comparator);
		}
	}
}
