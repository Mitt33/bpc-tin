package c04;

public class LinearList {
	private Node first = null;
	private Node last = null;
	
	public LinearList() {
	}
	
	public void addFirst(int data) {
		if (first == null) {
			Node n = new Node(data, null, null);
//			n.setData(data);
			first = n;
			last = n;
		}
		else {
			Node n = new Node(data, null , null);
//			n.setData(data);
			first.setPrior(n);
			n.setNext(first);
			first = n;
		}

	}
	
	public void deleteFirst() {
		if (first == last) {
			first = null;
			last = null;
		}
		else {
		first = first.getNext();
		first.setPrior(null);
		}
	}
	
	public void addLast(int data) {
		if (last == null) {
			Node n = new Node();
			n.setData(data);
			first = n;
			last = n;
		}
		else 
		{
			Node n = new Node();
			n.setData(data);
			n.setPrior(last);
			last.setNext(n);
			n.setNext(null);
			last = n;
		}

	}
	
	public void deleteLast() {
		if (last == first) {
			last = null;
			first = null;
			
		}
		else {
			last.getPrior().setNext(null);
			last = last.getPrior();
		//	last.setNext(null);
		}

		
	}
	
	public boolean hasData(int data) {
		Node tmp = first;
			while (tmp !=null) {
				if(tmp.getData() == data) {
					System.out.println(data + " is in list");
					return true;
				}
				else {
					tmp = tmp.getNext();
				}
				
			}
		System.out.println(data + " is not in list");
		return false;
	}
	
	public boolean isEmpty(){
		if (first == null) {
			return true;
		}
		else {
			return false;
		}
			
	}
	
	public void printList(){
		Node tmp = first;
		System.out.println("data of list: ");
		while (tmp != null) {
			System.out.print(tmp.getData()+" ");
			tmp = tmp.getNext();
		}
		System.out.println(" ");
		
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}
	

}
