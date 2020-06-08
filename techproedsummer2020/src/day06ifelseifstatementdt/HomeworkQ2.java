package day06ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkQ2 {

	public static void main(String[] args) {
		// Ask user to enter any name of the week, then get second ,fourth, and sixth
		// letter of the day name and print them on the console, in the same line.
		// For example; if the user enters “Monday” output will be “ody”

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a day");

		String chars = scan.nextLine();

		char char2 = chars.charAt(1), char4 = chars.charAt(3), char6 = chars.charAt(5);

		System.out.println("the chars of day: " + char2 + char4 + char6);

		scan.close();

	}

}
