package Q5;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data=value;
			next=null;
			prev=null;
		}
	}

	private Node head;
	private Node tail;
	public LinkedList() {
		head=null;
		tail=null;
	}

	public void addFirst(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=tail=newNode;
		}else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void DisplayInForward() {
		Node trav=head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}

	public void DisplayInReverse() {
		Node trav=tail;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.prev;
		}
		System.out.println();
	}

}
