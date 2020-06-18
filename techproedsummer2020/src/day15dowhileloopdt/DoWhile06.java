package day15dowhileloopdt;

import java.util.Scanner;

public class DoWhile06 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter his first name If the length of his first name is greater
		 * than 6 print "Long name" otherwise print "Normal name" and finish the loop
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name");
		
		String name = "";
		
		do {
			name = scan.next();
			if(name.length()>6) {
				System.out.println("long name, try again!");
			}
		}while(name.length()>6);
		
		System.out.println("normal name");
		
		scan.close();

	}

}
