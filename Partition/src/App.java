
public class App {
	
	public static void main(String [] args){
		
		LinkedList<Integer> list = new LinkedList<>();
		list.insert(3);
		list.insert(5);
		list.insert(8);
		list.insert(5);
		list.insert(10);
		list.insert(2);
		list.insert(1);
		list.traverse();
		System.out.println("fdsfdsfds");
		list.root=partition(5,list.root);
		list.traverse();
			
	}

	private static Node<Integer> partition(int k,Node<Integer> node){
	Node<Integer> head = node;
	Node<Integer> tail = node;

 		while(node!=null){
			Node<Integer> next = node.getNextNode();
			if(node.getData()<k){
				
				node.setNextNode(head);
				head = node;			
			}else{
				tail.setNextNode(node);
				tail = node;			
			}

			node= next;
		}	 
		tail.setNextNode(null);
		
		return head;
		
	}

	
}
