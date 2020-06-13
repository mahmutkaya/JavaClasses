package day_02;

public class ScannerPractice {
//	Create a class : “CharAtExample”
//	Create the “pickName” string and assign the alphabet.
//	String pickName =  “ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	index=number places 0123456789         
//	Then create 4 char variables ch1, ch2, ch3, ch4 
//	Assign the letters using charAt method
//	char ch1=pickName.charAt(9);//=>ch1=‘J’;
//	Then print J A V A. (there are spaces between letters) on the console using the chars variables
	public static void main(String[] args) {
		String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char ch1 = pickName.charAt(9);// J=74
		char ch2 = pickName.charAt(0);// A=65
		char ch3 = pickName.charAt(21);// V=86
		char ch4 = ch2;// A=65
		System.out.println(ch1 + " " + ch2 + " " + ch3 + " " + ch4);

		// Print JAVA without space using the same char variable
		System.out.println(ch1 + ch2 + ch3 + ch4);// 290 bacause java is adding the numberic ascii values
		// When you work with chars we need to be careful
		// We might get incorrect string result if we don't use "" or string at the
		// very beginning of the concatenation, then we can get incorrect result
		// Due to the ASCII CALCULATION
		// Not to confure, sinply use "" symbol at the beginning
		System.out.println("" + ch1 + ch2 + ch3 + ch4);// JAVA

		System.out.println(ch1 + "" + ch2 + ch3 + ch4);// JAVA
		System.out.println(ch1 + ch2 + ch3 + "" + ch4);// 74+65+86+""+A=225A
		String str2 = "225A";// =>String. It is alphanumeric
	}

}
