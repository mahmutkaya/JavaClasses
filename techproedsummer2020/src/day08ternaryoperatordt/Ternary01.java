package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer if the integer is greater than 10 print "good"
		 * otherwise, print "bad"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scan.nextInt();
		// 1.way: use if-else
		if (num > 10) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}

		// 2nd way: ternary operator
		String result = num > 10 ? "Good" : "Bad";
		System.out.println(result);

		scan.close();

	}

}
