package eg.edu.alexu.csd.filestructure.avl.tree;

import eg.edu.alexu.csd.filestructure.avl.node.INode;
import eg.edu.alexu.csd.filestructure.avl.node.Node;

public class BST<T extends Comparable<T>> implements IBST<T> {

	protected INode<T> root = null;
	protected int size = 0;

	public BST() {
	}

	public BST(final T rootValue) {
		this.root = new Node<T>(rootValue);
		this.size++;
	}

	@Override
	public void insert(final INode<T> node) {
		INode<T> currentNode = this.root, currentNodeParent = null;
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
		this.size++;
	}

	@Override
	public INode<T> delete(INode<T> node) {
		node = find(node.getValue());
		if (node == null) {
			return null;
		}
		INode<T> returnedNode = node;
		if (node.getLeftChild() == null) {
			returnedNode = node.getRightChild();
			transplant(node, node.getRightChild());
		} else if (node.getRightChild() == null) {
			returnedNode = node.getLeftChild();
			transplant(node, node.getLeftChild());
		} else {
			INode<T> successor = minimum(node.getRightChild());
			if (!successor.getParent().equals(node)) {
				transplant(successor, successor.getRightChild());
				successor.setRightChild(node.getRightChild());
				successor.getRightChild().setParent(successor);
				returnedNode = successor.getRightChild();
			} else {
				returnedNode = successor;
			}
			transplant(node, successor);
			successor.setLeftChild(node.getLeftChild());
			successor.getLeftChild().setParent(successor);
		}
		this.size--;
		return returnedNode;
	}

	private void transplant(final INode<T> subtree1, final INode<T> subtree2) {
		if (subtree1.getParent() == null) {
			this.root = subtree2;
		} else if (subtree1.equals(subtree1.getParent().getLeftChild())) {
			subtree1.getParent().setLeftChild(subtree2);
		} else {
			subtree1.getParent().setRightChild(subtree2);
		}
		if (subtree2 != null) {
			subtree2.setParent(subtree1.getParent());
		}
	}

	@Override
	public boolean search(final T key) {
		if (find(key) != null) {
			return true;
		}
		return false;
	}

	private INode<T> find(final T key) {
		INode<T> currentNode = this.root;
		while (currentNode != null) {
			if (currentNode.getValue().equals(key)) {
				return currentNode;
			}
			if (key.compareTo(currentNode.getValue()) <= 0) {
				currentNode = currentNode.getLeftChild();
			} else {
				currentNode = currentNode.getRightChild();
			}
		}
		return null;
	}

	@Override
	public int height() {
		if (this.root == null) {
			return -1;
		}
		return this.root.getHeight();
	}

	@Override
	public INode<T> getTree() {
		return this.root;
	}

	@Override
	public INode<T> minimum(INode<T> root) {
		while (root.getLeftChild() != null) {
			root = root.getLeftChild();
		}
		return root;
	}

	@Override
	public INode<T> maximum(INode<T> root) {
		while (root.getRightChild() != null) {
			root = root.getRightChild();
		}
		return root;
	}

	@Override
	public INode<T> successor(INode<T> node) {
		if (node.getRightChild() != null) {
			return minimum(node.getRightChild());
		}
		INode<T> currentParent = node.getParent();
		while (currentParent != null &&
				currentParent.getRightChild().equals(node)) {
			node = currentParent;
			currentParent = node.getParent();
		}
		return currentParent;
	}

	// Validate this.
	@Override
	public INode<T> predecessor(INode<T> node) {
		if (node.getLeftChild() != null) {
			return maximum(node.getLeftChild());
		}
		INode<T> currentParent = node.getParent();
		while (currentParent != null &&
				currentParent.getLeftChild().equals(node)) {
			node = currentParent;
			currentParent = node.getParent();
		}
		return currentParent;
	}

	@Override
	public int size() {
		return this.size;
	}
}
