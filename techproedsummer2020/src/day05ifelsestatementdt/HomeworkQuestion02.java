package day05ifelsestatementdt;

import java.util.Scanner;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 Type java code by using if statement. When you enter the initial of the day of a week,
		output should be all possible names of the days.
		For example; if the initial is ’S’ output should be “Saturday or Sunday”
			sunday, monday, tuesday, wednesday, thursday, friday, saturday
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the initial of a day in uppercases");
		
		//to get char from user we have to use nextLine().charAt(0)
		char initialOfDay = scan.nextLine().charAt(0);
		
		if(initialOfDay == 'S') {
			System.out.println("Sunday or Saturday");
		}
		if(initialOfDay == 'M') {
			System.out.println("Monday");
		}
		if(initialOfDay == 'T') {
			System.out.println("Tuesday or Thursday");
		}
		if(initialOfDay == 'W') {
			System.out.println("Wednesday");
		}
		if(initialOfDay == 'F') {
			System.out.println("Friday");
		}
		
		scan.close();

	}

}
