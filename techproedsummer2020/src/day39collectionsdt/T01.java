package day39collectionsdt;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class T01 {
	/*
	 * 1) treeSet is a set, so no duplication.
	 * 2) treeSet puts the elements in natural order.
	 * 3) treeSet is the slowest set.
	 * 
	 */

	public static void main(String[] args) {

		LocalTime lt1 = LocalTime.now();
		
		System.out.println("============== TreeSet ==============");
		System.out.println(lt1);
		Set<String> tSet = new TreeSet<>();
		tSet.add("Ali");
		tSet.add("Mark");
		tSet.add("Brandon");
		tSet.add("Angie");
		
		LocalTime lt2 = LocalTime.now();
		System.out.println(tSet + "\n" +lt2); //[Ali, Angie, Brandon, Mark]
		
		System.out.println("============== HashSet ==============" );
		Set<String> hSet = new HashSet<>();
		hSet.add("Ali");
		hSet.add("Mark");
		hSet.add("Brandon");
		hSet.add("Angie");
		
		LocalTime lt3 = LocalTime.now();
		System.out.println(hSet+ "\n" +lt3);
		
		System.out.println("============== A better way to create TreeSet: HashSet to treeSet ==============" );
		/*
		 * When you need to use TreeSet you have two options:
		 * 1) directly create a TreeSet and add the elements to it.
		 * 2) create a HashSet, add the elements to HashSet then convert it to TreeSet
		 */
		
		Set<String> tSet2 = new TreeSet<>(hSet);
		
		System.out.println(tSet2);
		LocalTime lt4 = LocalTime.now();
		System.out.println(lt4);
	}

}
