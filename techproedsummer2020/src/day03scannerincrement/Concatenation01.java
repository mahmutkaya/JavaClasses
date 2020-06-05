package day03scannerincrement;

public class Concatenation01 {

	public static void main(String[] args) {
		//concatenation: to join strings
		String str1 = "Learn";
		String str2 = "Java";
		
		System.out.println(str1 +" "+ str2);
		
		System.out.println(str1 + 2 + 3); // Learn23
		System.out.println(str1 + (2+3)); // Learn5
		System.out.println(2+3+str1); //5Learn
		
		//by using str1, str2, 2, 3 print 6LearnJava-1
		System.out.println(2*3 + str1 + str2 + (2-3));


	}

}
