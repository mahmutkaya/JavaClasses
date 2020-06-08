package day07nestedifternarydt;

import java.util.Scanner;

public class NestedIf03 {

	public static void main(String[] args) {
		/*
		 * Type java code by using nested if() statement.
		ask user to enter a password
		If the initial of the password is uppercase then check if it is ‘A’ or not. 
			If it is ‘A’ the output will be
		“Valid Password” otherwise the output will be “Invalid Password”
		If the initial of the password is lowercase then check if it is ‘z’ or not. 
			If it is ‘z’ the output will be
		“Valid Password” otherwise the output will be “Invalid Password”
		 */
		// upper cases are between 65 - 90
		// lower cases are between 97 - 122
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter your password");
		String password = scan.nextLine();
		
		char initial = password.charAt(0);
		
		if(initial>='A' && initial<='Z') {
			if(initial=='A') {
				System.out.println("Valid Password");
			}else {
				System.out.println("Invalid Password");
			}
		}else if(initial>='a' && initial<='z') {
			if(initial=='z') {
				System.out.println("Valid Password");
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("make the initial a letter");
		}

	}

}
