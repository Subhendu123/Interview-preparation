package com.mazeresolver.linkedlist;

public class DoublyLinkedList {

	Node head;

	private class Node {
		int value;
		Node next;
		Node prev;

		public Node(int value, Node next, Node prev) {
			super();
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

	public void push(int value) {

		if (this.head == null) {
			// Doubly LinkedList is not created yet
			Node newHead = new Node(value, null, null);
			this.head = newHead;
		} else {
			// push to the end
			Node newNode = new Node(value, null, null);
			Node iterator = this.head;

			while (true) {
				if (iterator.next != null) {
					iterator = iterator.next;
				} else {
					Node prevNode = iterator;
					iterator.next = newNode;
					iterator.next.next = null;
					iterator.next.prev = prevNode;
					break;
				}
			}
		}
	}

	public Node pop() {
		Node prevNode = null;
		if (this.head == null) {
			return null;
		} else {
			Node iterator = this.head;
			while (true) {
				if (iterator.next != null) {
					iterator = iterator.next;
				} else {
					prevNode = iterator.prev;
					iterator = null;
					prevNode.next = null;
					break;
				}
			}
		}
		return prevNode;
	}

	public void insertInto(int value, int position) {
		if(position > getCount())
			throw new IllegalArgumentException("The position is invalid");

		if (this.head == null) {
			// Doubly LinkedList is not created yet
			push(value);
		} else {
			// Push to the end
			Node newNode = new Node(value, null, null);
			Node iterator = this.head;
			int currentPosition = 1;

			while (true) {

				if (position == currentPosition) {

					newNode.prev = iterator.prev;
					iterator.prev.next = newNode;

					newNode.next = iterator;
					iterator.prev = newNode;
					break;

				} else {
					System.out.println(iterator.value + " - "+currentPosition);
					iterator = iterator.next;
				}
				currentPosition++;
			}
		}
	}

	private int getCount() {
		Node iterator = this.head;
		int count = 0;
		while(true) {
			count++;
			if(iterator.next != null) {
				iterator = iterator.next;
			}else {
				break;
			}
		}
		return count;
	}

	public void print() {
		Node iterator = this.head;

		while (true) {
			if (iterator == this.head)
				System.out.print(iterator.value);
			else if (iterator.next == null) {
				System.out.print(" <-> " + iterator.value + " -> null");
				break;
			}
			else
				System.out.print(" <-> " + iterator.value);
			iterator = iterator.next;
		}
	}

}
