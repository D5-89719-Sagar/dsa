package Q2;

public class Test {
	public static void main(String[] args) {
		BST bst=new BST();
		bst.addNode(40);
		bst.addNode(20);
		bst.addNode(60);
		bst.addNode(25);
		bst.addNode(35);
		bst.addNode(55);
		bst.addNode(45);
		bst.addNode(75);
		
		bst.inorderTraversal();
		System.out.println(bst.findSuccessor(75));
		
	}
}
