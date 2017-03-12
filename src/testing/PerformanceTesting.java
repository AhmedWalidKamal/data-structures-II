package testing;

import java.util.Random;

import util.Sortings;

public class PerformanceTesting {

	private static int SIZE = 1000000;

	public static void main(final String[] args) {
		Integer[] arr1 = new Integer[SIZE];
		Integer[] arr2 = new Integer[SIZE];
		Integer[] arr3 = new Integer[SIZE];
		Integer[] arr4 = new Integer[SIZE];
		Integer[] arr5 = new Integer[SIZE];
		Integer[] arr6 = new Integer[SIZE];
		populateArray(arr1);
		copyArray(arr1, arr2);
		copyArray(arr1, arr3);
		copyArray(arr1, arr4);
		copyArray(arr1, arr5);
		copyArray(arr1, arr6);

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

//		start = System.currentTimeMillis();
//		Sortings.insertionSort(arr4);
//		finish = System.currentTimeMillis();
//		System.out.println("Insertion sort took: " + (finish - start) + " ms.");
//
//		start = System.currentTimeMillis();
//		Sortings.bubbleSort(arr5);
//		finish = System.currentTimeMillis();
//		System.out.println("Bubble sort took: " + (finish - start) + " ms.");
//
//		start = System.currentTimeMillis();
//		Sortings.selectionSort(arr6);
//		finish = System.currentTimeMillis();
//		System.out.println("Selection sort took: " + (finish - start) + " ms.");

	}

	private static void copyArray(final Integer[] source, final Integer[] dest) {
		for (int i = 0; i < source.length; i++) {
			dest[i] = source[i];
		}
	}

	private static void populateArray(final Integer[] array) {
		Random rand = new Random();
		for (int i = 0; i < SIZE; i++) {
			array[i] = rand.nextInt();
		}
	}
}
