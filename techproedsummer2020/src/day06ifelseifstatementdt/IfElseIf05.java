package day06ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf05 {

	public static void main(String[] args) {
		/*
		Type java code by using if-else if() statement,
		If age is less than 13 output will be “Should not work”,
		If age is greater than 65 output will be “Retired”,
		Otherwise; output will be “Should work”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("type your age");
		
		int age = scan.nextInt();
		
		if(age<0) {
			System.out.println("come on what kind of age is that");
		}else if(age<13) {
			System.out.println("should not work");
		}else if(age<=65) {
			System.out.println("should work");
		}else {
			System.out.println("retired");
		}
		
		scan.close();
	}

}
