package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*
		 * Type java code by using ternary and if-else. Ask user to enter two integers
		 * Write a program to print the minimum one on the console.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two integers");

		int num1 = scan.nextInt(), num2 = scan.nextInt();

		if (num1 <= num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}

		int res = num1 >= num2 ? num2 : num1;

		System.out.println(res);

		scan.close();

	}

}
