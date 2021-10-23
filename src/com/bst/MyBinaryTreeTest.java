package com.bst;

import org.junit.jupiter.api.Test;

import org.junit.Assert;

public class MyBinaryTreeTest {
	@Test
	public void givenThreeNumberWhenAddedToBSTshouldResultSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}
