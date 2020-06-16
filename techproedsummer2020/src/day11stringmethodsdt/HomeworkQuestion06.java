package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion06 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String and output will be the number of the characters in
		 * the String.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a string");
		
		int strLength = scan.nextLine().length();
		String str = Integer.toString(strLength);

		System.out.println(str);

		scan.close();

	}

}
