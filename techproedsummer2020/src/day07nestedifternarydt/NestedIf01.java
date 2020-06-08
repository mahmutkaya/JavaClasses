package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 * ask user to enter gender and age. if the gender is 'male' and age is less
		 * than 20 print 'boy' otherwise print 'man' on the console. if the gender is
		 * 'female' and age is less than 20 print 'girl' otherwise print 'woman' on the
		 * console.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("please, type your gender");
		String gender = scan.next();

		System.out.println("please, enter your age");
		int age = scan.nextInt();

		if (gender.equalsIgnoreCase("MALE")) {
			if (age < 20) {
				System.out.println("boy");
			} else {
				System.out.println("man");
			}

		} else if (gender.equalsIgnoreCase("female")) {
			if (age < 20) {
				System.out.println("girl");
			} else {
				System.out.println("woman");
			}

		} else {
			System.out.println("undefined gender");
		}

		scan.close();

	}

}
