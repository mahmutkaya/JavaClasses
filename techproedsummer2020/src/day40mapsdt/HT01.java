package day40mapsdt;

import java.util.Hashtable;
import java.util.Map;

public class HT01 {
	
	/*
	 * 1) Hashtable uses key-value structure.
	 * 2) Hashtable is synchronized.
	 * 3) Hashtable is thread-safe.
	 * 4) Hashtable is not ordered.
	 * 5) For Hashtables you can not use null for keys and values.
	 * 6) Hashtable is slow according to HashMap.
	 * 
	 */

	public static void main(String[] args) {
		
		Map<String, String> ht = new Hashtable<>();
		ht.put("cat", "meaw");
		ht.put("dog", "bark");
		ht.put("lion", "roar");
		ht.put("bee", "buzz");
		ht.put("cow", "moo");
		//if you use null for key or value of hashtable you will get NullPointerException
		//ht.put(null, "yell");
		//ht.put("chicken", null);
		
		System.out.println(ht);
		
		System.out.println(ht.keySet());//[Dog, Bee, Lion, Cat, Cow]
		
		Map<String, String> ht1 = new Hashtable<>();
		ht1.put("C", "M");
		ht1.put("D", "B");
		ht1.put("L", "R");
		
		//Copies all of the mappings from the specified map to this map 
		ht.putAll(ht1);
		System.out.println(ht);//{L=R, Dog=Bark, Bee=Buzz, Lion=Roar, Cat=Meow, D=B, C=M, Cow=Moo}


	}

}
