package Assignment4Q1;

public class Test {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();

		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);

		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		
		l1.deletePosition(1);
		l1.deletePosition(-5);
		l1.deletePosition(1);
		l1.print();
		System.out.println("Size:"+l1.size());
		
	}
}
