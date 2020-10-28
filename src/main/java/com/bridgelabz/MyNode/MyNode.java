package com.bridgelabz.MyNode;

public class MyNode<K> implements INode<K> {
	private K key;
	INode<K> next;
	public Object data;

	public MyNode(K key) {
		this.key = key;
		this.next = null;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public INode<K> getNext() {
		return next;
	}

	public void setNext(INode next) {
		this.next = next;
	}

	public String toString() {
		StringBuilder myNodeString = new StringBuilder();
		myNodeString.append("MyNode{" + "key=").append(key).append("}");
		if (next != null)
			myNodeString.append("->").append(next);
		return myNodeString.toString();
	}
}
