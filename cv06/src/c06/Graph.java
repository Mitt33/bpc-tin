package c06;

import java.util.HashMap;



public class Graph {
	private HashMap<String,Node> nodes = new HashMap<String, Node>();
	
	public void addEdge(String from , String to, int weight) {
		if(!nodes.containsKey(from)) {
			Node n1 = new Node(from);
			nodes.put(from, n1);
		}
		if(!nodes.containsKey(to)) {
			Node n2 = new Node(to);
			nodes.put(to, n2);
		}
		nodes.get(from).addNeighbour(nodes.get(to), weight);
		
	}
	public Node getNode(String name) {
		if(nodes.containsKey(name)) {
			return nodes.get(name);
		}
		return null;
	}

}
