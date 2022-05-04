package c05;

public class Tree {
	private Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void add(int i) {
		if (getRoot() == null) {
			setRoot(new Node(i));
		} 
		else {
			Node tmp = getRoot();
			while (tmp != null) {
				if (i < tmp.getData()) {
					if (tmp.getLeft() != null) {
						tmp = tmp.getLeft();
					} 
					else {
						tmp.setLeft(new Node(i));
						tmp.getLeft().setParent(tmp);
						return;
					}

				}
				else if (i > tmp.getData()) {
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

	public boolean contains(int i) {
		if (getRoot() == null) {
			return false;
		} else {
			Node tmp = getRoot();
			while (tmp != null) {
				if (tmp.getData() == i) {
					return true;
				} else if (i < tmp.getData()) {
					tmp = tmp.getLeft();
				} else if (i > tmp.getData()) {
					tmp = tmp.getRight();
				}
			}
			return false;
		}

	}

	public void print(int mode) {
		if (mode == 1) {
			printPreOrder(root);
		} else if (mode == 2) {
			printInOrder(root);
		} else if (mode == 3) {
			printPostOrder(root);
		}
	}

	public void printPreOrder(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.getData());
		printPreOrder(n.getLeft());
		printPreOrder(n.getRight());
	}

	public void printInOrder(Node n) {
		if (n == null) {
			return;
		}
		printInOrder(n.getLeft());
		System.out.println(n.getData());
		printInOrder(n.getRight());
	}

	public void printPostOrder(Node n) {
		if (n == null) {
			return;
		}
		printPostOrder(n.getLeft());
		printPostOrder(n.getRight());
		System.out.println(n.getData());
	}

	public void printRev(int mode) {
		if (mode == 1) {
			printPreOrderRev(root);
		} else if (mode == 2) {
			printInOrderRev(root);
		} else if (mode == 3) {
			printPostOrderRev(root);
		}
	}

	public void printPreOrderRev(Node n) {
		if (n == null) {
			return;
		}
		System.out.println(n.getData());
		printPreOrderRev(n.getRight());
		printPreOrderRev(n.getLeft());
	}

	public void printInOrderRev(Node n) {
		if (n == null) {
			return;
		}
		printInOrderRev(n.getRight());
		System.out.println(n.getData());
		printInOrderRev(n.getLeft());

	}

	public void printPostOrderRev(Node n) {
		if (n == null) {
			return;
		}
		printPostOrderRev(n.getRight());
		printPostOrderRev(n.getLeft());
		System.out.println(n.getData());
	}
	public void printLeaves() {
		printLeavesRoot(getRoot());
	}

	public void printLeavesRoot(Node root) {
		if (root == null) {
			System.out.println(" no leaves :( ");
			return;
		}

		if (root.getLeft() == null && root.getRight() == null) {
				System.out.print(root.getData() + " ");
			}
		if (root.getLeft() != null) {
			printLeavesRoot(root.getLeft());
		}
		if (root.getRight() != null) {
			printLeavesRoot(root.getRight());
		}

	
	}

	public int maxDepthNode(Node n) {
			if (n == null) {
				return 0;
			}
			else {
				int leftDepth = maxDepthNode(n.getLeft());
				int rightDepth = maxDepthNode(n.getRight());
			
			if (leftDepth > rightDepth) {
				return (leftDepth + 1);
			}
			else {
				return (rightDepth +1);
			}
		}
	}
	
}
