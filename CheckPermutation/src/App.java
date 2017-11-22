public class App{

	public static void main(String [] args){
		System.out.println(checkPermutation("vimalaa","lamivaa"));
	}

	private static boolean checkPermutation(String string1,String string2){
		
		if(string1.length()!=string2.length()){
			return false;		
		}
		
		int [] chars = new int[256];
		
		int index;

		for(char c:string1.toCharArray()){
			index = (int) c;
			chars[index]++;	
		}

		for(char c:string2.toCharArray()){
			index = (int) c;
			chars[index]--;
			
			if(chars[index]<0)
				return false;
		}	
		
		
		
		return true;
	}
}
