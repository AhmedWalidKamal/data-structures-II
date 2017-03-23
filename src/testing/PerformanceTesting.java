package testing;

import java.util.Random;

import util.Sortings;

public class PerformanceTesting {

	public static final int SIZE = 10000;

	public static void main(final String[] args) {
		runSortings(SIZE);
	}

	private static void runSortings(final int size) {
		Integer[] arr1 = new Integer[size];
		Integer[] arr2 = new Integer[size];
		Integer[] arr3 = new Integer[size];
		Integer[] arr4 = new Integer[size];
		Integer[] arr5 = new Integer[size];
		Integer[] arr6 = new Integer[size];
		populateArray(arr1, size);
		copyArray(arr1, arr2);
		copyArray(arr1, arr3);
		copyArray(arr1, arr4);
		copyArray(arr1, arr5);
		copyArray(arr1, arr6);

		System.out.println("Measuring the performance on an array of size = " + SIZE + ":");
		long start = System.currentTimeMillis();
		Sortings.mergeSort(arr1, 0, arr1.length - 1);
		long finish = System.currentTimeMillis();
		System.out.println("Merge sort took: " + (finish - start) + " ms.");

		start = System.currentTimeMillis();
		Sortings.quickSort(arr2, 0, arr2.length - 1);
		finish = System.currentTimeMillis();
		System.out.println("Quick sort took: " + (finish - start) + " ms.");

		start = System.currentTimeMillis();
		Sortings.heapSort(arr3);
		finish = System.currentTimeMillis();
		System.out.println("Heap sort took: " + (finish - start) + " ms.");

		start = System.currentTimeMillis();
		Sortings.insertionSort(arr4);
		finish = System.currentTimeMillis();
		System.out.println("Insertion sort took: " + (finish - start) + " ms.");

		start = System.currentTimeMillis();
		Sortings.bubbleSort(arr5);
		finish = System.currentTimeMillis();
		System.out.println("Bubble sort took: " + (finish - start) + " ms.");

		start = System.currentTimeMillis();
		Sortings.selectionSort(arr6);
		finish = System.currentTimeMillis();
		System.out.println("Selection sort took: " + (finish - start) + " ms.");
	}

	private static void copyArray(final Integer[] source, final Integer[] dest) {
		for (int i = 0; i < source.length; i++) {
			dest[i] = source[i];
		}
	}

	private static void populateArray(final Integer[] array, final int size) {
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt();
		}
	}
}
