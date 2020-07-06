package day_05;

import java.util.Arrays;

public class WarmUp {

	public static void main(String[] args) {

//      Declare 3 chars: ch1=‘S’, ch2=‘A’, ch3= ‘M’
//      Declare a String: name;
//      Store these chars in that string and print: ‘SAM’ using the name variable
		char ch1 = 'S';
		char ch2 = 'A';
		char ch3 = 'M';
		String name = "";
		name += "" + ch1 + ch2 + ch3;
		System.out.println(name);//
//      Declare 3 Strings: name1=sam, name2=john, name3=tom Declare a String Array: array;
//      Store this strings in that array
//      And print: sam john tom
//      And then print [sam,john,tom]
//      Create the same array using different ways.
		String name1 = "sam";
		String name2 = "john";
		String name3 = "tom";
		String[] array = { name1, name2, name3 };
		// array[0],array[1],array[2]
		for (String each : array) {
			System.out.print(each + " ");
		}
		System.out.println();
		System.out.print(array[0] + " " + array[1] + " " + array[2]);
		System.out.println();
		System.out.println(Arrays.toString(array));

	}

}
