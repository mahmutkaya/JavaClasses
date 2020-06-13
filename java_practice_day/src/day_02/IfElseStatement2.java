package day_02;

import java.util.Scanner;

public class IfElseStatement2 {

	public static void main(String[] args) {
		/*
		 *
		 * Print “Please enter your operation and 2 number” Get one operation symbol
		 * from user Print “Please enter 2 numbers” Get 2 double numbers form users
		 * Example if Addition, 7, 4 then print here is the sum of your operation 7 + 4
		 * = 11 Test data: Addition Subtraction Division Multiplication
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter operation");
		String operation = scan.nextLine().toLowerCase();
		
		System.out.println("Please enter 2 numbers");
		double num1 = scan.nextDouble(), num2 = scan.nextDouble();
		
		
//		char operationSign = operation.equals("addition") ? '+' 
//				: operation.equals("subtraction") ? '-' 
//				: operation.equals("division") ? '/'
//				: operation.equals("multiplication") ? '*'
//				: '&';
		String opSign;
		switch(operation) {
			case "addition":
				opSign = "+";
			break;
			case "subtraction":
				opSign = "-";
			break;
			case "division":
				opSign = "/";
			break;
			case "multiplication":
				opSign = "*";
			break;
			default:
				opSign = "404";
		};
		String response = "the "+ operation +" of your operation "+num1+opSign+num2+" = ";

		switch(operation) {
		case "addition":
			System.out.println(response+(num1+num2));
			break;
		case "subtraction":
			System.out.println(response+(num1-num2));
			break;
		case "division":
			System.out.println(response+(num1/num2));
			break;
		case "multiplication":
			System.out.println(response+(num1*num2));
			break;
		default:
			System.out.println(operation + "not found");
		}
		
		scan.close();

	}

}
