package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String. If the String has 2 characters, output will be
		 * “It is valid for state abbreviations” Otherwise, output will be “It is not
		 * valid for state abbreviations”
		 */
		// to get the number of characters in a string, we will use length() method.
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scan.nextLine().toUpperCase();
		System.out.println(str);

		String checkStr = str.length() == 2 
				? "It is valid for state abbreviations"
				: "It is not valid for state abbreviations";

		System.out.println(checkStr);

		scan.close();

	}

}
