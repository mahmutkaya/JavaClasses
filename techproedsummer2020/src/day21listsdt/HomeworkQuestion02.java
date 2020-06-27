package day21listsdt;

public class HomeworkQuestion02 {
	public static void main(String[] args) {
		/*
		 * Find the product of the last elements in the array elements of the given
		 * multi dimensional array { {1,2,3}, {4,5}, {6} }
		 */
		int arr[][] = { {1,2,3}, {4,5}, {6} };
		int product = 1;
		
		for(int i=0; i<arr.length; i++) {
			int lastEl = arr[i][arr[i].length-1];
				product *= lastEl;
		}
		System.out.println(product);
	}

}
