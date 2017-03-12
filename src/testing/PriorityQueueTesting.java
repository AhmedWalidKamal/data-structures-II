package testing;

import java.util.PriorityQueue;

public class PriorityQueueTesting {

	public static void main(final String[] args) {
		PriorityQueue<Integer> prq = new PriorityQueue<>();
		prq.add(6);
		prq.add(9);
		prq.add(5);
		prq.add(64);
		prq.add(6);
		while (!prq.isEmpty()) {
			System.out.println(prq.poll());
		}

		PriorityQueue<Fruit> pq = new PriorityQueue<>(Fruit.FruitNameComparator);
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 80);
		Fruit apple = new Fruit("Apple", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "Orange description", 70);
		Fruit banana = new Fruit("Banana", "Banana description", 90);
		pq.add(banana);
		pq.add(apple);
		pq.add(orange);
		pq.add(pineappale);
		int i = 0;
		while (!pq.isEmpty()) {
			Fruit curr = pq.poll();
			System.out.println("fruits " + ++i + " : " + curr.getFruitName() +
					", Quantity : " + curr.getQuantity());
		}
	}
}
