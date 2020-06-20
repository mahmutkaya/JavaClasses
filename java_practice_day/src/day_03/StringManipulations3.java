package day_03;

public class StringManipulations3 {

	public static void main(String[] args) {
		// Create a string : name and assign a 3 word sentences
		// if name is one or two words print “enter 3 words sentences”
		// otherwise reverse the order of the words
		// e.g: I love java ==> java love I
		String name = "I love Java";
		// check if there are 3 words. There must be 2 paces.
		int firstSpace = name.indexOf(" ");// 1 //This will give the first one
		System.out.println(firstSpace);

		int secondSpace = name.indexOf(" ", firstSpace + 1);
		// this will look for " ", after the first space(second space)
		System.out.println(secondSpace);

		if (firstSpace != -1 && secondSpace != -1) {// indexof returns-1 when there is no space

		}

	}

}
