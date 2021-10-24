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
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	 public int getSize() {
		return getSizeRecursively(root);
	}
	
 	public  MyBinaryNode<K> searchRecursive(K key) {
		MyBinaryNode<K> currentNode = this.root;
		while (currentNode != null &&currentNode!=key) {
			if ( key.compareTo(currentNode.key)<0) {
				currentNode = currentNode.left;
				return currentNode;
			}else {
				currentNode = currentNode.right;
			}
		}
		return currentNode;
	}
		
	public boolean search( K key) {
		MyBinaryNode<K> currentNode = this.searchRecursive(key);
		if(currentNode!= null)
			return true;
		return false;
	}
	 
	public int getSizeRecursively(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}
}
