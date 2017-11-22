
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
		node1.parent=root;
		root.right = node2;
		node2.parent=root;
		node1.left = node3;
		node3.parent = node1;
		node1.right = node4;
		node4.parent=node1;
		node2.left = node5;
		node5.parent=node2;
		node2.right = node6;
		node6.parent = node2;
		node3.left = node7;
		node7.parent=node3;
		node3.right = node8;
		node8.parent=node3;
		node4.left = node9;
		node9.parent=node4;
		node4.right = node10;
		node10.parent=node4;
		
		System.out.println(successor(root));

	}

	private static Node successor(Node node) {
		
		if(node==null) return null;
		
		if(node.right!=null){
			return leftMostNode(node.right);
		}else{
			Node q = node;
			Node x = q.parent;
			
			while(x!=null&&x.left!=q){
				q=x;
				x=x.parent;
			}
			return x;
		}
		
	}

	private static Node leftMostNode(Node node) {
		if(node==null){
			return null;
		}
		if(node.left==null) return node;
		
		return leftMostNode(node.left);
		
	}

	
	
}
