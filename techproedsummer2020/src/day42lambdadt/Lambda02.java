package day42lambdadt;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Ali");
		list.add("Mark");
		list.add("Jackson");
		list.add("Amanda");
		list.add("Chris");
		list.add("Tucker");

		// print the number of characters of every element on the console by using
		// "Functional Programming"
		list.stream()
			.map(t -> t.length())
			.forEach(t -> System.out.print(t + " "));
		
		list.stream()
			.filter(t-> t.length()>=5)
			.map(t->t+" = "+t.length())
			.forEach(t->System.out.println(t));
		
		int sum = list.stream()
				.map(t-> t.length())
				.reduce(0, (t, u) -> t+u);
		System.out.println(sum);
		
		int i = list.stream()
			.map(t->t+"!")
			.filter(t->t.contains("k"))
			.map(t->t.length())
			.reduce(0, (t,u) -> t+u);
		System.out.println(i);
		
		int res = list.stream()
			.filter(t-> t.startsWith("A"))
			.map(t->t.length())
			.reduce(1,(t,u)-> t*u);
		System.out.println(res);
		
		String str = list.stream()
			.reduce("",(t,u)-> t+u);
		System.out.println(str);
		
		list.stream()
			.sorted()
			.forEach(t->System.out.print(t+" "));
		
		list.stream()
			.filter(t->t.length()<6)
			.sorted()
			.forEach(t->System.out.print(t+" "));
		
		int min = list.stream()
			.map(t->t.length())
			.reduce(Integer.MAX_VALUE, (t,u)-> Math.min(t,u));
		System.out.println(min);
		
		int max = list.stream()
				.map(t->t.length())
				.reduce(0, (t,u)-> Math.max(t,u));
		System.out.println(max);

	}

}
