package day09nestedternarydt;

import java.util.Scanner;

public class HomeworkQuestion03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter one of the ‘U’, ’S’, and ‘A’.
		 * Then type a program by using “switch statement” 
		 * to print “United” for ‘U’ ”States” for ’S’, and “America” for ‘A’
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter one of usa letter");
		char answer = scan.next().toUpperCase().charAt(0);
		
		switch(answer) {
		case 'U':
			System.out.println("United");
			break;
		case 'S':
			System.out.println("States");
			break;
		case 'A':
			System.out.println("America");
			break;
		default:
			System.out.println("welcome to Unated States of America");
			
		}
		scan.close();

	}

}
