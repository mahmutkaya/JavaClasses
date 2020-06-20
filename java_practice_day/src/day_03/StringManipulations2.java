package day_03;

public class StringManipulations2 {

	public static void main(String[] args) {
		// create 2 string : name1 and name2
		// if the name1 has even numbers of characters,
		// then insert the second word in the middle of the first name
		// if the first word has odd numbers
		// Then print the “Name2 cannot be inserted in the name1”
		//
		//				e.g: 
		//				name1= mehmet
		//				name2= ahmet 
		//		    Print ==>  mehahmetmet
		String name1 = "12345678", name2 = "ahmet", inserted = "";
		boolean isTrue = name1.length()%2==0;
		
		if(isTrue) {
			inserted = name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2);
		}else {
			inserted = "Name2 cannot be inserted in the name1";
		}
		System.out.println(inserted);

	}

}
