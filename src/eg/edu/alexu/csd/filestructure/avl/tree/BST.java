package eg.edu.alexu.csd.filestructure.avl.tree;

import eg.edu.alexu.csd.filestructure.avl.node.INode;
import eg.edu.alexu.csd.filestructure.avl.node.Node;

public class BST<T extends Comparable<T>> implements IBST<T> {

	private INode<T> root = null;

	public BST() {
	}

	public BST(final T rootValue) {
		root.setValue(rootValue);
	}

	@Override
	public void insert(final T key) {
		INode<T> newNode = new Node<T>(key);
		INode<T> currentNode = root, currentNodeParent = null;
		while (currentNode != null) {
			if (key.compareTo(currentNode.getValue()) <= 0) {
				currentNode = currentNode.getLeftChild();
			} else {
				currentNode = currentNode.getRightChild();
			}
			currentNodeParent = currentNode.getParent();
		}
		newNode.setParent(currentNodeParent);
		if (newNode.getParent() == null) {
			this.root = newNode;
		} else if (newNode.getValue().compareTo(newNode.getParent().getValue()) <= 0) {
			newNode.getParent().setLeftChild(newNode);
		} else {
			newNode.getParent().setRightChild(newNode);
		}
		while (newNode != null) {
			newNode.updateHeight();
			newNode = newNode.getParent();
		}
	}

	@Override
	public boolean delete(final T key) {

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
