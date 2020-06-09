package day08ternaryoperatordt;

import java.util.Scanner;

public class HomeworkQuestion01 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter a number. 
		 * If the number is less than 10 and greater than or equal to 0, 
		 * calculate its cube. Otherwise, calculate its square.
		 * Cube of a = a*a*a Square of a = a*a
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scan.nextInt();
		
		int square = num*num, cube = num*square;
		
		int cubeOrSquare = (num<10 && num >= 0) ? cube : square;
		System.out.println(cubeOrSquare);
		
		scan.close();
	}
}
