package day_05;

import java.util.Arrays;

public class PrintArrays1 {

	public static void main(String[] args) {
		/*
		 * ! Create a static void method: acceptArray It should take one String array as
		 * parameter 
		 * ! and print them as an array 
		 * ! e.g String[] array = { "sam", "john", "tom" }; 
		 * ! acceptArray(array); 
		 * ! Then output: [sam,john,tom] 
		 * 
		 * ! Create another static method :acceptArray2 It should take one String array as
		 * parameter 
		 * ! and print each element in the array 
		 * ! e.g String[] array = {"sam", "john", "tom" }; 
		 * ! acceptArray2(array); 
		 * ! Then output: sam john tom
		 */
		String arr[] = {"sam", "john", "tom"};
		acceptArray(arr);
		acceptArray2(arr);

	}
	static void acceptArray(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	static void acceptArray2(String[] arr) {
		for(String w: arr) {
			System.out.print(w+" ");
		}
	}

}
