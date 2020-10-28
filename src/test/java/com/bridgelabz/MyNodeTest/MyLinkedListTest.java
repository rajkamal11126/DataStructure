package com.bridgelabz.MyNodeTest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.MyNode.MyLinkedList;
import com.bridgelabz.MyNode.MyNode;

public class MyLinkedListTest {
	// UC-1
	@Test
	public void given3NmbersWhenLinkedShouldPassLinkedListTest() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

	// UC-2
	@Test
	public void given3NumbersWhenInsertToLinkedListShouldBeAddedToTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	// UC-3
	@Test
	public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.tail.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.head.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	// UC-4
	@Test
	public void given3NumbersWhenInsertingInBetweenLinkedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.insert(myFirstNode, mySecondNode);
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.tail.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.head.equals(myFirstNode);
		Assert.assertTrue(result);
	}

	// UC-5
	@Test
	public void given3NumbersWhenFirstElementDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.pop();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.head.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	// UC-6
	@Test
	public void given3NumbersWhenLastElementDeletedShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.popLast();
		myLinkedList.printMyNodes();
		boolean result = myLinkedList.tail.equals(mySecondNode);
		Assert.assertTrue(result);
	}

	// UC-7
	public void given3NumbersWhenSearchElementShouldPassLinkedListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(70);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		boolean result = myLinkedList.search(mySecondNode);
		myLinkedList.printMyNodes();
		Assert.assertTrue(result);
	}
}
