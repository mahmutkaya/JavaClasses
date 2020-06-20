package day_03;

public class TernaryPriceCheck {

	public static void main(String[] args) {
		/*
		 * Write a code using ternary: Create int variable : price Create string
		 * variable : decision If the price <= $10 Print “cheap” If price is 10-$20
		 * print “ok” Otherwise “expensive”.
		 */
		int price = 20;
		String decision;

		if (price <= 10) {
			decision = "cheap";
		} else if (price <= 20) {
			decision = "ok";
		} else {
			decision = "expensive";
		}
		System.out.println("if statment: " + decision);

		decision = price <= 10 ? "cheap" : price <= 20 ? "ok" : "expensive";

		System.out.println("ternary operation: " + decision);

	}

}
