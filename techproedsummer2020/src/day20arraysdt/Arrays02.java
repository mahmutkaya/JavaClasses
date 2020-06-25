package day20arraysdt;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3 }, arr2[] = { 1, 2, 3 }, arr3[] = { 1, 2, 4 };

		boolean b = arr1 == arr2, // false
				b2 = arr1.length == arr2.length, // true
				b3 = Arrays.toString(arr1) == Arrays.toString(arr2), // false
				b4 = arr1[0] == arr2[0]; // true

		boolean b5 = true;

		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i] + "=" + arr2[i]);
				b5 = arr1[i] == arr2[i];
				System.out.println(b5);
			}
		} else {
			b5 = false;
		}

		System.out.println("result is: " + b5);

		// 2. Way: Use equals() in Arrays class to check equality
		System.out.println(Arrays.equals(arr1, arr2)); // true
		System.out.println(Arrays.equals(arr1, arr3)); // false

	}

}
