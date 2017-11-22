
public class App {

	public static void main(String[] args) {
		
		MinStack2 minStack = new MinStack2(); 
		
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.pop();
		minStack.push(10);
		System.out.println(minStack.min());
		minStack.push(1);
		System.out.println(minStack.min());
		minStack.push(11);
		System.out.println(minStack.min());
		minStack.push(2);
		System.out.println(minStack.min());
		minStack.push(12);
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.pop();
		System.out.println(minStack.min());
		minStack.push(12);
		System.out.println(minStack.min());
		minStack.push(-1);
		System.out.println(minStack.min());
		
	}

}
