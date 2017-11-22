
public class App {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Node<Integer> node = new Node<>(8);
		list.insert(3);
		list.insert(5);
		list.insert(node);
		list.insert(5);
		list.insert(3);
		list.insert(5);
		list.insert(3);
		
		LinkedList<Integer> list2 = new LinkedList<>();
		list2.insert(5);
		list2.insert(3);
		list2.insert(5);
		list2.insert(3);
		list2.insert(9);
		
		Node<Integer> intersectionNode = hasIntersection(list.root, list2.root);
		
			if(intersectionNode!=null){
				System.out.println(intersectionNode.getData());
			}else{
				System.out.println("no intersection");
			}

	}

	private static Node<Integer> hasIntersection(Node<Integer> root, Node<Integer> root2) {
		
		boolean hasSameTail = sameTail(root,root2);
		
		if(!hasSameTail){
			return null;
		}
		
		int length1= length(root);
		int length2 = length(root2);
		
		if(length1>length2){
			root=removeExtraNodes(root,length1-length2);
		}else if(length2>length1){
			root2 = removeExtraNodes(root,length2-length1);
		}
		
		while(root!=root2){
			root=root.getNextNode();
			root2=root2.getNextNode();
		}
		
		return root;
		
	}

	private static Node<Integer> removeExtraNodes(Node<Integer> root, int i) {
		
		while(i>0){
			root=root.getNextNode();
			i--;
		}
		
		return root;
		
	}

	private static int length(Node<Integer> root) {
		int count = 0;
		
		while(root!=null){
			count++;
			root=root.getNextNode();
		}
		
		return count;
	}

	private static boolean sameTail(Node<Integer> root, Node<Integer> root2) {
		
		while(root!=null&&root.getNextNode()!=null){
			root=root.getNextNode();
		}
		

		while(root2!=null&&root2.getNextNode()!=null){
			root2=root2.getNextNode();
		}
		
		return (root==root2);
	}

	
}
