
public class App {

	public static void main(String[] args) {
		
			
		System.out.println(isStringRotation("vimal","molvi"));

	}
	
	private static boolean isStringRotation(String string1, String string2) {
			
		if(string1.length()!=string2.length()){
				return false;
		}else{
			string1 += string1;
			return isSubstring(string1,string2);
		}
		
	}

	private static boolean isSubstring(String s1 ,String s2){
			
			return s1.contains(s2); 
	}

}
