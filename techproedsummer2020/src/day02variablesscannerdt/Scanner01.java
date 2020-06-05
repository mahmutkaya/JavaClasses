package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String []args) {
		// Scanner class is used to get data from user
		// to get data from user we have 3 steps
		
		//1st step
		Scanner scan = new Scanner(System.in);
		
		//2nd step
		System.out.println("please, give me an int");
		
		//3rd step
		int num = scan.nextInt();
		System.out.println(num);
		
		scan.close();

	}

}
