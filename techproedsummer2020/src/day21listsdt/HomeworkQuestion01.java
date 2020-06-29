package day21listsdt;

public class HomeworkQuestion01 {
	public static void main(String[] args) {
		// Find the sum of all elements in the multi dimensional array { {1,2,3},
		// {4,5,6} }

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
