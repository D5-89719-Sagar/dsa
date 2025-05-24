package Q3;

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
				}else{
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

	public void levelOfNode(int value) {
		//1st check that is it present in Tree
		Node trav=root;
		int level=0;
		while(trav!=null) {
			if(trav.data==value) {
				break;
			}
			if(value<trav.data) {
				trav=trav.left;
			}else if(value>trav.data) {
				trav=trav.right;
			}
			level++;
		}
		
		if(trav==null) {
			System.out.println("KEY Not Found");
			return;
		}else {//trav!=null means trav will have address of out node 
			System.out.println("Level or depth Of given Node is :"+level);	
		}
	}

	private  void inOrderTraversal(Node trav) {
		if(trav==null) {
			return ;
		}
		inOrderTraversal(trav.left);
		System.out.print(trav.data+" ");
		inOrderTraversal(trav.right);
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
		System.out.println();
	}

}
