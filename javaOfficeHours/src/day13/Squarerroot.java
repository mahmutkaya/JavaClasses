package day13;

import java.util.Scanner;

public class Squarerroot {
	/*
	 * Ask to user enter a positive integer and calculate the squareroot with three
	 * decimal number 
	 * Eg : Input =2 Output=1,415 Input =9 Output=3,000
	 */

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a positive integer to find the squareroot");
        int num=scan.nextInt();
        
        double sr=1;
        for (double i = 1; i*i < num; i+=0.001) {
			sr=i;
		}
        System.out.printf("%.3f",sr);

	}

}
