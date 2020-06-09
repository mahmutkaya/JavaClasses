package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary and if-else, ask user to enter an integer, if
		 * the integer is even, the output will be “The integer is even”. If the integer
		 * is odd, the output will be “The integer is odd”.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("The integer is even");
		} else {
			System.out.println("The integer is odd");
		}

		String result = num % 2 == 0 ? "The integer is even" : "The integer is odd";
		System.out.println(result);

		scan.close();

	}

}
