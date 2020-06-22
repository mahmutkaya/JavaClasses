package day17constructorsmethodcreationdt;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		/*
		 * Create a method outside of the main method Ask user to enter two numbers Ask
		 * user which operation he wants to do Print the result after doing the
		 * operation which user asked Call the method from inside the main method
		 */
		
		simpleCalculator();

	}
	public static void simpleCalculator() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		
		double num1 = scan.nextDouble(), num2 = scan.nextDouble();
		
		System.out.println("select an operation among +, -, *, /");
		
		char ch = scan.next().charAt(0);
		String res = "";
		switch(ch) {
		case '+':
			res = "the sum is "+(num1+num2);
			break;
		case '-':
			res = "the difference is "+(num1-num2);
			break;
		case '*':
			res = "the product is "+(num1*num2);
			break;
		case '/':
			res = "the division is "+(num1/num2);
			break;
			default:
				res = "select a valid operation";
		}
		System.out.println(res);
		
		scan.close();
	}
	

}
