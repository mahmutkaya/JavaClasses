package day_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
	/*
	 * Cteate: List<String> capitals = new ArrayList<>(); 
	 * add : athens, ebrlin, paris, london, dc 
	 * then print
	 * 
	 * Create an Tterator object : Iterator<String> listIterator =
	 * capitals.iterator(); 
	 * and remove the capitol names that has a and i in it
	 */

	public static void main(String[] args) {

		List<String> capitals = new ArrayList<>();
		capitals.add("athens");
		capitals.add("berlin");
		capitals.add("paris");
		capitals.add("london");
		capitals.add("dc");
		
		Iterator<String> listIterator = capitals.iterator();
		
		while(listIterator.hasNext()) {
			String str = listIterator.next();
			if(str.contains("a")&&str.contains("i")) listIterator.remove();
		}
		
		System.out.println(capitals);

	}

}
