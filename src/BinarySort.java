
public class BinarySort {

	
	public static int numSort(int[] sortedArr, int val) {
		int lpoint = 0;
		int rpoint = sortedArr.length-1;
		int index = (int)Math.floor((rpoint+lpoint)/2);
		
		while (lpoint < rpoint) {
			
			if (sortedArr[index] == val) {
				return index;
			}
			else if (val < sortedArr[index]) {
				rpoint = index-1;
			}
			else {
				lpoint = index+1;
			}
			index = (int)Math.floor((rpoint+lpoint)/2);
		}
		
		return -1;
	}
}
