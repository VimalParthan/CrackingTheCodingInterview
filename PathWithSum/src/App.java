import java.util.Hashtable;

public class App {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		Node node2 = new Node(5);
		Node node3 = new Node(-3);
		Node node4 = new Node(3);
		Node node5 = new Node(1);
		Node node6 = new Node(11);
		Node node7 = new Node(3);
		Node node8 = new Node(-2);
		Node node9 = new Node(2);
		
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setRight(node6);
		node4.setLeft(node7);
		node4.setRight(node8);
		node5.setRight(node9);
		
		System.out.println(pathsWithSum(node1,1));
		
		
		

	}
	
	private static int pathsWithSum(Node root, int targetSum){
		
		return countPathWithSum(root,targetSum,new Hashtable<Integer,Integer>(),0);
		
		
	}

	private static int countPathWithSum(Node node, int targetSum, Hashtable<Integer, Integer> pathsTable, int runningSum) {
		
		if(node==null){
			return 0;
		}
		
		runningSum +=node.getData(); 
		
		int pathStartSum = runningSum-targetSum;
		
		int paths = pathsTable.getOrDefault(pathStartSum, 0);
		
		
		incrementHashTable(runningSum,pathsTable,1);
		paths += countPathWithSum(node.getLeft(), targetSum, pathsTable, runningSum);
		paths += countPathWithSum(node.getRight(), targetSum, pathsTable, runningSum);
		incrementHashTable(runningSum, pathsTable, -1);
		
		return paths;
	}

	private static void incrementHashTable(int runningSum, Hashtable<Integer, Integer> pathsTable,int delta) {
		int newCount  = pathsTable.getOrDefault(runningSum, 0)+delta;
		if(newCount==0){
			pathsTable.remove(runningSum);
		}else{
			pathsTable.put(runningSum, newCount);
		}
		
	}
	
}
