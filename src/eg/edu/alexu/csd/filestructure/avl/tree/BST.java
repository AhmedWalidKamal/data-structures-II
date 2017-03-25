package eg.edu.alexu.csd.filestructure.avl.tree;

import eg.edu.alexu.csd.filestructure.avl.node.INode;
import eg.edu.alexu.csd.filestructure.avl.node.Node;

public class BST<T extends Comparable<T>> implements IBST<T> {

	protected INode<T> root = null;

	public BST() {
	}

	public BST(final T rootValue) {
		this.root = new Node<T>(rootValue);
	}

	@Override
	public void insert(final INode<T> node) {
		INode<T> currentNode = root, currentNodeParent = null;
		while (currentNode != null) {
			currentNodeParent = currentNode;
			if (node.getValue().compareTo(currentNode.getValue()) <= 0) {
				currentNode = currentNode.getLeftChild();
			} else {
				currentNode = currentNode.getRightChild();
			}
		}
		node.setParent(currentNodeParent);
		if (node.getParent() == null) {
			this.root = node;
		} else if (node.getValue().compareTo(node.getParent().getValue()) <= 0) {
			node.getParent().setLeftChild(node);
		} else {
			node.getParent().setRightChild(node);
		}
	}

	@Override
	public boolean delete(final INode<T> node) {

		return false;
	}

	@Override
	public boolean search(final T key) {
		INode<T> currentNode = root;
		while (currentNode != null) {
			if (currentNode.getValue().equals(key)) {
				return true;
			}
			if (key.compareTo(currentNode.getValue()) <= 0) {
				currentNode = currentNode.getLeftChild();
			} else {
				currentNode = currentNode.getRightChild();
			}
		}
		return false;
	}

	@Override
	public int height() {
		if (root == null) {
			return -1;
		}
		return this.root.getHeight();
	}

	@Override
	public INode<T> getTree() {
		return this.root;
	}
}
