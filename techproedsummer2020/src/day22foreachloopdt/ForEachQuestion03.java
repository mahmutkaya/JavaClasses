package day22foreachloopdt;

public class ForEachQuestion03 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to find the common elements between two arrays (string
		 * values).
		 */
		String arr1[] = {"aa","bb","cc"}, arr2[] = {"aa","bb","vv"};
		
		for(String i : arr1) {
			for(String j : arr2) {
				if(i==j) System.out.println(i);
			}
		}

	}

}
