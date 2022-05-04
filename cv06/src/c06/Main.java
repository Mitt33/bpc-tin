package c06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g1 = new Graph();
		g1.addEdge("1", "2", 4);
		g1.addEdge("2", "3", 24);
		g1.addEdge("1", "6", 6);
		g1.addEdge("6", "3", 23);
		g1.addEdge("6", "5", 5);
		g1.addEdge("5", "3", 18);
		g1.addEdge("5", "4", 11);
		g1.addEdge("4", "3", 9);
		g1.addEdge("1", "7", 16);
		g1.addEdge("7", "6", 8);
		g1.addEdge("7", "5", 10);
		g1.addEdge("7", "8", 21);
		g1.addEdge("5", "8", 14);
		g1.addEdge("4", "8", 7);
		
		Path p = new Path(g1, "1");
		p.addNode("6");
		p.addNode("5");
		p.addNode("4");
		p.addNode("3");
		int price = p.getPrice();
		System.out.println(price);
	}

}
