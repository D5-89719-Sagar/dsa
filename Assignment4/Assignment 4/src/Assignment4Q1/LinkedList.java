package Assignment4Q1;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int size;
	public LinkedList() {
		tail = null;
		size = 0;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(tail == null) {
			tail = newNode;
			tail.next = newNode;
		}else {
			newNode.next=tail.next;
			tail.next=newNode;
			}
			size++;
		}

		//time Complexity:O(1) as no traversing needed
		public void addLast(int value) {
			Node newNode=new Node(value);
			if(tail==null) {
				tail=newNode;
				tail.next=newNode;
			}else {
				newNode.next=tail.next;
				tail.next=newNode;
				tail=tail.next;
			}
			
			size++;
		}

		//time complexity:O(1)
		public void deleteFirst() {
			if(tail==null) {
				return;
			}
			if(tail.next==tail) {
				tail=null;
			}else {
			   tail.next=tail.next.next;	
			}
			
			size--;
		}
		 
		//Time Complexity:O(n) as WE have to traverse list here
		public void deleteLast() {
			if(tail==null) {
				return ;
			}
			if(tail.next==tail) {
				tail=null;
			}else {
				Node trav=tail.next;
				while(trav.next!=tail) {
					trav=trav.next;
				}
				trav.next=trav.next.next;
				tail=trav;
			}
			
			size--;
		}

		//time Complexity:O(n) as traversing is needed
		public void addAtPosition(int position,int value) {
			if(tail==null && position==1) {
				addFirst(value);
			    return;
			}else if(tail==null && position>1) {
				return;
			}
			Node newNode=new Node(value);
		if(position<1) {
			return ;
		}else if(position==1) {
			addFirst(value);
			size--;
		}else {
			Node trav=tail.next;
			for(int i=1;i<position-1 && trav!=tail;i++) {
				trav=trav.next;
			}
			if(position>size+1) {
				return;
			}else if(trav==tail) {
		      		addLast(value);
		      		size--;
			}else {
				newNode.next=trav.next;
				trav.next=newNode;
			}
		}
		size++;
		}

		//time Complexity:O(n)
		public void deletePosition(int position) {
			if(position>size ||position<1) {
				return ;
			}else if(tail==null) {
				return ;
			}else if(position==1) {
				deleteFirst();
				return;
			}else if(position==size) {
				deleteLast();
				return ;
			}else {
				Node trav=tail.next;
				for(int i=1;i<position-1;i++) {
					trav=trav.next;
				}
				trav.next=trav.next.next;
			}
			size--;
		}
		public int size() {
			return this.size;
		}

		public void deleteAll() {
			tail=null;
			size=0;
		}
		public void print() {
			if(tail==null) {
				return;
			}
			Node trav=tail.next;
		    while(trav!=tail) {	
		    System.out.print(trav.data+" ");	
		    trav=trav.next;
		    }
		    System.out.println(trav.data);
		}
}

