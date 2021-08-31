package com.mazeresolver.tree;

public class TreeDSA
{

	public static void main(String[] args)
	{
		Tree tree = new Tree(5);

		tree.root.left = new Node(10);
		tree.root.right = new Node(15);

		Node firstLeftChild = tree.root.left;
		firstLeftChild.left = new Node(20);
		firstLeftChild.right = new Node(25);

		Node firstRightChild = tree.root.right;
		firstRightChild.left = new Node(17);
		firstRightChild.right = new Node(19);

		System.out.println("Inorder (Left, Root, Right) ");
		Tree.inorderTraversal(tree.root);

		System.out.println("Inorder (Left, Root, Right) ");
		Tree.inorderTraversalWithoutRecursion(tree.root);

		System.out.println();
		System.out.println("Preorder (Root, Left, Right)");
		Tree.preorderTraversal(tree.root);

		System.out.println();
		System.out.println("Postorder (Left, Right, Root)");
		Tree.postorderTraversal(tree.root);

//
//		String s = "aa";
//		String str = "aa" + "";
//		System.out.println(s.hashCode());
//		System.out.println(str.hashCode());
	}

}
