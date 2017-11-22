public class App {
	public static void main(String[] args) {
		System.out.println(oneAway("Vimal", "Viml"));
	}

	private static boolean oneAway(String string1, String string2) {

		int lengthDiff = Math.abs(string1.length() - string2.length());

		if (lengthDiff > 1) {
			return false;
		}

		String longString = string1.length() >= string2.length() ? string1 : string2;
		String shortString = string1.length() < string2.length() ? string1 : string2;
		boolean diffFound = false;
		int shortStringIndex = 0;
		int longStringIndex = 0;
		int count=0;
		while (shortStringIndex < shortString.length() && longStringIndex < longString.length()) {
		
			if (longString.charAt(longStringIndex) != shortString.charAt(shortStringIndex)) {
			
				if (!diffFound) {
					diffFound = true;
					if (shortString.length() == longString.length())
						shortStringIndex++;

				} else {
					return false;
				}
			} else {
				shortStringIndex++;

			}
			longStringIndex++;
		}

		return true;
	}
}
