class Result{
	Node<Integer> node;
	boolean isPalindrome;
	public Result(Node<Integer> node, boolean isPalindrome) {
		super();
		this.node = node;
		this.isPalindrome = isPalindrome;
	}
	
}
public class App {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.insert(3);
		list.insert(5);
		list.insert(8);
		list.insert(5);
		list.insert(8);
		list.insert(5);
		list.insert(3);
		
		System.out.println(linkedListIsPalindrome(list.root));
  
	}

	
	
	private static boolean linkedListIsPalindrome(Node<Integer> root) {
		
		int length = length(root);
		
		Result result = recursivePalindrome(root,length);
		
		return result.isPalindrome;
	
		
	}

	private static Result recursivePalindrome(Node<Integer> node, int length) {
		
		
		if(length<=0||node==null){
			return new Result(node,true);
		}
		else if(length==1){
			return new Result(node.getNextNode(),true);
		}
		
		Result res = recursivePalindrome(node.getNextNode(), length-2);
		
		if(node==null||!res.isPalindrome){
			return res;
		}
		
		res.isPalindrome=(res.node.getData()==node.getData());
		
		res.node=res.node.getNextNode();
		
		return res;
	}



	private static int length(Node<Integer> node) {
		int count = 0;
		
		while(node!=null){
			count++;
			node = node.getNextNode();
		}
		
		return count;
	}
	
	
}
