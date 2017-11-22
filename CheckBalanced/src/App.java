
public class App {

	public static void main(String[] args) {
		Node root = new Node();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		Node node7 = new Node();
		Node node8 = new Node();
		Node node9 = new Node();
		Node node10 = new Node();
		Node node11 = new Node();
		Node node12 = new Node();
		Node node13 = new Node();
		Node node14 = new Node();
		Node node15 = new Node();
		Node node16 = new Node();
		
		root.data = 1;
		node1.data = 2;
		node2.data = 3;
		node3.data = 4;
		node4.data = 5;
		node5.data = 6;
		node6.data = 7;
		node7.data = 8;
		node8.data = 9;
		node9.data = 10;
		node10.data = 11;
		node11.data = 12;
		node12.data = 13;
		node13.data = 14;
		node14.data = 15;
		node15.data = 16;
		node16.data = 17;
		
		
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
		node4.left = node9;
		node9.left=node13;
		node13.left=node15;
		node4.right = node10;
		node5.left = node11;
		node5.right = node12;
		
		System.out.println(checkBalancedBruteForce(root));
		System.out.println(checkBalanced(root));

	}

	private static boolean checkBalanced(Node root) {
		
		return getHeightOptimized(root)!=Integer.MIN_VALUE;
	}

	private static int getHeightOptimized(Node root) {
		if(root==null) return -1;
		
		int leftHeight = getHeightOptimized(root.left);
		int rightHeight = getHeightOptimized(root.right);
		
		if(leftHeight==Integer.MIN_VALUE||rightHeight==Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		
		if(Math.abs(leftHeight-rightHeight)>1){
			return Integer.MIN_VALUE;
		}else{
			return Math.max(leftHeight, rightHeight)+1;
		}
		
		
	}

	private static boolean checkBalancedBruteForce(Node root) {
		
		if(root==null) return true;
		
		int heightLeft = getHeight(root.left);
		
		int heightRight  = getHeight(root.right);
		
		int absDiff = Math.abs(heightLeft-heightRight);
		
		if(absDiff>1){
			return false;
		}
		
		return checkBalancedBruteForce(root.left)&&checkBalancedBruteForce(root.right);
	}

	private static int getHeight(Node root) {
		if(root==null) return -1;
		
		return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}

}
