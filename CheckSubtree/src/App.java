
public class App {

	public static void main(String[] args) {

		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);

		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node4.setLeft(node8);
		node4.setRight(node9);

		Node node11 = new Node(1);
		Node node12 = new Node(2);
		Node node13 = new Node(3);
		Node node14 = new Node(4);
		Node node15 = new Node(5);
		Node node16 = new Node(6);
		Node node17 = new Node(7);
		Node node18 = new Node(8);
		Node node19 = new Node(9);
		Node node20 = new Node(10);
		node20.setLeft(node11);
		node11.setLeft(node12);
		node11.setRight(node13);
		node12.setLeft(node14);
		node12.setRight(node15);
		node13.setLeft(node16);
		node13.setRight(node17);
		node14.setLeft(node18);
		node14.setRight(node19);

		System.out.println(checkSubtree(node20, node1));

	}

	private static boolean checkSubtree(Node node1, Node node2) {
		if (node2 == null) {
			return false;
		}

		return isSubtree(node1, node2);

	}

	private static boolean isSubtree(Node node1, Node node2) {
		if (node1 == null) {
			return false;
		} else if (node1.getData() == node2.getData() && sameData(node1, node2)) {
			return true;
		}

		return isSubtree(node1.getLeft(), node2) || isSubtree(node1.getRight(), node2);
	}

	private static boolean sameData(Node node1, Node node2) {
		
		
		
		if (node1 == null && node2 == null) {
			return true;
		} else if (node1 == null || node2 == null) {
			return false;
		} else if (node1.getData() != node2.getData()) {
		
			return false;
		}
		
		return sameData(node1.getLeft(), node2.getLeft()) && sameData(node1.getRight(), node2.getRight());
	}

}
