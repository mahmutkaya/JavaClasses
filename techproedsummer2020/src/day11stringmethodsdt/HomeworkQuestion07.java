package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion07 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter password, if the password is okay for the following
		 * conditions output will be “Your password is created successfully.” If the
		 * password is not okay for any of the following conditions Output will be
		 * “Enter a new password according to the give conditions” 1.First letter must
		 * be uppercase 2.Last letter must be lowercase 3.Password must contain 6
		 * characters
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("enter a password");
		String password = scan.nextLine();

		int length = password.length();
		char firstLetter = password.charAt(0), lastLetter = password.charAt(length - 1);

		String res = "";
		if (firstLetter >= 'A' && firstLetter <= 'Z' && lastLetter >= 'a' && lastLetter <= 'z' && length == 6) {
			res = "Your password is created successfully.";
		} else {
			System.out.println("Enter a new password according to the give conditions: ");
			if (firstLetter >= 'a' && firstLetter <= 'z')
				res += "First letter must be uppercase\n";
			if (lastLetter >= 'A' && lastLetter <= 'Z')
				res += "Last letter must be lowercase\n";
			if (length != 6)
				res += "Password must contain 6 characters";
		}
		System.out.println(res);

		scan.close();
	}

}
