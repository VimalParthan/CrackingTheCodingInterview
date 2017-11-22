
public class App {

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7};
		
		Node n = minimalTree(array);
		
		inorderTraversal(n);
	}

	private static void inorderTraversal(Node n) {
		
		if(n!=null){
			inorderTraversal(n.getLeftNode());
			System.out.println(n);
			inorderTraversal(n.getRightNode());
		}
	}

	private static Node minimalTree(int[] array) {
		
		return minimalTree(array,0,array.length-1);
		
	}

	private static Node minimalTree(int[] array, int i, int j) {
		
		if(i>j){
			return null;
		}
		
		int mid = (i+j)/2;
		
		Node n = new Node(array[mid]);
		
		n.setLeftNode(minimalTree(array,i,mid-1));
		n.setRightNode(minimalTree(array,mid+1,j));
		
		return n;
	}
	
	

}
