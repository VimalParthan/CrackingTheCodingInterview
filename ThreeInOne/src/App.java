
public class App {

	public static void main(String[] args) throws FullStackException {
		MultiStack multiStack = new MultiStack(5);
		
		multiStack.push(0, 1);
		System.out.println(multiStack.peek(0));
		multiStack.push(0, 2);
		System.out.println(multiStack.peek(0));
		multiStack.push(0, 3);
		System.out.println(multiStack.peek(0));
		multiStack.push(0, 4);
		System.out.println(multiStack.peek(0));
		multiStack.push(0, 5);
		System.out.println(multiStack.peek(0));
		multiStack.push(1, 6);
		System.out.println(multiStack.peek(1));
		multiStack.push(1, 7);
		System.out.println(multiStack.peek(1));
		multiStack.push(1, 8);
		System.out.println(multiStack.peek(1));
		multiStack.push(1, 9);
		System.out.println(multiStack.peek(1));
		multiStack.push(1, 10);
		System.out.println(multiStack.peek(1));
		multiStack.push(2, 11);
		System.out.println(multiStack.peek(2));
		multiStack.push(2, 12);
		System.out.println(multiStack.peek(2));
		multiStack.push(2, 13);
		System.out.println(multiStack.peek(2));
		multiStack.push(2, 14);
		System.out.println(multiStack.peek(2));
		multiStack.push(2, 15);
		System.out.println(multiStack.peek(2));
		
		System.out.println(multiStack.pop(0));
		System.out.println(multiStack.pop(0));
		System.out.println(multiStack.pop(0));
		System.out.println(multiStack.pop(0));
		System.out.println(multiStack.pop(0));
		System.out.println(multiStack.pop(1));
		System.out.println(multiStack.pop(1));
		System.out.println(multiStack.pop(1));
		System.out.println(multiStack.pop(1));
		System.out.println(multiStack.pop(1));
		System.out.println(multiStack.pop(2));
		System.out.println(multiStack.pop(2));
		System.out.println(multiStack.pop(2));
		System.out.println(multiStack.pop(2));
		System.out.println(multiStack.pop(2));
	
		
		

	}

}
