
public class App {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.insert("vimal");
		linkedList.insert("vimal");
		linkedList.insert("veena");
		linkedList.traverse();
		deleteMiddleNode(linkedList.getNode(1));
		linkedList.traverse();
		
	}

	private static void deleteMiddleNode(Node<String> middleNode){

		Node<String> node = middleNode;
	
		node.setData(node.getNextNode().getData());
		node.setNextNode(node.getNextNode().getNextNode());
		

	}

}
