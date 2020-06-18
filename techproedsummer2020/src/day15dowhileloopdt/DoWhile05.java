package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name If the initial is lower case print a
		 * message like "Make the initial upper case" If the initial is upper case print
		 * a message like "You did it right"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name");
		
		String firstName = "";
		boolean isUppercase = false;
		
		do {
			firstName = scan.next();
			isUppercase = firstName.charAt(0) >= 'A' && firstName.charAt(0) <= 'Z';
			
			if (!isUppercase) {
				System.out.println("make the initial uppercase");
			}
		} while (!isUppercase);
		
		System.out.println("You did it right");

	}

}
