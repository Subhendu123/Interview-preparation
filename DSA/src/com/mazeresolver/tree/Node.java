package com.mazeresolver.tree;

public class Node
{
	Node left, right;
	int val;

	Node(int val)
	{
		this.val = val;
		this.left = this.right = null;
	}
}
