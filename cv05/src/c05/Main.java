package c05;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree tr = new Tree();

		System.out.println(tr.getRoot());
		tr.add(7);
		tr.add(5);
		tr.add(1);
		tr.add(6);
		tr.add(14);
		tr.add(10);
		tr.add(16);
		tr.add(13);
		
		System.out.println(tr.contains(7));
		System.out.println(tr.contains(155));
		
		tr.print(1);
		System.out.println();
		tr.print(2);
		System.out.println();
		tr.print(3);
		System.out.println();
		tr.printRev(1);
		System.out.println();
		tr.printRev(2);
		System.out.println();
		tr.printRev(3);
		System.out.println("leaves: ");
		tr.printLeaves();
		System.out.println();
		System.out.println("Height of tree is: " + tr.maxDepthNode(tr.getRoot()));
	}

}
