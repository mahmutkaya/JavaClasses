package day15dowhileloopdt;

import java.util.Scanner;

public class HomeworkQuestion05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number. If the number is divisible by 10 then print
		 * "Won!" on the console otherwise ask user to enter another number. Use
		 * do-while loop
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");

		int num = 0;
		do {
			num = scan.nextInt();
			if (num % 10 != 0) {
				System.out.println("try again");
			}

		} while (num % 10 != 0);
		System.out.println("won!!");

		scan.close();
	}

}
