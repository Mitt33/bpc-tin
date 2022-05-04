package c04;

public class Node {
	private int data;
	private Node next;
	private Node prior;
	
	public Node() {
		
	}
	
	public Node(int data, Node next, Node prior) {
		super();
		this.data=data;
		this.next=next;
		this.prior=prior;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrior() {
		return prior;
	}

	public void setPrior(Node prior) {
		this.prior = prior;
	}
	
//	public void print() {
//		System.out.println(data);
//		//if (hasNext) 
//		next.print();
//	}

}
