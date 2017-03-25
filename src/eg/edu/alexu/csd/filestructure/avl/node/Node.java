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

	@Override
	public void updateHeight() {
		this.height = Math.max(height(leftChild), height(rightChild)) + 1;
	}

	private int height(final INode<T> node) {
		if (node == null) {
			return -1;
		}
		return node.getHeight();
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
