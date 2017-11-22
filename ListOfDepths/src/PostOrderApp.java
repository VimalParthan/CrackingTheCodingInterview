import java.util.LinkedList;
import java.util.List;

public class PostOrderApp {

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
		
		root.left = node1;
		root.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
		node4.left = node9;
		node4.right = node10;
		node5.left = node11;
		node5.right = node12;
		
		System.out.println(listsOfDepth(root));
	}
	
	static public List<List<Node>> listsOfDepth(Node root){
		
		List<List<Node>> list = new LinkedList<>();
		
		listsOfDepth(root,list,0);
		
		return list;
	}

	private static void listsOfDepth(Node root, List<List<Node>> lists, int level) {
		
		if(root==null){
			return;
		}
		List<Node> nodeList = null;
		
		if(lists.size()==level){
			nodeList = new LinkedList<>();
			lists.add(nodeList);
		}else{
			nodeList = lists.get(level);
		}
		
		nodeList.add(root);
		
		
		listsOfDepth(root.left,lists,level+1);
		listsOfDepth(root.right,lists,level+1);
		
		
	}
	
	

}
