
public class LinkedList <T extends Comparable<T>> implements List<T>{
	
		public Node<T> root;
	
		public void insert(T data){
			
			if(this.root==null){
				this.root=new Node<T>(data);
			}else {
				insert(root,data);
			}
		}

		private void insert(Node<T> node, T data) {
			
			if(node.getNextNode()!=null){
				insert(node.getNextNode(),data);
			}else{
				node.setNextNode(new Node<T>(data));
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
		

		public Node<T> getNode(int index) {
			int counter=0;
			Node<T> node = this.root;
			while(counter<index&&node!=null){
				node = node.getNextNode();
				counter++;
			}
			return node;
		}
		

}
