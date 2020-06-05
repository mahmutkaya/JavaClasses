package day03scannerincrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		//get string from user
		
		// instead of 'red underline' we shouls say
		// 'java/it is complaining' or
		// 'compile time error'
		Scanner scan = new Scanner(System.in);
		
		System.out.println("type your full name");
		// scan.next() will return the first word of string
		// with nextLine() all string will print
		String fullName = scan.nextLine();
		System.out.println(fullName);
		
		
		scan.close();

	}

}
