
public class NaiveStringSearch {

	public static int stringSearch(String longString, String str) {
		int count = 0;
		for (int i = 0; i<=(longString.length()-str.length()); i++ ) {
			
			for (int j = 0; j < str.length(); j++) {
				if(longString.charAt(i+j) != str.charAt(j)) break;
				if (j == str.length()-1) count++;
			}
		}
		
		return count;
	}
	
}
