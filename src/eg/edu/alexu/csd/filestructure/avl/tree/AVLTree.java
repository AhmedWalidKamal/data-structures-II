package eg.edu.alexu.csd.filestructure.avl.tree;

public class AVLTree<T extends Comparable<T>> extends BST<T> implements IAVLTree<T>  {

	@Override
	public void insert(final T key) {
		super.insert(key);
		// TODO: Rebalance tree.

	}

	@Override
	public boolean delete(final T key) {
		super.delete(key);
		// TODO: Rebalance tree.
		return false;
	}
}