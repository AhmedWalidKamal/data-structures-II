package eg.edu.alexu.csd.filestructure.avl.tree;

import eg.edu.alexu.csd.filestructure.avl.node.INode;

public interface IBST<T extends Comparable<T>> {
	/**
	* Insert the given node into the tree
	* @param node to be inserted
	*/
	void insert(INode<T> node);
	/**
	* Delete the node (if exists)
	* @param node to be deleted
	* @return true if node deleted, false if not exists
	*/
	boolean delete(INode<T> node);
	/**
	* Search for a specific element using the key in the tree
	* @param key the key of the node
	* @return true if the key exists, false otherwise
	*/
	boolean search(T key);
	/**
	* Return the height of the AVL tree. This is the longest path from
	* the root to a leaf-node
	* @return tree height
	*/
	int height();
	/**
	* Return the root of your AVL tree.
	* @return root of the AVL tree.
	*/
	INode<T> getTree();

	INode<T> minimum(INode<T> root);

	INode<T> maximum(INode<T> root);

	INode<T> successor(INode<T> node);

	INode<T> predecessor(INode<T> node);
}
