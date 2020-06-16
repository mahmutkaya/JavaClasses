package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a word which has 4 letters and output will be inverse of
		 * the word. For example; if user enters “MARK” output will be “KRAM”
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("enter a word has four letters");
		String word = scan.nextLine();

		String reverseWord = new StringBuilder(word).reverse().toString();
		System.out.println(word + " is reversed by using StringBuilder " + reverseWord);
		
		//2nd way by for-loop
		String reverse = "";
		for (int i = word.length()-1; i>=0 ; i--) {
			reverse += word.charAt(i);
		};
		
		System.out.println(word + " is reversed by using for-loop: "+reverse);

		scan.close();
	}

}
