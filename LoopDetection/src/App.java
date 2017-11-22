
public class App {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Node<Integer> node = new Node<>(9);
		
		list.insert(3);
		list.insert(5);
		list.insert(8);
		list.insert(node);
		list.insert(5);
		list.insert(3);
		list.insert(5);
		list.insert(4);
		list.insert(node);
		
		
		System.out.println(startOfLoop(list.root));
  
	}

	private static Node<Integer> startOfLoop(Node<Integer> root) {
		
		Node<Integer> slowNode=root;
		Node<Integer> fastNode=root;
		
		while(fastNode!=null&&fastNode.getNextNode()!=null){
			slowNode= slowNode.getNextNode();
			fastNode=fastNode.getNextNode().getNextNode();
			if(slowNode==fastNode)
				break;
		}
	
		if(fastNode==null||fastNode.getNextNode()==null){
			return null;
		}
		
		slowNode=root;
		
		while(slowNode!=fastNode){
			slowNode=slowNode.getNextNode();
			fastNode = fastNode.getNextNode();
			
		}
		
		return slowNode;
		
	}

	
	
}
