package Q9;

import java.util.ArrayList;
import java.util.List;

public class BST {

	private Node root;
	public List<Key> results=new ArrayList<>();

	public BST() {
		this.root = null;
	}

	public void insert(Key key) {
		Node parent = null;
		Node current = this.root;
		while (current != null) {
			if (current.key.compareTo(key) < 0) {
				parent = current;
				current = current.right;
			} else if (current.key.compareTo(key) > 0) {
				parent = current;
				current = current.left;
			}
		}

		if (parent == null && current == null) {
			this.root = new Node(key);
		} else {
			Node newNode = new Node(key);
			if (parent.key.compareTo(key) < 0) {
				parent.right = newNode;
			} else if (parent.key.compareTo(key) > 0) {
				parent.left = newNode;
			}
		}
	}

	public void invertedPreOrder(Node node){
		if (node!=null){
			results.add(node.key);
			invertedPreOrder(node.right);
			invertedPreOrder(node.left);
		}
	}

	public List<Key> invertedPreOrder() {
		// TODO
		// HINT: Use recursion
		// START YOUR CODE
		invertedPreOrder(root);

		return results;
		// END YOUR CODE
	}
}