package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkQuestion04 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print factorial of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a positive number");

		int num = scan.nextInt(), count = 1, fact = 1;

		while (count <= num) {
			fact *= count;
			System.out.print(count + " * ");
			count++;
		}
		System.out.println("! = " + fact);
		scan.close();

	}

}
