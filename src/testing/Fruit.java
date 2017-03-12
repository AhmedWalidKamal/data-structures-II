package testing;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{

	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit(final String fruitName, final String fruitDesc, final int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(final String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(final String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(final int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compareTo(final Fruit compareFruit) {

		int compareQuantity = compareFruit.getQuantity();

		//ascending order
		return this.quantity - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}

	public static Comparator<Fruit> FruitNameComparator
                          = new Comparator<Fruit>() {

	    @Override
		public int compare(final Fruit fruit1, final Fruit fruit2) {

	      String fruitName1 = fruit1.getFruitName().toUpperCase();
	      String fruitName2 = fruit2.getFruitName().toUpperCase();

	      //ascending order
	      //return fruitName1.compareTo(fruitName2);

	      //descending order
	      return fruitName2.compareTo(fruitName1);
	    }

	};
}