
public class Stack<T extends Comparable<T>> {
	
	class Node {
		
		T data;
		Node below;
		Node above;
		
		Node(T data){
			this.data = data;
		}
		
	}
	
	private int capacity;
	private Node top,bottom;
	public int size=0;
	
	public Stack(int capacity){}

	public boolean isFull() {
		
		return size==capacity;
	}

	public void push(T i) {

		size++;
		Node node = new Node(i);
		if(size==1) bottom = node;
		join(node,top);
		top = node;
	}
	
	public T pop(){
		
		Node node = top;
		
		top = node.below;
		size--;
		return node.data;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public T removeBottom(){
		
		Node node = bottom;
		
		bottom= bottom.above;
		if(bottom!=null)bottom.below=null;
		size--;
		return node.data;
		
	}

	private void join(Stack<T>.Node above, Stack<T>.Node below) {
		
		if(above!=null)above.below = below;
		if(below!=null)below.above = above;
	}
	

}
