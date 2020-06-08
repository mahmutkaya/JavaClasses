package day06ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkQuestion02 {
	public static void main(String[] args) {
		// Ask user to enter his/her age and gender.
		// If the age is more than 65 and the gender is male
		// then output will be “Hey man you retired!” else output will be “No need to
		// work”
		Scanner scan = new Scanner(System.in);

		System.out.println("please, enter your age");
		int age = scan.nextInt();

		/*
		 * Scanner.nextInt method does not read the newline character in input created
		 * by hitting "Enter," and so the call to Scanner.nextLine returns after reading
		 * that newline
		 */
		scan.nextLine();

		System.out.println("please, enter your gender");
		String gender = scan.nextLine();

		if (age > 65 && gender.equalsIgnoreCase("male")) {
			System.out.println("Hey man you retired!");
		} else {
			System.out.println("No need to work");
		}

		scan.close();

	}

}
