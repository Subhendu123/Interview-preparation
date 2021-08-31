package com.mazeresolver.tree;

import java.util.ArrayList;
import java.util.List;

public class Tree
{
	Node root;

	Tree()
	{
		this.root = null;
	}

	Tree(int key)
	{
		this.root = new Node(key);
	}

	public void insertToLeft(int key)
	{
		Node iterator = this.root;
		Node newNode = new Node(key);

		while (true)
		{
			if (iterator.left == null)
			{
				// this is the last node. Add here and break.
				iterator.left = newNode;
				break;
			}
			iterator = iterator.left;
		}
	}

	public void insertToRight(int key)
	{
		Node iterator = this.root;
		Node newNode = new Node(key);

		while (true)
		{
			if (iterator.right == null)
			{
				// this is the last node. Add here and break.
				iterator.right = newNode;
				break;
			}
			iterator = iterator.right;
		}
	}

	public void print()
	{
		Node iterator = this.root;

		while (true)
		{
			if (iterator != this.root)
			{
				System.out.print("/");
				System.out.println("  |");
			}

			System.out.println(iterator.val);
			if (iterator.left != null && iterator.right != null)
			{

				System.out.print("/");
				System.out.println("  |");
				System.out.println(iterator.left.val + "    " + iterator.right.val);
				iterator = iterator.left;
			} else
			{
				break;
			}

		}
	}

	public static void inorderTraversal(Node root)
	{

		if (root == null)
			return;

		inorderTraversal(root.left);
		System.out.print(root.val + "  ");
		inorderTraversal(root.right);

	}

	public static void postorderTraversal(Node root)
	{

		if (root == null)
			return;

		inorderTraversal(root.left);
		inorderTraversal(root.right);
		System.out.print(root.val + "  ");

	}

	public static void preorderTraversal(Node root)
	{

		if (root == null)
			return;

		System.out.print(root.val + "  ");
		inorderTraversal(root.left);
		inorderTraversal(root.right);

	}

	public static void inorderTraversalWithoutRecursion(Node root)
	{

		List<Integer> stack = new ArrayList<Integer>();
		Node itr = root;

	}
}