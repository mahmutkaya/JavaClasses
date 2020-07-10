package day31exceptionsdt;

public class E02 {
	/*
	 * 1) if when you type code, you do not get any red underline, but after running
	 * you get red messages on the console, it means you are getting
	 * "Run Time Exceptions".
	 * 
	 * 2) ArithmeticException is an example of run time exceptions. if you do
	 * something wrong according to math rules, java throws ArithmeticException
	 * 
	 * 3) If java finds a problem, it stops execution(does not run the next lines)
	 * and throws exception.
	 * 
	 * 4) for compile time exceptions you have to handle exception but for run time
	 * exceptions no need to handle. java will throw exception even you did not
	 * handle, it is optional.
	 */

	public static void main(String[] args) throws ArithmeticException{
		int x = 12, y = 0;
		System.out.println(x / y);

	}

}
