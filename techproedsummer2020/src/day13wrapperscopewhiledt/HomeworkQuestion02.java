package day13wrapperscopewhiledt;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 * Type java code by using while loop. Write a program that types first 30
		 * consecutive odd integers.
		 */
		int num = 0;
		while (num <= 30) {
			if (num % 2 != 0)
				System.out.print(num + " ");
			num++;
		}

	}

}
