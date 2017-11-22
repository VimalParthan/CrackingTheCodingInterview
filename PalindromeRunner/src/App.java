import java.util.Stack;

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
		
		Node <Integer> slow = head;
		Node <Integer> fast = head;
		
		Stack<Node<Integer>> nodeStack = new Stack<Node<Integer>>();
		
		while(fast!=null&&fast.getNextNode()!=null){
			nodeStack.push(slow);
			slow = slow.getNextNode();
			fast = fast.getNextNode().getNextNode();
		}
		
		if(fast!=null){
			slow=slow.getNextNode();
		}
		
		while(slow!=null){
			if(slow.getData()!=nodeStack.pop().getData()){
				return false;
			}
			slow = slow.getNextNode();
		}
		
		return true;
	}
	
	
}
