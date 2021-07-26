package com.mazeresolver.linkedlist;

public class LinkedListOperations {

	public static void main(String[] args) {
		
//		LinkedList ls = new LinkedList();
//		ls.insert(10);
//		ls.insert(20);
//		ls.insert(30);
//		ls.insert(40);
//		ls.insert(50);
//		System.out.println(ls.getLinkedListAsString());
//		ls.insert(35,3);
//		
//		System.out.println(ls.getLinkedListAsString());
//		ls.insert(12,2);
//		System.out.println(ls.getLinkedListAsString());
//		ls.insert(42,1);
//		System.out.println(ls.getLinkedListAsString());
//		ls.insert(500,5);
//		System.out.println(ls.getLinkedListAsString());
//		ls.remove(6);
//		System.out.println("******** After Delete ******");
//		System.out.println(ls.getLinkedListAsString());
		
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.push(10);
		dlist.push(20);
		dlist.push(30);
		dlist.push(40);
		dlist.push(50);
		dlist.push(60);
		dlist.print();
		
		dlist.pop();
		System.out.println();
		System.out.println("********* After Pop **********");
		dlist.print();
		
		System.out.println();
		dlist.insertInto(35,3);
		System.out.println("********* Insert Into **********");
		dlist.print();

	}

}
