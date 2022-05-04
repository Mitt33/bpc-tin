package c06;

import java.util.LinkedList;



public class Node {
	private String value;
	public LinkedList<Node> neighbours = new LinkedList<Node>();
	public LinkedList<Integer> weights = new LinkedList<Integer>();

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public Node(String value) {
		this.value = value;
	}
	
	public void addNeighbour(Node n, int weight) {
		for (Node node : neighbours) {
			if(node.getValue() == n.getValue()) {
				return;
			}
		}
		neighbours.add(n);
		weights.add(weight);
		n.neighbours.add(this);
		n.weights.add(weight);
	}
	
}
