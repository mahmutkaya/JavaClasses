package day_08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	/*
	 * Set doesn't allow duplicate elements.
	 */

	public static void main(String[] args) {
		System.out.println("------HashSet------");
		//hashSet doesn't make elements in natural order.
		Set<Integer> phoneNumbers = new HashSet<>();
		phoneNumbers.add(1111111);
		phoneNumbers.add(2222222);
		phoneNumbers.add(3333333);
		phoneNumbers.add(4444444);
		phoneNumbers.add(1111111); //when entering duplicate data, it overrides
		phoneNumbers.add(2222222);
		System.out.println(phoneNumbers);
		
		System.out.println("------TreeSet------");
		//treeSet makes elements in natural order.
		Set<Integer> ssn = new TreeSet<>();
		ssn.add(34536);
		ssn.add(76536);
		ssn.add(15636);
		ssn.add(15636);
		ssn.add(65660);
		System.out.println(ssn);
		

	}

}
