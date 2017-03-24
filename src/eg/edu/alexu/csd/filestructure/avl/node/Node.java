package eg.edu.alexu.csd.filestructure.avl.node;

public class Node<T extends Comparable<T>> implements INode<T> {

	private Node<T> leftChild = null;
	private Node<T> rightChild = null;
	private T value = null;

	public Node() {
	}

	public Node(final T value) {
		this.value = value;
	}

	public Node(final T value, final Node<T> leftChild) {
		this.value = value;
		this.leftChild = leftChild;
	}

	public Node(final T value, final Node<T> leftChild, final Node<T> rightChild) {
		this.value = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
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
}
