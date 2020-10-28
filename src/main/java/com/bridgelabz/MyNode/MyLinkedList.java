package com.bridgelabz.MyNode;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	// insert the node
	public void insert(INode myNode, INode newNode) {
		INode tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}

	// delete the node
	public INode pop() {
		INode tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	// delete node from last
	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		tempNode = tempNode.getNext();
		return tempNode;
	}

	// search the node
	public boolean search(INode searchnode) {
		INode tempNode = this.head;
		while (tempNode != head && tempNode.getNext() != this.tail) {
			tempNode = tempNode.getNext();
		}
		if (tempNode == searchnode)
			return true;
		else
			return false;

	}

	// adding the node
	public void add(INode<K> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}

	// append the nodes
	public void append(MyNode newNode) {
		if (this.head == null)
			this.head = newNode;
		if (this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	// print the nodes
	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}
}
