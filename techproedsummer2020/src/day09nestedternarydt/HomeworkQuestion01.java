package day09nestedternarydt;

import java.util.Scanner;

public class HomeworkQuestion01 {
	public static void main(String[] args) {
		/*
		 * Write a Java program user will choose answer among A, B, C, or D.
		 * If the answer is true, output will be “True.” 
		 * If the answer is false, output will be “False”. 
		 * Correct answer is ‘C’ for the multiple option question.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("which one is true? A B C D");
		char answer = scan.next().toUpperCase().charAt(0);
		
		switch(answer) {
		case 'A':
			System.out.println("False");
			break;
		case 'B':
			System.out.println("False");
			break;
		case 'C':
			System.out.println("True");
			break;
		case 'D':
			System.out.println("False");
			break;
		default:
			System.out.println("option"+ answer +"not found");
			
		}
		scan.close();
	}

}
