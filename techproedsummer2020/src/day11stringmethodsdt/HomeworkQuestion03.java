package day11stringmethodsdt;

import java.util.Scanner;

public class HomeworkQuestion03 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a letter, if it is uppercase check it is before “F” or not
		 * in alphabetical order. If it is before “F” in alphabetical order output will
		 * be “ Big before F”, otherwise output will be “Big after F.” If it is
		 * lowercase check it is before “h” or not in alphabetical order. If it is
		 * before “h” in alphabetical order output will be “Small before h”, otherwise
		 * “Small after h”
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a letter");

		char letter = scan.next().charAt(0);
		String res = "";
		if (letter >= 'A' && letter <= 'Z') {
			res = letter < 'F' ? "big before F" : "big after F";
		} else if (letter >= 'a' && letter <= 'z') {
			res = letter < 'h' ? "small before h" : "small after h";
		} else {
			res = "what you typed";
		}
		System.out.println(letter + " is " + res);

		scan.close();

	}

}
