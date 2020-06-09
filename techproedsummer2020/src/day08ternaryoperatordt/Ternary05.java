package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter an integer. If the number has 3 digits, output will be
		 * “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
		 * How can you decide the number of digits of an integer?
		 */
		//which methods did we learn about strings until now?
		// equals() ==> boolean,
		// equalsIgnoreCase() ==> boolean, 
		// charAt() ==> char, 
		// toLowerCase(), toUpperCase() ==> String, 
		// length() ==> integer
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an integer");
		String num = scan.next();
		
		String res = num.length()==3 ? "This number has 3 digits." : "This number has no 3 digits.";
		System.out.println(res);
		
		scan.close();

	}

}
