package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkQuestion03 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input a positive integer. It should then print the multiplication table of
		 * that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		int num = scan.nextInt(), count = 1;

		while (count <= 9) {
			String table = num +"*"+ count+" = "+(num * count);
			System.out.println(table);
			count++;
		}
		scan.close();

	}

}
