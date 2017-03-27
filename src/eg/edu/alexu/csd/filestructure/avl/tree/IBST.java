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
	* @return node at the position of the deleted node, if node exits, null otherwise
	*/
	INode<T> delete(INode<T> node);
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
	* Return the number of nodes in the tree.
	* @return number of nodes in the tree
	*/
	int size();
	/**
	* Return the root of your AVL tree.
	* @return root of the AVL tree.
	*/
	INode<T> getTree();

	/**
	* Returns the node with the minimum key in the tree rooted at the
	* specified node.
	* @param root the node which the tree is rooted at
	* @return minimum node in this subtree
	*/
	INode<T> minimum(INode<T> root);

	/**
	* Returns the node with the maximum key in the tree rooted at the
	* specified node.
	* @param root the node which the tree is rooted at
	* @return maximum node in this subtree
	*/
	INode<T> maximum(INode<T> root);

	/**
	* Returns the node with the minimum key value largest than the
	* key of the specified node.
	* @param node the node to get the successor of
	* @return the successor of the specified node
	*/
	INode<T> successor(INode<T> node);

	/**
	* Returns the node with the maximum key value smallest than the
	* key of the specified node.
	* @param node the node to get the predecessor of
	* @return the predecessor of the specified node
	*/
	INode<T> predecessor(INode<T> node);
}
