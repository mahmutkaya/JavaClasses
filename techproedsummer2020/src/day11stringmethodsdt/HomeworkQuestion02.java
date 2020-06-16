package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his kid’s name, if the name contains “a” output will be
		 * “This name contains ‘a’.” if the name contains “z” output will be “This name
		 * contains ‘z’.” Otherwise, output will be “This name contains neither ‘a’ nor
		 * ‘z’.”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your kid's name");

		String name = scan.nextLine();
		String res = name.contains("a") ? "This name contains ‘a’." 
										: name.contains("z") 
										? "This name contains ‘z’."
										: "This name contains neither ‘a’ nor ‘z’.";
		System.out.println(res);
		
		scan.close();
	}

}
