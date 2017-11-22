
public class App {

	public static void main(String[] args) {
		
		SortedStack ss = new SortedStack();
		
		ss.push(9);
		ss.push(10);
		System.out.println(ss.pop());
		ss.push(13);
		ss.push(12);
		ss.push(1);
		ss.push(2);
		System.out.println(ss.pop());
		ss.push(3);
		ss.push(7);
		ss.push(2);
		ss.push(190);
		System.out.println(ss.pop());
		

	}

}
