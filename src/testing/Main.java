package testing;

import java.util.ArrayList;

import util.Sortings;

public class Main {

	public static void main(final String[] args) {
		Sortings<Fruit> sorter = new Sortings<Fruit>();

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

		Integer[] numbers = {1, 2, 3, 1, 2, 5, 2, 1, 6, 7};
		Sortings.selectionSort(numbers);
		for (Integer curr : numbers) {
			System.out.print(curr + " ");
		}

//		Sortings.selectionSort(fruits);
//		int i = 0;
//		for(Fruit temp: fruits){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}

//		Sortings.mergeSort(fruits, 0, fruits.length - 1);
//		int i = 0;
//		for(Fruit temp: fruits){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}

//		sorter.heapSort(fruits);
//		int i = 0;
//		for(Fruit temp: fruits){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}
//
//		System.out.println();
//		sorter.heapSort(fruitList);
//		i = 0;
//		for(Fruit temp: fruitList){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}
//
//		System.out.println();
//		sorter.heapSort(fruits, Fruit.FruitNameComparator);
//		i = 0;
//		for(Fruit temp: fruits){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}
//
//
//		System.out.println();
//		sorter.heapSort(fruitList, Fruit.FruitNameComparator);
//		i = 0;
//		for(Fruit temp: fruitList){
//		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
//			", Quantity : " + temp.getQuantity());
//		}
	}
}
