package com.mazeresolver.linkedlist;

public class LinkedList {

	private Node head;
	private int count = 0;
	private static final String INCORRECT_POSITION_ERROR = "The Index seems to be out of range of the linked list";

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void insert(int value) {
		Node newNode = new Node(value);
		if (this.head == null) {
			this.head = newNode;
			this.head.next = null;
		} else {
			Node nextNode = this.head;
			while (nextNode.next != null) {
				nextNode = nextNode.next;
			}
			// append to the last
			nextNode.next = newNode;
		}
	}

	public int count() {
		Node nextNode = this.head;
		count = 1;
		while (nextNode.next != null) {
			nextNode = nextNode.next;
			count++;
		}

		return count;
	}

	public void insert(int value, int position) throws IndexOutOfBoundsException {
		if (position < this.count()) {

			// valid scenario
			Node nextNode = this.head;
			if (position == 1) {
				// Changing the head
				Node headNode = this.head;
				this.head = new Node(value);
				this.head.next = headNode;
			} 
			else if (position == this.count() - 1) {
				// Last Node Entry
				Node cursor = this.head;
				while (cursor.next == null) {
					cursor = cursor.next;
				}
				Node newEntry = new Node(value);
				cursor.next = newEntry;
				cursor.next.next = null;
			} 
			else {
				// Entry in the middle
				int localIndex = 1;
				while (true) {
					if (localIndex == position - 1)
						break;
					nextNode = nextNode.next;
					localIndex++;
				}
				Node currentNode = nextNode;
				Node currentNextNode = nextNode.next;
				// Reassign the new node
				currentNode.next = new Node(value);
				currentNode.next.next = currentNextNode;
			}

		} else {
			throw new IndexOutOfBoundsException(INCORRECT_POSITION_ERROR);
		}
	}

	public void remove(int position) throws IndexOutOfBoundsException {
		if (position > this.count()) {
			throw new IndexOutOfBoundsException(INCORRECT_POSITION_ERROR);
		}
		int localIndex = 1;
		Node nextNode = this.head;
		while (true) {
			if (localIndex == position - 1)
				break;
			nextNode = nextNode.next;
			localIndex++;
		}
		// delete nextNode
		Node deletedNode = nextNode.next;
		nextNode.next = deletedNode.next;

		deletedNode.next = null;
		deletedNode = null;
	}

	public String getLinkedListAsString() {
		Node nextNode = this.head;
		String result = String.valueOf(nextNode.data).concat(" -> ");

		while (nextNode.next != null) {
			nextNode = nextNode.next;
			result = nextNode.next != null ? result + String.valueOf(nextNode.data).concat(" -> ")
					: result + String.valueOf(nextNode.data);
		}

		return result;

	}
}
