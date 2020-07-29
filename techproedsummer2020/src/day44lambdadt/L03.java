package day44lambdadt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class L03 {
	/*
	 * How to work with files in lambda
	 */

	public static void main(String[] args) throws IOException {

		//how to read a file by using lambda
		Path p = Paths.get("src/day44lambdadt/textFile");
		Stream<String> file = Files.lines(p);
				
		System.out.println("============Convert all characters to upper case then read it============");
		Stream<String> lines2 = file.map(m -> m.toUpperCase());
		lines2.forEach(a->System.out.println(a));
		
		System.out.println("============check if the text contain the word \"Lambda\"============");
		boolean bo = Files.lines(p).anyMatch(t -> t.contains("Lambda"));
		System.out.println(bo);
		
		Stream<String> str1 = Files.lines(p)
				.map(t-> t.split(" "))
				.flatMap(Arrays::stream)
				.map(t -> t.replaceAll("[.,]", ""))
				.filter(t -> t.contains("e"));
		str1.forEach(System.out::println);

		System.out.println("============number of letters in the text============");
		int letters = Files.lines(p)
				.map(t -> t.replaceAll("[.,\s]", "").length())
				.reduce(0,(t,u) -> t+u);
		System.out.println(letters);
		
		System.out.println("============distinct words wich are ending with 'a'============");
		Stream<String> str2 = Files.lines(p)
				.map(t -> t.split(" "))
				.flatMap(Arrays::stream)
				.map(t -> t.replace("[^a-zA-Z]", ""))
				.filter(t -> t.endsWith("a"));
		str2.forEach(System.out::println);
		
		
		
		
		file.close();

	}

}
