
public class App {
	
	public static void main(String args[]){
		MyQueue mq = new MyQueue();
		
		mq.push(1);
		mq.push(2);
		mq.push(3);
		
		System.out.println(mq.peek());
		System.out.println(mq.pop());
		
		
		mq.push(4);
		mq.push(5);
		mq.push(6);
		
		System.out.println(mq.peek());
		System.out.println(mq.pop());
		
		mq.push(7);
		mq.push(8);
		mq.push(9);
		
		System.out.println(mq.peek());
		System.out.println(mq.pop());
		
		mq.push(10);
		
		System.out.println(mq.peek());
		System.out.println(mq.pop());
	}

}
