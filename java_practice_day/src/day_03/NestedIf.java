package day_03;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		/*
		 * Create a class : “NestedIfStatements” ask user to enter 2 birth dates Get the
		 * year, months, and day as integer then find the older person using Nested if
		 * statements Examples: int birthYearOfYusuf=2000, birthMonthOfYusuf=12,
		 * birthDayOfYusuf=12, int birthYearOfMehmet=2000,birthMonthOfMehmet=12,
		 * birthDayOfMehmet=21; Yusuf is OlderÏ
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("birthYearOfYusuf");
		int birthYearOfYusuf = scan.nextInt();
		System.out.println("birthMonthOfYusuf");
		int birthMonthOfYusuf = scan.nextInt();
		System.out.println("birthDayOfYusuf");
		int birthDayOfYusuf = scan.nextInt();
		System.out.println("birthYearOfMehmet");
		int birthYearOfMehmet = scan.nextInt();
		System.out.println("birthMonthOfMehmet");
		int birthMonthOfMehmet = scan.nextInt();
		System.out.println("birthDayOfMehmet");
		int birthDayOfMehmet = scan.nextInt();
		// So far we just got 6 data from user.
		// Now we will use if statement to check the different conditions.
		// LOGIC: We will compare years then months then days
		if (birthYearOfYusuf > birthYearOfMehmet) {
			System.out.println("Mehmet is Older");
		} else if (birthYearOfYusuf < birthYearOfMehmet) {
			System.out.println("Yusuf is Older");
		} else {// SAME YEAR
			// We compared years. When years are same We have to compare the month
			if (birthMonthOfYusuf > birthMonthOfMehmet) {
				System.out.println("Mehmet is older");
			} else if (birthMonthOfYusuf < birthMonthOfMehmet) {
				System.out.println("Yusuf is older");
			} else {/// SAME YEAR AND MONTH
				if (birthDayOfYusuf > birthDayOfMehmet) {
					System.out.println("Mehmet is older");
				} else if (birthDayOfYusuf < birthDayOfMehmet) {
					System.out.println("Yusuf is older");
				} else {
					System.out.println("Interesting. Same year, month, day");
				}

			}
		}

	}

}
