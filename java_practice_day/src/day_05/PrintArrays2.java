package day_05;

import java.util.Arrays;

public class PrintArrays2 {

	public static void main(String[] args) {
//		! Create a static method name: acceptString
//		It should take accept 3 strings as parameter
//		! and print them as an array
//		! e.g. String[] array = { "sam", "john", "tom" };
//		! acceptString(“sam”,”john”,”tom”);
//		! Then output: [sam,john,tom]
		
//		! Create another static method name: acceptString2
//		It should take accept 3 strings as parameter
//		! and print each element in the array
//		! e.g. String[] array = { "sam", "john", "tom" };
//		! acceptString(“sam”,”john”,”tom”);
//		! Then output: sam john tom
		
		String s1 = "aa", s2 = "bb", s3 = "cc";
		acceptString(s1,s2,s3);
		acceptString2(s1,s2,s3);

	}
	public static void acceptString(String a, String b, String c) {
		String arr[] = {a,b,c};
		System.out.println(Arrays.toString(arr));
	}
	public static void acceptString2(String a, String b, String c) {
		String arr[] = {a,b,c};
		for(String s: arr) {
			System.out.print(s+" ");
		}
	}

}
