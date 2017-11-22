import java.util.Stack;

public class MyQueue {

	private Stack<Integer> newest, oldest;

	public MyQueue() {
		this.newest = new Stack<>();
		this.oldest = new Stack<>();
	}

	public void push(Integer i) {
		newest.push(i);
	}

	public Integer pop() {
		transferToOldest();

		return oldest.pop();

	}
	
	public int size(){
		return newest.size()+oldest.size();
	}

	public Integer peek() {

		transferToOldest();
		return oldest.peek();
		
	}

	private void transferToOldest() {

		if (oldest.isEmpty()) {
			while (!newest.isEmpty()) {
				oldest.push(newest.pop());
			}
		}
	}

}
