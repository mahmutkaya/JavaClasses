package day44lambdadt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L01 {
	/*
	  Warm Up - 13 Minutes
					
			1)Create a package, name it as 'day44lambdadt'
			2)Create a class, name it as 'L01'
			3)Create a String list which has the elements "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson"
			4)Do not get the elements whose initial is "J"
			5)Select the distinct elements
			6)Put them in natural order according to the number of characters
			7)Convert all elements to upper cases
			8)Print the elements on the console
			9)Use 'Functional Programming'
	 */

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson");
		list.stream()
			.filter(p -> !p.startsWith("J"))
			.distinct()
			.sorted(Comparator.comparing(t -> t.length()))
			.map(t -> t.toUpperCase())
			.forEach(t-> System.out.print(t+" "));

	}

}
