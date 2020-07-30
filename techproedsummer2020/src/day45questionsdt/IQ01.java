package day45questionsdt;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class IQ01 {

	public static void main(String[] args) {

		String ar[] = { "A", "B", "D", "C", "B", "A", "A", "B", "B", "C" };

		System.out.println("1st way: for loop and set");
		Set<String> set1 = new HashSet<>();
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i].equals(ar[j])) {
					set1.add(ar[i]);
				}
			}
		}
		System.out.println(set1);
		
		System.out.println("2nd way: forEach and two set");
		Set<String> set2 = new HashSet<>(), set3 = new HashSet<>();
		for(String w : ar) {
			if(set2.add(w)==false) {
				set3.add(w);
			}
		}
		System.out.println(set3);

		System.out.println("3rd way: forEach and map");
		Map<String, Integer> map = new HashMap<>();
		for(String w : ar) {
			int count = 1;
			if(!map.containsKey(w)) {
				map.put(w, count);
			} else {
				map.put(w, map.get(w)+1);
			}
		}
		System.out.println(map);
		
		System.out.println("4rd way: functional programming");
		List<String> list = Arrays.asList(ar);
		list.stream()
			.filter(t -> Collections.frequency(list, t)>1)
			.collect(Collectors.toSet())
			.forEach(t -> System.out.print(t+" "));
		int x = 0;
		System.out.println(x);
		System.out.println(++x);
		System.out.println(x);
	}

}
