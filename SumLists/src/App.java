
public class App {

	public static void main(String[] args){
		LinkedList<Integer> first = new LinkedList<>();
		LinkedList<Integer> second = new LinkedList<>();	
		
		first.insert(3);
		first.insert(2);
		first.insert(1);


		second.insert(3);
		second.insert(2);
		second.insert(1);
		
		
		
		Node<Integer> node=sumLists(first.root,second.root);
		
		while(node!=null){
			System.out.println(node.getData());
			node=node.getNextNode();
		}
		
	}

	private static Node<Integer> sumLists(Node<Integer> first, Node<Integer> second) {
		
		int firstLen = length(first);
		int secondLen = length(second);
		
		first=firstLen<secondLen?appendZeros(first,secondLen-firstLen):first;
		second= secondLen<firstLen?appendZeros(second,firstLen-secondLen):second;
		
		PartialSum sum=sumList(first,second);
		
		if(sum.carry==0)
			return sum.node;
		else{
			Node<Integer> node = new Node<>(sum.carry);
			node.setNextNode(sum.node);
			return node;
		}
	}

	private static PartialSum sumList(Node<Integer> first, Node<Integer> second) {
		
		if(first==null&&second==null){
			PartialSum partialSum = new PartialSum();
			return partialSum;
		}
		
		PartialSum partialSum = sumList(first.getNextNode(),second.getNextNode());
		
		int val = partialSum.carry+first.getData()+second.getData();
		
		Node<Integer>node = new Node<Integer>(val%10);
		if(partialSum.node!=null){
			node.setNextNode(partialSum.node);
		}
		
		partialSum.node=node;
		partialSum.carry=val/10;
		return partialSum;
		
	}

	private static Node<Integer> appendZeros(Node<Integer> node, int i) {
		while(i>=0){
			Node<Integer> tempNode = new Node<>(0);
			tempNode.setNextNode(node);
			node = tempNode;
		}
		
		return node;
	}

	private static int length(Node<Integer> node) {
		
		int counter=0;
		while(node!=null){
			node=node.getNextNode();
			counter++;
		}
		return counter;
	}
	
	

}

class PartialSum{
	
	Node<Integer>node =null;
	int carry = 0;
	
}
