public class App{
	public static void main(String args[]){
		System.out.println(palindromePermutation("Tact Coa"));	
	}

	private static boolean  palindromePermutation(String string){
		
		string = string.toLowerCase();
		
		int[] chars= new int [(int)'z'-(int)'a'+1];
		int oddCounter = 0;
		
		for(int i=0;i<string.length();i++){
				
				int charIndex = getCharIndex(string.charAt(i));
				if(charIndex!=-1){
				chars[charIndex]++;
				if(chars[charIndex]%2==1){
					oddCounter++;
				}else
				oddCounter--;
				}
		}
		
		return oddCounter<=1;
				
	}
	
	private static int getCharIndex(char c){
		
		int asciiIndex = (int)c;
		
		if(c>=(int)'a'&&c<=(int)'z'){
			return asciiIndex-(int)'a';
		}
		return -1;
	}
}
