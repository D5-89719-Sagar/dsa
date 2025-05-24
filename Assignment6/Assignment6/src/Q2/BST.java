package Q2;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data=value;
			left=null;
			right=null;
		}
	}

	private Node root;
	public BST() {
		root=null;
	}

	public void addNode(int value) {
		Node newNode=new Node(value);
		if(root==null) {
			root=newNode;
			
		}else {
			Node trav=root;
			while(true) {
			   if(value<trav.data) {
				   if(trav.left==null) {
					   trav.left=newNode;
					   break;
				   }else {
					   trav=trav.left;
				   }
			   }else if(value>=trav.data) {
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

	public void inOrderTraversal() {
		Node trav=root;
		while(trav!=null) {
			trav=trav.left;
			System.out.println(trav.data);
			trav=trav.right;
		}
	}


	public int findSuccessor(int value) {
		boolean flag=false;
		Node trav=root;
		while(trav!=null) {
			if(trav.data==value) {
				flag=true;
				break;
			}else if(value<trav.data) {
				trav=trav.left;
			}else if(value>trav.data) {
				trav=trav.right;
			}
		}
		if(trav==null) {
			return -1;
		}else {
			if(trav.right==null) {
				System.out.println("Leaf Node");
				return -1;
			}
			
			if(trav.right!=null) {
		   	trav=trav.right;
		   	while(trav.left!=null) {
		   		trav=trav.left;
		   	} 
		}
		}
		return trav.data;	
	}
	private void inorderTraversal(Node trav) {
		if(trav==null) {
			return;
		}
		inorderTraversal(trav.left);
		System.out.print(trav.data+" ");
		inorderTraversal(trav.right);
	}

	public void inorderTraversal() {
		inorderTraversal(root);
		System.out.println();
	}
}
