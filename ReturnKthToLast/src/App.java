class Index {
	int index = 0;
}

public class App {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.insert(5);
		linkedList.insert(6);
		
		System.out.println(returnKthToLastElementRecursive(3,linkedList.root).getData());
		System.out.println(returnKthToLastElementIterative(3,linkedList.root).getData());
		
	}

	private static Node<Integer> returnKthToLastElementIterative(int i, Node<Integer> root) {
		
		Node<Integer> nodeOne = root;
		Node<Integer> nodeTwo = root;
		
		for(int j=0;j<i;j++){
			
			if(nodeOne==null){
				return null;
			}
			nodeOne = nodeOne.getNextNode();
		}
		
		while(nodeOne!=null){
			nodeOne = nodeOne.getNextNode();
			nodeTwo = nodeTwo.getNextNode();
		}
		
		return nodeTwo;
	}

	private static Node<Integer> returnKthToLastElementRecursive(int i, Node<Integer> root) {
		Index idx = new Index();
		return returnKthToLastElementRecursive(i, root,idx);
	}

	private static Node<Integer> returnKthToLastElementRecursive(int i, Node<Integer> root, Index idx) {
	
		if(root==null)
			return null;
		
		Node<Integer> node = returnKthToLastElementRecursive(i, root.getNextNode(),idx);
		idx.index +=1;
		
		if(idx.index==i)
			return root;
		
		return node;
	}
}
