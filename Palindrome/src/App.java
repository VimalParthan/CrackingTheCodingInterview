
public class App {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.insert(3);
		list.insert(5);
		list.insert(8);
		list.insert(5);
		list.insert(3);
		list.insert(5);
		list.insert(3);
		
		System.out.println(linkedListIsPalindrome(list.root));
  
	}

	private static boolean linkedListIsPalindrome(Node<Integer> head){
	
		Node<Integer> reverseHead = reverseHead(head);

		while(head!=null){
			if(reverseHead.getData()!=head.getData()){
				return false;			
			}		
			head = head.getNextNode();
			reverseHead = reverseHead.getNextNode();
		}	

		return true;
	}
	
	public static Node<Integer> reverseHead(Node<Integer> node){
	
		Node <Integer> reverseHead = new Node<>(node.getData());
		Node <Integer> head = node;

		while(head.getNextNode()!=null){

			Node <Integer> tempNode = new Node<>(head.getNextNode().getData());
			tempNode.setNextNode(reverseHead);
			reverseHead = tempNode;
			head = head.getNextNode();

		}		
	
		return reverseHead;
			
	}
}
