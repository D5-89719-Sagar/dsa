package Q3;

public class Test {
	public static void main(String[] args) {
		BST bst=new BST();
		bst.addNode(40);
		bst.addNode(20);
		bst.addNode(60);
		bst.addNode(25);
		bst.addNode(15);
		bst.addNode(35);
		bst.addNode(55);
		bst.addNode(45);
		bst.addNode(75);
		bst.addNode(10);
		bst.addNode(5);
		bst.addNode(2);
		bst.addNode(1);
		bst.inOrderTraversal();
		
		bst.levelOfNode(55);
		
	}
}
