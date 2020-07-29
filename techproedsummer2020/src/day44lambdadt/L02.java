package day44lambdadt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class L02 {

	public static void main(String[] args) {

		int a[] = {12,9,13,5,8};
		
		List<int[]> al = Arrays.asList(a);
		
		al.stream()
			.forEach(t -> System.out.print(Arrays.toString(t)+" "));
		
		System.out.println("\n================inStream================");
		//Instead of loops we can use IntStream
		IntStream.range(3,8) //first number inclusive, second is exclusive
			.forEach(t -> System.out.print(t +" "));
		
		int sum1 = IntStream.range(3, 8)
			.sum();
		System.out.println("\n"+sum1);
		
		int sum2 = IntStream.rangeClosed(3,8)
				.filter(p -> p%2==0)
				.sum();
		System.out.println(sum2);
		
		int prod1 = IntStream.rangeClosed(3, 8)
				.reduce(1, (t,p) -> t*p);
		System.out.println(prod1);
		
		//find 7 factorial
		int num = 7;
		int fact = IntStream.rangeClosed(1, num)
				.reduce(1, (o,p) -> o*p);
		System.out.println(num +"! = "+ fact);
		
		//find the multiplication of first seven even numbers
		//1st way: not recommended
		int prodEven1 = IntStream.rangeClosed(1, 14)
				.filter(p -> p%2==0)
				.reduce(1, (o,p) -> o*p);
		System.out.println(prodEven1);
		//2nd way: recommended
		int prodEven2 = IntStream.iterate(2, f->f+2)
				.limit(7)
				.reduce(1, (o,p) -> o*p);
		System.out.println(prodEven2);
		
		//find the multiplication of first 12 odd numbers
		int prodOdd1 = IntStream.iterate(1, f->f+2)
				.limit(9)
				.reduce(1, (o,p) -> o*p);
		System.out.println(prodOdd1);
		
		//find the multiplication of first 5 odd numbers which are greater than 6
		int prodOdd2 = IntStream.iterate(7, f->f+2)
				.limit(5)
				.reduce(1, (o,p) -> o*p);
		System.out.println(prodOdd2);
				

	}

}
