package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		//ask user to give a char
		//if the char is same with your initial of your first name 
		//print "you got it!"
		// otherwise print " try again!"
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give me a char in uppercase");
		char myInitial = 'M';
		char initial = scan.nextLine().charAt(0);
		
		if(initial == myInitial ) {
			System.out.println("you got it!");
		}else {
			System.out.println("try again");
		}
		
		scan.close();
	}

}
