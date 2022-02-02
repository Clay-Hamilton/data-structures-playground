
public class LinearSort {
	
	public static int stringSort (String[] arr, String val) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int numSort (int[] arr, int val) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		
		return -1;
	}
	
}
