package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		// ask user to get an integer,
		//if the integer less than 10, print "you won"
		// otherwise, print "you lost".
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give me a number");
		
		int num = scan.nextInt();
		//1st way: solve the question by using if-else statement
		if(num<10) {
			System.out.println("you won");
		}else {
			System.out.println("you lost");
		}
		System.out.println("the game finished");
		//2nd way: solve the question just by using if statement
		if(num<10) {
			System.out.println("you won");
		}
		if(num>=10) {
			System.out.println("you lost");
		}
		
		scan.close();

	}

}
