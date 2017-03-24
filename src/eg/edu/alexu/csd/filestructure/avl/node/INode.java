package eg.edu.alexu.csd.filestructure.avl.node;

public interface INode<T extends Comparable<T>> {
	/**
	* Returns the left child of the current element/node in the heap tree
	* @return INode wrapper to the left child of the current element/node
	*/
	INode<T> getLeftChild();
	/**
	* Returns the right child of the current element/node in the heap tree
	* @return INode wrapper to the right child of the current element/node
	*/
	INode<T> getRightChild();
	/**
	* Set/Get the value of the current node
	* @return Value of the current node
	*/
	T getValue();
	void setValue(T value);

	void setParent(INode<T> parent);

	void setLeftChild(INode<T> leftChild);

	void setRightChild(INode<T> rightChild);

	INode<T> getParent();

	int getHeight();

	void updateHeight();
}
