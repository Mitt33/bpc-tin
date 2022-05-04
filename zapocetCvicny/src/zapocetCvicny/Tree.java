package zapocetCvicny;

public class Tree {
	private Node root;

	double leavesSum = 0;
	double leavesCount = 0;
	double sum = 0;
	double count = 0;
	
	
	public void nullVar() {
		sum = 0;
		count = 0;
		leavesSum = 0;
		leavesCount = 0;			
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void add(int i) {
		if (getRoot() == null) {
			setRoot(new Node(i));
		} else {
			Node tmp = getRoot();
			while (tmp != null) {
				if (i < tmp.getData()) {
					if (tmp.getLeft() != null) {
						tmp = tmp.getLeft();
					} else {
						tmp.setLeft(new Node(i));
						tmp.getLeft().setParent(tmp);
						return;
					}
				} else if (i > tmp.getData()) {
					if (tmp.getRight() != null) {
						tmp = tmp.getRight();
					} else {
						tmp.setRight(new Node(i));
						tmp.getRight().setParent(tmp);
						return;
					}
				} else {
					return;
				}
			}
		}
	}
	
	public void getAverage() {
		sum = 0;
		count =0;
		getAverage(root);

	}

	public void getAverage(Node node) {
		if (node == null) {
			return;
		}
		sum = sum + node.getData();
		count = count + 1;
		

		getAverage(node.getLeft());
		getAverage(node.getRight());
		
	}
	
	public void avgLeavesCount() {
		leavesSum = 0;
		leavesCount = 0;
		avgLeavesCount(root);

			
	}

	public void avgLeavesCount(Node node) {
		if (node == null) {
			return;
		}

		if (node.getLeft() == null && node.getRight() == null) {
			leavesCount += 1;
			leavesSum += node.getData();

		}
		avgLeavesCount(node.getLeft());
		avgLeavesCount(node.getRight());

	}

	public int findMaxLevel(Node node) {
		if (node == null) {
			return 0;
		}
		if (node.getRight().getRight() != null) {
			return findMaxLevel(node.getRight());
		}
		else {
			return node.getData();
		}
	}




	public void printGivenLevel(Node root, int level) {
		// TODO Auto-generated method stub
	    if (root == null)
	        return;
	    if (level == 1)
	        System.out.println(root.getData());
	    else if (level > 1)
	    {
	        printGivenLevel(root.getLeft(), level-1);
	        printGivenLevel(root.getRight(), level-1);
	    }
	}
}
