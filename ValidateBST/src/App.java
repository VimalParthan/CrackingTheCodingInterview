
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
		
		
		
		node6.left=node2;
		node6.right = node13;
		node2.left = root;
		
		node2.right = node3;
		node3.right = node4;
		node4.right = node5;
		node13.left = node7;
		node7.right = node8;
		node8.right = node9;
		node9.right = node10;
		node11.right = node12;
		node13.right=node14;
		node14.right = node15;
//		node15.right = node1;
		
		
		System.out.println(validateBST(node6));

	}

	private static boolean validateBST(Node root) {
		
		if(root==null)return true;
		
		return validateBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private static boolean validateBST(Node root, int minValue, int maxValue) {
		
		if(root==null)return true;
		
		if(root.data<minValue||root.data>maxValue){
			return false;
		}else{
			return validateBST(root.left,Integer.MIN_VALUE,root.data)&&validateBST(root.right, root.data, Integer.MAX_VALUE);
		}
		
	}

}
