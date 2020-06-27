package day_04;

public class StringManipulations3 {

	public static void main(String[] args) {
		// Create a string : name and assign a 3 word sentences
		// if name is one or two words print “enter 3 words sentences”
		// otherwise reverse the order of the words
		// e.g: I love java ==> java love I
		String name = "I love Java";// IloveJava 11-9 =2 spaces
		// check if there are 3 words. There must be 2 paces.
		int firstSpace = name.indexOf(" ");// 1 //This will give the first one

		int secondSpace = name.indexOf(" ", firstSpace + 1);

		String firstWord = name.substring(0, firstSpace);
		System.out.println(firstWord);
		
		String secondWord = name.substring(firstSpace + 1, secondSpace);
		System.out.println(secondWord);
		
		String lastWord = name.substring(secondSpace + 1);
		System.out.println(lastWord);
		
		if (firstSpace != -1 && secondSpace != -1) {// indexof returns-1 when there is no space
			System.out.println(lastWord + " " + secondWord + " " + firstWord);

		}

	}

}
