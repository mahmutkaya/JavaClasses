package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators03 {

	public static void main(String[] args) {
		/* 
		 * Ask user to enter two integer values. Write a Java Program to swap
		 * two numbers without using the third variable.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type two numbers to swap");
		
		int a = scan.nextInt(), b = scan.nextInt();
		
		a += b;
		b = a-b;
		a -=b;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		scan.close();

	}

}
