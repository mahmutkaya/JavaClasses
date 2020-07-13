package day_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomNameGenerator {
	/*
	 * Create a class : RandomNameGenerator Step1: Ask user to enter his/her name
	 * //john walker Step2: Delete the spaces in the username//johnwalker Step3:
	 * Check if the username is already
	 * taken//list("sam","johnmary","johnwalker","johnwalker523463146") Step4: If
	 * there the username is not taken, then print: This username is available
	 * Step5: If the username is already taken, then print This username is already
	 * taken Step6: Then generate a random number, add to the name, and Print the
	 * new username
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");

		String userName = scan.nextLine().replaceAll("\\s", "");

		System.out.println(userName);

		List<String> names = new ArrayList<>();
		names.add("sam");
		names.add("johnmary");
		names.add("johnwalker");
		names.add("johnwalker523463146");
		
		for(String name : names) {
			if(userName.equals(name)) {
				System.out.println("this user name is already taken");
				break;
			}else {
				System.out.println("name is available");
				break;
			}
		}
		

	}

}
