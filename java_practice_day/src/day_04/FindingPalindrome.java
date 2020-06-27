package day_04;

import java.util.Scanner;

public class FindingPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a string");
		String str = scan.nextLine(), newStr = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			newStr+=str.charAt(i);
		}
		
		boolean isPalindrome = newStr==str;
		String res = !isPalindrome?"palindrome": "not palindrome";
		
		System.out.println(res);
		
		scan.close();

	}

}
