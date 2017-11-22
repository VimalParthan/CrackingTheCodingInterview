import java.util.LinkedList;
import java.util.Queue;

public class App {

	public static void main(String[] args) {
		
	
		
		Node<String> node1 = new Node<>("A");
		Node<String> node2 = new Node<>("B");
		Node<String> node3 = new Node<>("C");
		Node<String> node4 = new Node<>("D");
		Node<String> node5 = new Node<>("E");
		Node<String> node6 = new Node<>("F");
		Node<String> node7 = new Node<>("G");
		
		node1.addAdjacentNode(node3);
		node1.addAdjacentNode(node4);
		
		node2.addAdjacentNode(node6);
		node2.addAdjacentNode(node7);
		
		node3.addAdjacentNode(node5);
		node5.addAdjacentNode(node6);
		
		
		System.out.println(routeBetweenNode(node1, node2));
		
	}
	
	public static boolean routeBetweenNode(Node<String> node1,Node<String> node2){
		
		 return bfsSearch(node1, node2)||bfsSearch(node2, node1);
	}

	private static boolean bfsSearch(Node<String> node1, Node<String> node2) {
		
		Queue<Node<String>> queue = new LinkedList<>();
		
		queue.add(node1);
		
		while(!queue.isEmpty()){
			Node<String> currentNode = queue.remove();
			currentNode.setVisited(true);
			for(Node<String> node:currentNode.getAdjacentNodes()){
				if(node.equals(node2)){
					return true;
				}else if(!node.isVisited()){
					queue.add(node);
				}
				
				
			}
		}
		return false;
		
	}

}
