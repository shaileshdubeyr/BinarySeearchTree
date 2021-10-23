package com.bst;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;

	public void add(K key) {
		this.root = addRecursively(root, key);
	}
	
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) 
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		}

		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
			System.out.println("the root is "+root);
		} else {
			current.right = addRecursively(current.right, key);
			System.out.println("the root is "+root);
		}
		return current;
	}

	 public int getSize() {
		return getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}
}
