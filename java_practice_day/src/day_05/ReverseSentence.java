package day_05;

public class ReverseSentence {

	public static void main(String[] args) {
//		!Create a method: reverseString
//		!It should accept a string sentences
//		! And return the reverse of that string sentences.
//		! E.g:
//		!String str ="I love Java"; !Output:"Java love I”

		reverseString("Learning Java");

	}

	public static String reverseString(String str) {
		String arr[] = str.split(" ");
		String newStr = "";

		for (int i = arr.length - 1; i >= 0; i--) {
			newStr += arr[i] + " ";
		}
		System.out.println(newStr);
		return newStr;
	}

}
