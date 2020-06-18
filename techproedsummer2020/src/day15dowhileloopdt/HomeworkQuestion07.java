package day15dowhileloopdt;

import java.util.Scanner;

public class HomeworkQuestion07 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a String Print the characters whose indexes are odd on the
		 * console For example; Germany ==> e m n
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string");

		String str = scan.next();
		char ch = ' ';
		int i = 0;

		do {
			ch = str.charAt(i);
			if (i % 2 != 0) {
				System.out.print(ch + " ");
			}
			i++;
		} while (i < str.length());

		scan.close();

	}

}
