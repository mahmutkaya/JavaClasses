package day04operatorsifstatementdt;

public class IfStatement02 {

	public static void main(String[] args) {
		/*
		 * Type java code by using if-else statement, if the password is “JavaLearner”,
		 * output will be “The password is true”. Otherwise, output will be “The
		 * password is false”.
		 */

		String password = "JavaLearne";
		// == is just for primitives
		// for strings we use equals() method
		if (password.equals("JavaLearner")) {
			System.out.println("the password is true");
		}
		if (!(password.equals("JavaLearner"))) {
			System.out.println("the password is false");
		}

	}

}
