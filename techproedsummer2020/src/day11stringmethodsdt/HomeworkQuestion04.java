package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion04 {

	public static void main(String[] args) {
		/*
		 * Ask user ta enter his/her first and last name. If the first name is longer
		 * output will be “First name is longer.” If the length of last name is equal To
		 * the length of last name output will be “First name and last name have same
		 * length.” Otherwise, output will be “Last name is longer”
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your firstname");
		String firstname = scan.nextLine();
		
		System.out.println("enter your lastname");
		String lastname = scan.nextLine();
		
		String res = firstname.length() > lastname.length() 
						? "First name is longer."
						: firstname.length() < lastname.length()
						? "Last name is longer."
						: "First name and last name have same length";
		System.out.println(res);
		
		scan.close();

	}

}
