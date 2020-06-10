package day09nestedternarydt;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 * Type code which types “even” for even integers, and “odd” for odd integers on
		 * console. Use if else if and switch
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();

		String res = (num % 2 == 0) ? "even" : (num % 2 != 0) ? "odd" : "nothing";
		System.out.println(res);
		int nn = num % 2;
		switch (nn) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		default:
			System.out.println("odd");
		}

		/*
		 * 2 If the user pressed 1, 2, 3 the program will print the number that is
		 * pressed; otherwise, program will print "Not allowed".
		 */
		switch (num) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("not allowed");
		}
		scan.close();
	}

}
