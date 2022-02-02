
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = {"hey", "ho", "uncle"};
		String str = "walfoiqreomgqrgom";
		int[] arr2 = {31,6,10,14,16,19};
		int[] intunsorted = {5,3,1,4,2};
		LinearSort sort = new LinearSort();
//		System.out.println(sort.linearSort(arr1, "ho"));
//		System.out.println(LinearSort.stringSort(arr1, "h"));
//		System.out.println(BinarySort.numSort(arr2, 20));
//		System.out.println(NaiveStringSearch.stringSearch(str, "omg"));
		int[] intsorted = BubbleSort.numSort(arr2);
		for (int i : intsorted) {
			System.out.println(i);
		}
	}

}
