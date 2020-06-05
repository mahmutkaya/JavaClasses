package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter two integer values. Write a Java Program to swap two
		 * numbers by using the third variable.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("type two numbers to swap");

		int a = scan.nextInt(), b = scan.nextInt(), c = 0;

		System.out.println("before swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		c = a;
		a = b;
		b = c;

		System.out.println("after swapping");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		scan.close();

	}

}
