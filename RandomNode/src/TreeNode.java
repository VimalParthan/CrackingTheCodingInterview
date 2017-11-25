import java.util.Random;

public class TreeNode {
	
	private int data;
	
	private TreeNode left;
	
	private TreeNode right;
	
	private int size=0;

	public TreeNode(int data) {
		super();
		this.data = data;
		this.size = 1;
	}
	
	
	public TreeNode getRandomNode(){
		int leftSize =left==null?0:size;
		Random random = new Random();
		int index = random.nextInt(leftSize);
		if(index<leftSize){
			return left.getRandomNode();
		}else if(index==leftSize){
			return this;
		}else{
			return right.getRandomNode();
		}
	}
	
	public void insertNode(int data){
		
		if(data<this.data){
			if(this.left==null){
				TreeNode n = new TreeNode(data);
				this.left = n;
			}else{
				this.left.insertNode(data);
			}
		}else if(data>this.data){
			if(this.right==null){
				TreeNode n = new TreeNode(data);
				this.right = n;
			}else{
				this.right.insertNode(data);
			}
		}
		size++;	
	}
	
	public TreeNode findNode(int data){
		
		if(this.data==data){
			return this;
		}else if(this.data<data&&this.left!=null){
			return this.left.findNode(data);
		}else if(this.data>data&&this.right!=null){
			return this.right.findNode(data);
		}
		
		return null;
	}

}
