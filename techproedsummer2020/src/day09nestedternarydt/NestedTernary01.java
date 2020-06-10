package day09nestedternarydt;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/*
		 * Type java code by using nested ternary.
			Write a program to check if a year is leap year or not.
			If the year is divisible by 100 then it must be divisible by 400.
			If a year is not divisible by 100 then it must be divisible by 4.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter year");
		int year = scan.nextInt();

		String res = (year % 100 == 0 && year % 400 == 0) 
			? "Leap year" 
			: (year % 100 != 0 && year % 4 == 0) 
			? "Leap year" 
			: "Not leap year";
		//
		String res2 = (year%100==0) ? (year%400==0 ? "Leap" : "Not leap") : 
            (year%4==0 ? "Leap" : "Not leap");
		//
		System.out.println(res);

		scan.close();


	}

}
