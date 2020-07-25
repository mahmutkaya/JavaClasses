package day38collectionsdt;

import java.util.Collections;
import java.util.LinkedList;

public class LL01 {

	public static void main(String[] args) {

		// adFirst() adds the element at the beginning of the linked list.
		LinkedList<String> sll = new LinkedList<>();
		sll.add("A"); // [A]
		sll.addFirst("B"); // [B, A]
		sll.addLast("C"); // [B, A, C]

		System.out.println(sll);

		// getFirst() gets the first element from the list.
		System.out.println(sll.getFirst()); // B
		System.out.println(sll.getLast()); // C

		// Collections.sort() puts the elements in natural order.
		Collections.sort(sll);
		System.out.println(sll); // [A, B, C]
		
		System.out.println(sll.element());

	}

}
