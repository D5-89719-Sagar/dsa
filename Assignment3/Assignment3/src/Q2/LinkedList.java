package Q2;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public LinkedList() {
		head = null;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	public void print() {
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+"->");
			trav = trav.next;
		}
		System.out.println("NULL");
	}
	
	public void addAfterGivenNode(int newNodeValue , int givenNodeValue) {
		Node newNode = new Node(newNodeValue);
		if(head == null) {
			head = newNode;
		}
		Node trav = head;
		while(trav.data != givenNodeValue && trav.next != null) {
			trav = trav.next;
		}
		if(trav.next == null) {
			newNode.next = trav.next;
			trav.next = newNode;
		}else {
			if(trav.data == givenNodeValue) {
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
	}
	
	public void addBeforeGivenNode(int newNodeValue, int givenNodeValue) {
		Node newNode = new Node(newNodeValue);
		if(head == null) {
			head = newNode;
		}else if(head.data == givenNodeValue) {
			addFirst(newNodeValue);
		}else {
			Node trav = head;
			while(trav.next != null && trav.next.data != givenNodeValue) {
				trav = trav.next;
			}
			if(trav.next == null) {
				trav.next = newNode;
			}else {
				newNode.next = trav.next;
				trav.next = newNode;
			}
		}
	}
}
