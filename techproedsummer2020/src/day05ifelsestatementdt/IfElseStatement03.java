package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// ask user to give the quantity of the products and the
		// unit price of the product
		// if the quantity is more than 1000, print "you got 10% discount" and print
		// the total price
		// otherwise, print "no discount" and the total price..
		Scanner scan = new Scanner(System.in);
		
		System.out.println("give the quantity of the products and its unit price");
		
		int quantity = scan.nextInt();
		float price = scan.nextFloat();
		float totalPrice = price*quantity;
		
		if(quantity > 1000) {
			System.out.println("you got 10% discount!!");
			System.out.println("the total price is: " + (totalPrice - totalPrice/10)); // **** 0.9*totalPrice will give 10% discount ****
		}else {
			System.out.println("no discount");
			System.out.println("the total price is: " + totalPrice);
		}
		
		scan.close();

	}

}
