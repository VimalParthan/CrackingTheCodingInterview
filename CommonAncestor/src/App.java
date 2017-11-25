
class Result{
	Node node;
	boolean isAncestor;
	public Result(Node node,boolean isAncestor) {
		this.node= node;
		this.isAncestor = isAncestor;
	}
}

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
		Node node10 = new Node(10);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node4.setLeft(node8);
		node4.setRight(node9);
		
		
		Node node=firstCommonAncestor(node1,node8,node9);
		System.out.println(node);

	}
	
	
	

	private static Node firstCommonAncestor(Node root, Node node1,Node node2) {
		
		Result result = commonAncestor(root,node1,node2);
		
		if(result.isAncestor){
			return result.node;
		}
		
		return null;
		
	}




	private static Result commonAncestor(Node root, Node node1, Node node2) {
		
		if(root==null) return new Result(null,false);
		if(node1==root&&node2==root){
			return new Result(root,true);
		}
		
		Result rLeft = commonAncestor(root.getLeft(), node1, node2);
		if(rLeft.isAncestor){
			return rLeft;
		}
		
		Result rRight = commonAncestor(root.getRight(),node1,node2);
		if(rRight.isAncestor){
			return rRight;
		}
		
		if(rLeft.node!=null&&rRight.node!=null){
			return new Result(root,true);
		}
		
		if(root==node1||root==node2){
			boolean isAncestor = rLeft.node!=null||rRight.node!=null;
			return new Result(root, isAncestor);
		}else{
			return new Result(rLeft.node!=null?rLeft.node:rRight.node, false);
		}
	}

}
