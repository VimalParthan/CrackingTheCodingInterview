import java.util.Stack;

public class SortedStack {
	
	private Stack<Integer> storage;
	
	
	public SortedStack(){
		storage = new Stack<>();
	}
	
	public void push(Integer i){
		
		storage.push(i);
	
	}
	
	public Integer pop(){
		sort();
		return storage.pop();
	}

	private void sort() {
		Stack<Integer> sorted = new Stack<Integer>();
		while(!storage.isEmpty()){
			int temp = storage.pop();
			while(!sorted.isEmpty()&&sorted.peek()>temp){
				storage.push(sorted.pop());
			}
			sorted.push(temp);
		}
		
		while(!sorted.isEmpty()){
			storage.push(sorted.pop());
		}
	}
	


}
