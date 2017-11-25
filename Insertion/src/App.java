
public class App {

	public static void main(String[] args) {
		
		int a = Integer.parseInt("10000000000",2);
		int b = Integer.parseInt("10011",2);
			
		System.out.println(Integer.toBinaryString(insertion(a,b,2,6)));
	}

	private static int insertion(int a, int b, int i, int j) {
		
		int allOnes = ~0;
		
		System.out.println(Integer.toBinaryString(allOnes));
		
		int startingOnes = allOnes<<(j+1);
		
		System.out.println(Integer.toBinaryString(startingOnes));
		
		int endingOnes = ((1<<i)-1);
	
		
		System.out.println(Integer.toBinaryString(endingOnes));
		
		int mask = startingOnes|endingOnes;
	
		System.out.println(Integer.toBinaryString(mask));
	
		a =a&mask;
		
		System.out.println(Integer.toBinaryString(a));
		
		int shifted_b = b<<2;
		
		System.out.println(Integer.toBinaryString(shifted_b));
		
		return a|shifted_b;
		
		
	}
	
	

}
