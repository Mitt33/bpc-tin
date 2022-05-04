package c06;

import java.util.LinkedList;



public class Path {
	private int price;
	private Graph g;
	private int index;
	private String startNode;
	
	private LinkedList<Node> path = new LinkedList<Node>();
	
	public Path(Graph g1, String startNode) {
		setG(g1);
		path.add(g.getNode(startNode));
	}

	public void addNode(String value) {
		path.add(g.getNode(value));
		for(int j = 0;j < g.getNode(value).neighbours.size();j++) {			
			if(g.getNode(value).neighbours.get(j) == path.get(index)) {
				setPrice(getPrice()+g.getNode(value).weights.get(j));
				setIndex(getIndex()+1);
				return;
			}
		}
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Graph getG() {
		return g;
	}

	public void setG(Graph g) {
		this.g = g;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStartNode() {
		return startNode;
	}

	public void setStartNode(String startNode) {
		this.startNode = startNode;
	}
	
}
