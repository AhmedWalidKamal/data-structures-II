package eg.edu.alexu.csd.filestructure.avl.tree;

import eg.edu.alexu.csd.filestructure.avl.node.INode;
import eg.edu.alexu.csd.filestructure.avl.node.Node;

public class AVLTree<T extends Comparable<T>>
extends BST<T> implements IAVLTree<T>  {

	@Override
	public void insert(final T key) {
		INode<T> newNode = new Node<T>(key);
		super.insert(newNode);
		rebalance(newNode);
	}

	private void rebalance(INode<T> node) {
		while (node != null) {
			node.updateHeight();
			int balanceFactor = height(node.
					getLeftChild()) - height(node.getRightChild());
			if (balanceFactor >= 2) { // Left heavy
				if (height(node.getLeftChild().getLeftChild())
						>= height(node.getLeftChild().getRightChild())) { // Single Rotation
					rightRotate(node);
				} else {
					leftRotate(node.getLeftChild());
					rightRotate(node);
				}
			} else if (balanceFactor <= -2) { // Right heavy
				if (height(node.getRightChild().getRightChild())
						>= height(node.getRightChild().getLeftChild())) { // Single Rotation
					leftRotate(node);
				} else {
					rightRotate(node.getRightChild());
					leftRotate(node);
				}
			}
			node = node.getParent();
		}
	}

	private void leftRotate(final INode<T> node) {
		INode<T> rotatedNode = node.getRightChild();
		rotatedNode.setParent(node.getParent());
		if (rotatedNode.getParent() == null) {
			super.root = rotatedNode;
		} else {
			if (rotatedNode.getParent().getLeftChild().equals(node)) {
				rotatedNode.getParent().setLeftChild(rotatedNode);
			} else {
				rotatedNode.getParent().setRightChild(rotatedNode);
			}
		}
		node.setRightChild(rotatedNode.getLeftChild());
		if (node.getRightChild() != null) {
			node.getRightChild().setParent(node);
		}
		rotatedNode.setLeftChild(node);
		node.setParent(rotatedNode);
		node.updateHeight();
		rotatedNode.updateHeight();
	}

	private void rightRotate(final INode<T> node) {
		INode<T> rotatedNode = node.getLeftChild();
		rotatedNode.setParent(node.getParent());
		if (rotatedNode.getParent() == null) {
			super.root = rotatedNode;
		} else {
			if (rotatedNode.getParent().getLeftChild().equals(node)) {
				rotatedNode.getParent().setLeftChild(rotatedNode);
			} else {
				rotatedNode.getParent().setRightChild(rotatedNode);
			}
		}
		node.setLeftChild(rotatedNode.getRightChild());
		if (node.getLeftChild() != null) {
			node.getLeftChild().setParent(node);
		}
		rotatedNode.setRightChild(node);
		node.setParent(rotatedNode);
		node.updateHeight();
		rotatedNode.updateHeight();
	}

	private int height(final INode<T> node) {
		if (node == null) {
			return -1;
		}
		return node.getHeight();
	}

	@Override
	public boolean delete(final T key) {
		INode<T> newNode = new Node<T>(key);
		boolean foundNode = super.delete(newNode);
		// TODO: Rebalance tree.

		return foundNode;
	}
}
