package eg.edu.alexu.csd.filestructure.avl.node;

public class Node<T extends Comparable<T>> implements INode<T> {

	private INode<T> leftChild = null;
	private INode<T> rightChild = null;
	private INode<T> parent = null;
	private T value = null;
	private int height = 0;

	public Node() {
	}

	public Node(final T value) {
		this.value = value;
	}

	public Node(final T value, final INode<T> parent) {
		this.value = value;
		this.parent = parent;
	}

	public Node(final T value, final Node<T> leftChild,
			final Node<T> rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Node(final T value, final Node<T> leftChild,
			final Node<T> rightChild, final INode<T> parent) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}


	@Override
	public INode<T> getLeftChild() {
		return this.leftChild;
	}

	@Override
	public INode<T> getRightChild() {
		return this.rightChild;
	}

	@Override
	public T getValue() {
		return this.value;
	}

	@Override
	public void setValue(final T value) {
		this.value = value;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	public void updateHeight() {
		if (leftChild != null && rightChild != null) {
			this.height = Math.max(leftChild.getHeight(), rightChild.getHeight()) + 1;
		} else if (leftChild != null) {
			this.height = leftChild.getHeight() + 1;
		} else if (rightChild != null) {
			this.height = rightChild.getHeight() + 1;
		} else {
			this.height = 0;
		}
	}

	@Override
	public void setParent(final INode<T> parent) {
		this.parent = parent;
	}

	@Override
	public INode<T> getParent() {
		return this.parent;
	}

	@Override
	public void setLeftChild(final INode<T> leftChild) {
		this.leftChild = leftChild;
	}

	@Override
	public void setRightChild(final INode<T> rightChild) {
		this.rightChild = rightChild;
	}
}
