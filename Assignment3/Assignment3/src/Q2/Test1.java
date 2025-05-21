package Q2;

import java.util.Scanner;

public class Test1 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		l1.print();
		System.out.println("enter node after which you want to add new node");
		int givenNOdeValue = sc.nextInt();
		System.out.println("Enter new node which is to be interested");
		int newNodeValue=sc.nextInt();
		l1.addAfterGivenNode(newNodeValue, givenNOdeValue);
		l1.print();
	}
}
