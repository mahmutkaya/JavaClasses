package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type a number:");
		
		double length = scan.nextDouble();
		
		System.out.println("the area: " + (length*length));
		System.out.println("the perimeter: " + (4*length));
		
		scan.close();

	}

}
