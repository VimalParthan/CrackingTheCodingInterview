public class App{
	public static void main(String [] args){
		System.out.println(urlify(new char[]{'M','r',' ','J','o','h','n',' ', 'S','m','i','t','h',' ',' ',' ',' '},13));	
	}

	private static String urlify(char[] chars,int trueLength){
	
		int spaceCount = 0;		
		for(int i=0;i<trueLength;i++){
			if(chars[i]==' '){
			spaceCount++;			
			}		
		}	
		
		int currentIndex = (trueLength-1)+(spaceCount*2);
		
		for(int i=trueLength-1;i>=0;i--){
			if(chars[i]!=' '){
				chars[currentIndex]=chars[i];
				currentIndex--;			
			}else{
				chars[currentIndex]='0';
				chars[currentIndex-1]='2';
				chars[currentIndex-2]='%';
				currentIndex-=3;			
			}			
							
		}	

		return new String(chars);
	}
}
