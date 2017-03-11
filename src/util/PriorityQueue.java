//package util;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//
//import heap.BinaryHeap;
//
//public class PriorityQueue<T extends Comparable<T>> {
//
//	private List<T> priorityQueue;
//	private BinaryHeap<T> heap;
//	private Comparator<T> comparator = null;
//
//	public PriorityQueue() {
//		this.priorityQueue = new ArrayList<T>();
//		this.heap = new BinaryHeap<>();
//	}
//
//	public PriorityQueue(final Comparator<T> comparator) {
//		this.priorityQueue = new ArrayList<T>();
//		this.heap = new BinaryHeap<>();
//		this.comparator = comparator;
//	}
//
//	public void add(final T element) {
//		this.heap.addElement();
//		priorityQueue.add(element);
//		if (this.comparator == null) {
//			this.heap.siftUp(priorityQueue, priorityQueue.size() - 1);
//		} else {
//			this.heap.siftUp(priorityQueue, priorityQueue.size() - 1, this.comparator);
//		}
//	}
//
//	public T poll() {
//		if (this.heap.getHeapSize() == 0) {
//			return null;
//		}
//		return this.heap.extractTop(priorityQueue, comparator);
//	}
//
//	public void clear() {
//		priorityQueue.clear();
//		heap.clear();
//	}
//
//	public T peek() {
//		if (this.heap.getHeapSize() > 0) {
//			return this.heap.peek(this.priorityQueue);
//		}
//		return null;
//	}
//
//	//TODO: To be implemented
//	public void remove(final T element) {
//
//	}
//
//	public boolean isEmpty() {
//		return this.priorityQueue.isEmpty();
//	}
//	public int size() {
//		return this.priorityQueue.size();
//	}
//}
