public class BubbleSort {
	
	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static int[] numSort(int[] arr) {
		boolean didswap = false;
		for (int i = arr.length - 1; i>0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j+1] < arr[j]) {
					swap(arr, j, j+1);
					didswap = true;
				}
			}
			if (!didswap) return arr;
			else didswap = false;
		}
		
		return arr;
	}
	
}
