package day21listsdt;

import java.util.Arrays;

public class HomeworkQuestion04 {

	public static void main(String[] args) {
		/*
		 * Find the sum of the elements in the array elements of the given multi
		 * dimensional array { {1,2,3}, {4,5}, {6,7} } and return an array. For example;
		 * for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
		 */
		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };

		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				res[i] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(res));

	}

}
