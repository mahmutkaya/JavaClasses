package day_08;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedListVector {

	public static void main(String[] args) {
		System.out.println("------------ArrayList------------");
		/*
		 * * 1. Create a class: LinkedListVectors. Create an arraylist of string:
		 * arrayList and add the names: john, sam, tom, matt Remove the second value in
		 * the list Change the first value-john- with juan
		 */
		List<String> arrayList = new ArrayList<>();
		arrayList.add("john");
		arrayList.add("sam");
		arrayList.add("tom");
		arrayList.add("matt");
		System.out.println(arrayList);

		// remove 2nd value
		arrayList.remove(1);
		System.out.println(arrayList);

		// change the first value - john - with juan
		arrayList.set(0, "juan");
		System.out.println(arrayList);

		System.out.println("------------LinkedList------------");
		/*
		 * 2. Create a linkedlist of string:linkedList add the names: zoe, marry, sue,
		 * elon remove the names is there if the name contains 'n' in it
		 */
		List<String> linkedList = new LinkedList<>();
		linkedList.add("zoe");
		linkedList.add("marry");
		linkedList.add("sue");
		linkedList.add("elon");
		System.out.println(linkedList);
		for(String w : linkedList) {
			if(w.contains("n")) {
				linkedList.remove(w);
			}
		}
		//********* linkedList.removeIf(n -> (n.contains("n")==true)); *********
		System.out.println(linkedList);
		
		System.out.println("------------Vector------------");
		/*
		 * 3. Create a Vector of list :vec 
		 * And add the strings: apple, orange, banana, lettuce 
		 * and remove banana from the vector
		 * 
		 * -> vectors and arrayList are almost the same
		 * -> the only difference is arrayLists are not synchronized.
		 */
		List<String> vec = new Vector<>();
		vec.add("apple");
		vec.add("orange");
		vec.add("banana");
		vec.add("lettuce");
		System.out.println(vec);
		vec.remove("banana");
		System.out.println(vec);
		

	}

}
