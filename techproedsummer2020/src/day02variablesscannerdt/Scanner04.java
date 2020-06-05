package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 area and perimeter of a rectangle
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type the width and lengt");
		
		double width = scan.nextDouble();
		double length = scan.nextDouble();
		
		System.out.println("area: " + (width*length));
		System.out.println("Perimeter: " + (2*(width+length)));
		
		scan.close();

	}

}
