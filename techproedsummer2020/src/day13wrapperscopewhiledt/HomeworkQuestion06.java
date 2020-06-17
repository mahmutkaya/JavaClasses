package day13wrapperscopewhiledt;

import java.util.Scanner;

public class HomeworkQuestion06 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop, Write a program that prompts the user to
		 * input an integer. It should then find sum of the digits of that number.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		String num = scan.next();
		int i = 0, sum = 0;
		while (i < num.length()) {
			sum += Character.getNumericValue(num.charAt(i));
			i++;
		}
		System.out.println(sum);

		// 2nd way:
		int num2 = scan.nextInt(), sum2 = 0;
		while (num2 != 0) {
			int lastDigit = num2 % 10; // to get the last digit of a number: number%10
			num2 /= 10; // to remove the last digit of a number: number/10
			sum2 += lastDigit;
		}
		System.out.println("the sum of digits is " + sum2);

		scan.close();

	}

}
