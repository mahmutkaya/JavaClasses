package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type two int..");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("the sum: " + (num1 + num2));
		
		System.out.println("the product: " + (num1*num2));
		
		scan.close();

	}

}
