package eg.edu.alexu.csd.filestructure.avl.testing;

import eg.edu.alexu.csd.filestructure.avl.node.INode;
import eg.edu.alexu.csd.filestructure.avl.tree.AVLTree;

public class Main {

	public static void main(final String[] args) {
		AVLTree<Integer> tree = new AVLTree<>();
		// 13; 8; 5; 9; 4; 6; 12; 2; 1; 3
		tree.insert(13);
		tree.insert(8);
		tree.insert(5);
		tree.insert(9);
		tree.insert(4);
		tree.insert(6);
		tree.insert(12);
		tree.insert(2);
		tree.insert(1);
		tree.insert(3);
		inorderTraversal(tree.getTree());
		System.out.println(tree.height());
	}

	private static void inorderTraversal(final INode<Integer> root) {
		if (root != null) {
			inorderTraversal(root.getLeftChild());
			System.out.println(root.getValue());
			inorderTraversal(root.getRightChild());
		}
	}


}
