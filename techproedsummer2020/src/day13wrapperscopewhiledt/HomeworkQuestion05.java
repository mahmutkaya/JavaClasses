package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkQuestion05 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program to count the factors of
		 * an integer which is entered by user.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		int num = scan.nextInt(), factor = 1, count = 0;
		
		System.out.print("the factors of " + num + ": ");
		while (factor <= num) {
			if (num % factor == 0) {
				System.out.print(factor + " ");
				count++;
			}
			factor++;

		}
		System.out.println("\n" + num + " has " + count + " factors");

		scan.close();

	}

}
