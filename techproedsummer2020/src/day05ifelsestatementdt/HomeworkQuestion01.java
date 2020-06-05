package day05ifelsestatementdt;

import java.util.Scanner;

public class HomeworkQuestion01 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a 4 digits integer, then print the sum of the first and the
		 * last digit of the number on the console. For example; if user enters 1234 you
		 * will add 1 and 4, then print on the console 5
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("give me a four digits number");

		int a = scan.nextInt();

		int lastDigit = a % 10;
		int firstDigit = a / 1000;

		System.out.println(lastDigit + firstDigit);

		scan.close();

	}

}
