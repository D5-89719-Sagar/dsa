package Q4;

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
	public LinkedList() {
		head=null;
	}
	
	public void add(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
		}else if(head.next==null) {
		    if(head.data>value) {	//add in prev
		    	newNode.next=head;
		    	head.prev=newNode;
		    	head=newNode;
		    }else {//add in next
		    	head.next=newNode;
		    	newNode.prev=head;
		    }
		}else {
			Node trav=head;
			while(trav.data<value && trav.next!=null) {
				trav=trav.next;
			}
			if(trav==head) {
				newNode.next=head;
		    	head.prev=newNode;
		    	head=newNode;	
			}else if(trav.data<value){ 
	              trav.next=newNode;
	              newNode.prev=trav;
			}else {
	         newNode.next=trav;
	         newNode.prev=trav.prev;
	         trav.prev.next=newNode;
	         trav.prev=newNode;
	         
		}
	  }
	}

	public void print() {
		Node trav=head;
		while(trav!=null) {
			System.out.print(trav.data+" ");
			trav=trav.next;
		}
		System.out.println();
	}
}
