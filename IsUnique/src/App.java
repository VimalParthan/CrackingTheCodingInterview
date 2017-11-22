public class App{

	public static void main(String[] args){
		
		System.out.println(isAllUniqueCharacters("Vimal"));	
	
	}

	private static boolean isAllUniqueCharacters(String string){
	
		if(string.length()>256){
			return false;	
		}		

		boolean [] chars= new boolean[256];
		int index;		
		for(char c:string.toCharArray()){
			index = (int) c;
			if(!chars[index]){
				chars[index]=true;			
			}else{
				return false;		
			}		
		
		} 		
		
		return true;
	}
}
