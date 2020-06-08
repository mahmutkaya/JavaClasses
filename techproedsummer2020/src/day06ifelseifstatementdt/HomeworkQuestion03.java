package day06ifelseifstatementdt;

import java.util.Scanner;

public class HomeworkQuestion03 {
	public static void main(String[] args) {
		// 1. Ask user to enter a character, then check whether the character is
		// alphabet or not

		Scanner scan = new Scanner(System.in);

		System.out.println("type a character");

		char ch = scan.nextLine().charAt(0);

		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
			System.out.println(ch + " is an alphabet");
		} else {
			System.out.println(ch + " is not an alphabet");
		}

		scan.close();
	}

}
