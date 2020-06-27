package day_04;

import java.util.Scanner;

public class RepeatedChars {

	public static void main(String[] args) {
		/*
		 * ask user to enter a name and a character, then check how many times the
		 * character is repeated in the name using loops in the name e.g: char ch1= 'a';
		 * String name =“John came late" => number of a = 2
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a name");
		String name = scan.nextLine();

		System.out.println("enter a character");
		char ch = scan.next().charAt(0);

		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				count++;
			}
		}
		System.out.println(name+" has "+count+" "+ch);
		
		scan.close();

	}

}
