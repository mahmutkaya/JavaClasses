package day_01;

public class Practice_01 {
	// Everyone should know how to type main method
	public static void main(String[] args) {
		// public static =>access modifies. access able form anywhere in the project.
		// Main method is always public static
		// main method name
		// void => return type. Void=no special return type. return type examples: int,
		// String, boolean,
		// args => argument
		// String[]= String of Array

		// What is main method?
		// Engine of a car. Without main method, we cannot run any code.
		// Do we have to have a main method to build and run an application?
		// Yes we need main to build and run an application

		// Hay many data type are there in JAVA?
		// 2. Primitive and Non primitive
		// How manu primitive data type are there?
		// 8: boolean, char, byte, short, int, long, float, double
		// NOTE: all primitives start with a small letter

		// Please declare all the primitive data types?
		// declare variable first
		boolean b; // b=true
		// assign a value after
		b = true;
		// can i turn the value of b = false
		b = false;

		boolean th = true;

		// In Java every character has a value. Even whitespace
		char c;
		c = ' ';

		byte by;
		short s;

		// int => Data Type , i => variable(container), 1 => value.
		// variables are important in JAVA.
		// Because, we create object/variable and use them
		// in our codes to make our code DYNAMIC
		// Dynamic code means we are usign variables or parameters in our code.

		// Also to use the same value again and again
		int i = -4;
		long l;
		float f;
		double d;

		// print int
		// We have to initialize the variables to print the values.
		System.out.println("The current value of the integer is => " + i);

		// Find the minimum and maximum value of a short. Use the same variable s
		s = Short.MIN_VALUE;
		System.out.println("The Smallest Value of a short => " + s);
		s = Short.MAX_VALUE;
		// s=32765;
		// We are printing dynamically
		System.out.println("The Biggest Value of a short => " + s);
		// Hard coded: you have to change the actual code to change the result
		System.out.println("The Biggest Value of a short => 32767");

	}

}
