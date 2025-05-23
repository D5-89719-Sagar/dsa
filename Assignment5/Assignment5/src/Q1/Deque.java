package Q1;

public class Deque {
		static class Node{
			private int data;
			private Node prev;
			private Node next;
			
			public Node(int value) {
				data=value;
				prev=null;
				next=null;
			}
		}

		private Node head;
		private Node tail;

		public Deque() {
			head=tail=null;
		}

		public void pushFromFront(int value) {
			Node newNode=new Node(value);
			if(head==null) {
				head=tail=newNode;
			}else {
				newNode.next=head;
				head.prev=newNode;
				head=head.prev;
			}
		}

		public void popFromFront() {
			if(head==null) {
				return ;
			}
			if(head.next==null) {
				head=tail=null;
			}else {
				head=head.next;
				head.prev=null;
			}
		}

		public void pushFromRear(int value) {
			Node newNode=new Node(value);
			if(head==null) {
				head=tail=newNode;
			}else {
				tail.next=newNode;
				newNode.prev=tail;
				tail=tail.next;
			}
		}

		public void popFromRear() {
			if(head==null) {
				return;
			}
			if(head.next==null) {
			    head=tail=null;	
			}else {
				tail=tail.prev;
				tail.next=null;
			}
		}

		public int peekRear() {
			if(head==null) {
				return -1;
			}
		  	return tail.data;
		}
		public int peekFront() {
			if(head==null) {
				return -1;
			}
		 return head.data; 	
		}
		public void print() {
			Node trav=head;
			while(trav!=null) {
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
			System.out.println();
		}
		public boolean isEmpty() {
			return (head==null)&&(tail==null);
		}

		public void deleteAll() {
			head=tail=null;
		}

}
	
