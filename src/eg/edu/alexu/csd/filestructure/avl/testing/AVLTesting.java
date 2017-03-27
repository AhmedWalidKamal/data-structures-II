package eg.edu.alexu.csd.filestructure.avl.testing;

import org.junit.Assert;
import org.junit.Test;

import eg.edu.alexu.csd.filestructure.avl.tree.AVLTree;

public class AVLTesting {

	@Test
    public void avlTreeTesting() {
		AVLTree<Integer> tree = new AVLTree<>();
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
		Assert.assertEquals((Integer)8, tree.getTree().getValue());
		Assert.assertTrue(tree.search(2));
		Assert.assertEquals(tree.height(), 3);
		tree.delete(8);
		Assert.assertEquals((Integer)9, tree.getTree().getValue());
		tree.delete(9);
		Assert.assertEquals((Integer)4, tree.getTree().getValue());
		tree.delete(2);
		Assert.assertEquals((Integer)4, tree.getTree().getValue());
		Assert.assertEquals(tree.height(), 3);
    }

//	private static void inorderTraversal(final INode<Integer> root) {
//		if (root != null) {
//			inorderTraversal(root.getLeftChild());
//			System.out.println(root.getValue());
//			inorderTraversal(root.getRightChild());
//		}
//	}

}
