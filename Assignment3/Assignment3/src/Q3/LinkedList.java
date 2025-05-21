package Q3;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}
	}

	private Node head;
	public LinkedList() {
		head=null;
	}

	public void addFirst(int value) {
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;
	}

	private void display(Node trav) {
	if(trav.next==null) {	
		System.out.print(trav.data+"->");
		return ;
		
	}
	display(trav.next);
	System.out.print(trav.data+"->");
	return ;

	}
	public void displayInReverse() {
	display(head);	
	System.out.println("NULL");
	}
}
