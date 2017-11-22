import java.util.EmptyStackException;

public class MinStack  <T extends Comparable<T>>{
	
	private T stackMin;
	private MinStackNode<T> top;
	
	class MinStackNode<E extends Comparable<T>> {
		
		T data;
		MinStackNode<T> next;
		T min;
		
		public MinStackNode(T data) {
			this.data = data;
			
			min=stackMin==null?data:data.compareTo(stackMin)<=0?data:stackMin;	
		}
	
	}
	
	
	public void push(T data){
		
		MinStackNode<T> node = new MinStackNode<>(data);
		if(top==null){
			this.stackMin=node.data;
			this.top=node;
		}else{
			this.stackMin = data.compareTo(stackMin)<=0?data:stackMin;
			node.next = this.top;
			this.top = node;
		}
		
	}
	
	
	public T pop() throws EmptyStackException{
		if(this.top==null){
			throw new EmptyStackException();
		}else{
			T temp = this.top.data;
			this.top=top.next;
			if(top!=null){
			this.stackMin=top.min;
			}else{
				this.stackMin=null;
			}
			return temp;
		}
	}
	
	public T peek() throws EmptyStackException{
		if(this.top==null){
			throw new EmptyStackException();
		}else{
			return this.top.data;
		}
	}
	
	public T min(){
		return this.stackMin;
	}
}
