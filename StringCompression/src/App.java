
public class App {

	public static void main(String[] args) {
		
			System.out.println(compressString("aabcccccaaa"));

	}
	
	private static String compressString(String string){
		
		int compressedStringLength = getCompressedStringLength(string);	
		
		if(compressedStringLength>string.length()){
			return string;		
		}
		
		StringBuilder stringBuilder = new StringBuilder(compressedStringLength);
		
		char currentChar;
		int counter=0; 
		

		for(int i=0;i<string.length();i++){
			currentChar = string.charAt(i);
			if(i==string.length()-1||currentChar!=string.charAt(i+1)){
				counter++;
				stringBuilder.append(currentChar);
				stringBuilder.append(counter);
				counter=0;
			}else{
				counter++;
			
			}		
		}

		return stringBuilder.toString();
	}

	

	private static int getCompressedStringLength(String string){
		
		int counter = 0; 		
		char currentChar;
		for(int i=0;i<string.length();i++){
			currentChar = string.charAt(i);			
			if(i==string.length()-1||currentChar!=string.charAt(i+1)){
				counter++;			
			}	
		}

		return 2*counter;
	}
}
