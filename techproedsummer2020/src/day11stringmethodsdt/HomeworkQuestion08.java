package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion08 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her first name, last name and Social Security Number.
		 * Then type a program which makes a) initials of the first name and the last
		 * name in uppercase, other characters will be in lowercase. b) all characters
		 * except last 4 characters of the Social Security Number “ * ”. For example;
		 * Suleyman Alptekin *****5678
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("enter your name");
		String name = scan.nextLine();

		System.out.println("enter your lastname");
		String lastname = scan.nextLine();

		System.out.println("enter your Social Security Number");
		String ssNum = scan.nextLine();

		int last4char = ssNum.length() - 4;

		String capitalizeName = name.substring(0, 1).toUpperCase() + name.substring(1),
				capitalizeLastname = lastname.substring(0, 1).toUpperCase() + lastname.substring(1),
				hideSsNum = ssNum.substring(0, last4char).replaceAll(".", "*") + ssNum.substring(last4char);

		System.out.println(capitalizeName + " " + capitalizeLastname + " " + hideSsNum);

		scan.close();
	}

}
