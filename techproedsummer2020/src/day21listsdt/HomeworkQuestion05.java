package day21listsdt;

import java.util.Scanner;

public class HomeworkQuestion05 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter long two sentences. Then type a program to count all
		 * “words” in the sentences. For example; if user enters “Java is easy, if you
		 * study. Nothing is easy, if you do not study” output will be 14. Hint: Use
		 * split()
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a long sentences");
		String str = scan.nextLine();
		
		System.out.println(str.split(" ").length);
		
	}

}
