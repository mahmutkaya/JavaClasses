package day41mapsdt;

import java.util.Map;
import java.util.TreeMap;

public class TM01 {
	
	/*
	 * 1) treeMap puts the elements in natural order according to the keys.
	 * 2) treeMap is not synchronized and not thread safe.
	 * 3) treeMap does not allow null keys but allows multiple null values.
	 * 4) treeMap is slow.
	 */

	public static void main(String[] args) {

		Map<Integer, String> tm = new TreeMap<>();
		tm.put(27, "Good");
		tm.put(15, "Bad");
		tm.put(50, "Ugly");
		tm.put(25, "The best");
		tm.put(30, "The worst");
		//tm.put(null, "Wooow"); //NullPointerException
		tm.put(11, null);
		tm.put(13, null);
		System.out.println(tm); //{11=null, 13=null, 15=Bad, 25=The best, 27=Good, 30=The worst, 50=Ugly}
		
		tm.computeIfAbsent(15, k->"Pretty"); //it will not change the value if it's exist.
		tm.computeIfAbsent(33, k->"Pretty"); //it will add new key and value if it doesn't exist.
		
		System.out.println(tm);
		
	}

}
