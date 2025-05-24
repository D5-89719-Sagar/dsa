package Q1;

public class BinarySearchTree {
	static class Node{
		private int data;
		private Node right;
		private Node left;
		
		public Node(int value) {
	       data=value;
	       right=null;
	       left=null;
		}
	}

	private Node root;
	public BinarySearchTree() {
		root=null;
	}

	private boolean binarySearch(Node trav,int key) {
		boolean flag=false;
		if(trav==null) {
			return false;
		}
		
		if(trav.data==key) {
			flag=true;
		}else if(key<trav.data) {
			return binarySearch(trav.left,key);
		}else if(key>trav.data) {
			return binarySearch(trav.right,key);
		}
		return flag;
	}

	public void addNode(int value) {
		Node newNode=new Node(value);
		
		if(root==null) {
			root=newNode;
		}else {//means root is null
			Node trav=root;
			while(true) {
			if(value<trav.data) {
				if(trav.left==null) {
					trav.left=newNode;
					break;
				}else {
					trav=trav.left;
				}
			}else if(value>trav.data) {
				if(trav.right==null) {
					trav.right=newNode;
					break;
				}else {
					trav=trav.right;
				}
			}
			}
		}
	}

	private void inOrderTraversal(Node trav) {
		if(trav==null) {
			return ;
		}
		inOrderTraversal(trav.left);
		System.out.print(trav.data+" ");
		inOrderTraversal(trav.right);
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	public void binarySearch(int key) {
		boolean isPresent=binarySearch(root,key);
		if(isPresent) {
			System.out.println(key+" is present");
			
		}else {
			System.out.println(key+" Not Present");
		}
	}
	public boolean isEmpty() {
		return root==null;
	}

	public void deleteAll() {
		root=null;
	}
}
