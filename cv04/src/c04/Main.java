package c04;



public class Main {

	public static void main(String[] args)  {
		LinearList list = new LinearList();
		System.out.println("is list empty? " +list.isEmpty());
		//System.out.println("Adding numbers...");
		list.addFirst(5);
		list.addFirst(6);
		list.addFirst(4);
		list.addFirst(12);
		list.addFirst(8);
		list.addLast(7);
		list.addLast(3);
	
		list.hasData(4);
		list.hasData(256);
		
		list.deleteFirst();
		list.deleteLast();
		list.printList();
		System.out.println(" ");
		System.out.println("is list empty? " +list.isEmpty());
	}
}
