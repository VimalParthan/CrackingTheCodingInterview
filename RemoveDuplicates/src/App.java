import java.util.HashSet;


public class App {

	public static void main(String[] args) {
		
		LinkedList<String>linkedList = new LinkedList<>();
		
		linkedList.insert("vimal");
		linkedList.insert("vimal");
		linkedList.insert("veena");
		linkedList.traverse();
		removeDuplicates(linkedList.root);
		removeDuplicatesNoBuffer(linkedList.root);
		linkedList.traverse();
		
		
		
	}

	private static void removeDuplicates(Node<String> root) {
		
		HashSet<String> set =new HashSet<>();

		Node<String> node = root;
		Node<String> prev = null;
		while(node!=null){
			
			if(set.contains(node.getData())){
				prev.setNextNode(node.getNextNode());
			}else{
			set.add(node.getData());
			prev = node;
			}
			node=node.getNextNode();
		}
		
		
	}
	
	private static void removeDuplicatesNoBuffer(Node<String> root){
		
		Node<String> firstPointer = root;
		Node<String> secondPointer = null;
	
		while(firstPointer!=null){
			
			secondPointer = firstPointer;
			while(secondPointer.getNextNode()!=null){
				if(secondPointer.getNextNode().getData().compareTo(firstPointer.getData())==0){
					secondPointer.setNextNode(secondPointer.getNextNode().getNextNode());
				}else
				secondPointer=secondPointer.getNextNode();
			}
			firstPointer = firstPointer.getNextNode();
		}
		
	}

}
