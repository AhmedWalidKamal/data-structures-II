package sorting;

import java.util.ArrayList;

public class Main {

	public static void main(final String[] args) {
		Sorter sorter = new Sorter();

		Fruit[] fruits = new Fruit[4];
		ArrayList<Fruit> fruitList = new ArrayList<>();
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 80);
		Fruit apple = new Fruit("Apple", "Apple description", 100);
		Fruit orange = new Fruit("Orange", "Orange description", 70);
		Fruit banana = new Fruit("Banana", "Banana description", 90);
		fruitList.add(pineappale);
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;

		sorter.heapSort(fruits);
		int i = 0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}
		sorter.heapSort(fruits, Fruit.FruitNameComparator);
		System.out.println();
		i = 0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}
		System.out.println();
		sorter.heapSort(fruitList);
		i = 0;
		for(Fruit temp: fruitList){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}
	}
}
