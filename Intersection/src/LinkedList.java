
public class LinkedList <T extends Comparable<T>> implements List<T>{
	
		public Node<T> root;
	
		public void insert(T data){
			
			if(this.root==null){
				this.root=new Node<T>(data);
			}else {
				Node<T> node = new Node<>(data);
				node.setNextNode(root);
				root=node;
				
			}
		}
		
		public void insert(Node<T> node){
			
			if(this.root==null){
				this.root=node;
			}else {
				node.setNextNode(root);
				root=node;
			}
		}

		

		@Override
		public void traverse() {
			
			if(root!=null){
				traverse(root);
			}
			
		}

		private void traverse(Node<T> node) {
			System.out.println(node.getData());
			if(node.getNextNode()!=null){
				traverse(node.getNextNode());
			}
		}

	
		

}
