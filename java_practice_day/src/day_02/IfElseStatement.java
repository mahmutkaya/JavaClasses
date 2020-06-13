package day_02;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		/*
		 * Create a class : “IfElseStatement” Print “Please enter your job title” create
		 * a String variable named “jobTitle” and get the data from the user Use the
		 * below test data to print the correct jobTitle. Example : if jobTitle is qa
		 * then print “Your job title is Qualty Analyst” test data: qa then print
		 * Quality Analyst dev then print Developer ba then print Business Analyst pm
		 * then print Project Manager
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your job title");
		String jobTitle = scan.nextLine();
		
		String qa = "Qualty Analyst",
				dev = "Developer",
				ba = "Business Analyst",
				pm = "Project Manager";

		String str = jobTitle.equals("qa") ? qa
				: jobTitle.equals("dev") ? dev
				: jobTitle.equals("ba") ? ba 
				: jobTitle.equals("pm") ? pm 
				: jobTitle;
		
		System.out.println("Your job title is " + str);
		
		scan.close();

	}

}
