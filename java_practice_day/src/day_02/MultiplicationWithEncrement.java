package day_02;

public class MultiplicationWithEncrement {

	public static void main(String[] args) {
//		Create a class : “MultiplicationWithIncrement”
//		Then assign two values : num1=1, num2=1
//		Then print the multiplication table using ‘increment’ 
//		Note: when you use ++ increment sign then it inreases by 1
//		Print The Following multiplication table:
//		========= 
//		1 X 1 = 1 
//		1 X 2 = 2 
//		1 X 3 =3 
//		1 X 4 = 4 
//		1 X 5 = 5 
//		1 X 6 = 6 
//		1 X 7 = 7 
//		1 X 8 = 8 
//		1 X 9 = 9 
//		1 X 10 = 10
//		=========
		int num1 = 1;
		int num2 = 1;

		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));// num2=1
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));// num2=2
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));// num2=3
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));
		System.out.println(num1 + " x " + num2 + " = " + (num1 * num2++));

//		System.out.println(num2);//num1=1
//		System.out.println(num2++);//1 . It will be two when we use next time
//		//num2++=>post increment:First Print, Then increase by 1
//		System.out.println(num2++);//2
//		System.out.println(num2++);//3
//		System.out.println(num2++);//4
//		
//		System.out.println(++num2);
//		//++num2 => Pre increment:First Increase by 1, then print

	}

}
