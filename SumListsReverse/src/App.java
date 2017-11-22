
public class App {

	public static void main(String[] args){
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<>();	
		
		first.insert(6);
		first.insert(1);
		first.insert(7);


		second.insert(2);
		second.insert(9);
		second.insert(5);
		
		
		
		Node<Integer> node=sumListsReverse(first.root,second.root,0);
		
		while(node!=null){
			System.out.println(node.getData());
			node=node.getNextNode();
		}
		
	}
	
	private static Node<Integer> sumListsReverse(Node<Integer> first,Node<Integer> second,int remainder){
	
	
		if(first==null&&second==null&&remainder==0)
			return null;
		
		int tempSum=remainder;		
		
		
	
		
		if(first!=null)
			tempSum+=first.getData();

		if(second!=null)
			tempSum+=second.getData();
			
		if(tempSum>9){
			remainder = tempSum/10;
		}else{
			remainder = 0;
		}
		Node <Integer> result = new Node<>(tempSum%10);
		
		Node<Integer>next=null;
		
		if(first!=null||second!=null){
			next=sumListsReverse((first==null?null:first.getNextNode()),(second==null?null:second.getNextNode()),remainder);
			
		}
			
		result.setNextNode(next);
		
		return result;
	}

}
