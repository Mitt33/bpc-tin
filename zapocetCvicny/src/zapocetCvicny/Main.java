package zapocetCvicny;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree t = new Tree();
		t.add(10);
		t.add(4);
		t.add(15);
		t.add(20);
		t.add(1);
		t.add(6);
		t.add(5);
		t.add(7);
		
		System.out.println("prumer vsech uzlu je: ");
		t.getAverage();
		System.out.println(t.sum / t.count);
		
		
		System.out.println("prumer listu je: ");
		t.avgLeavesCount();
		System.out.println(t.leavesSum / t.leavesCount);
		
		
		
		
		
		int maxInner = t.findMaxLevel(t.getRoot());
		System.out.println("max vnitrni uzel je: " + maxInner);
     
	
		t.printGivenLevel(t.getRoot(), 3);
		

		
		

	}

}
