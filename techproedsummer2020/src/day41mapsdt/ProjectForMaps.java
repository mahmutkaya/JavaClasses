package day41mapsdt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class ProjectForMaps {
	/*
	 * 1)Create a text file inside the day30mapsnt package 
	 * 2)Type the following text inside the text file Java is easy to learn. 
	 * Learn Java, earn money. 
	 * Java is easy if you study well. 
	 * To learn Java, type codes. 
	 * 3)Type code to print every word is used how many times in the text.
	 */

	public static void main(String[] args) throws IOException {
		
		Map<String, Integer> wordCounter = new Hashtable<>();
		
		String path = "src/day41mapsdt/text";
		
		List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		
		for(String w: lines) {
			String words[] = w.split(" ");
			
			for(String m : words) {
				
				if(m.endsWith(",") || m.endsWith(".")) {
					m = m.substring(0, m.length()-1);
				}
				if(!wordCounter.containsKey(m)) {
					wordCounter.put(m, 1);
				}else {
					wordCounter.put(m, wordCounter.get(m)+1);
				}
			}
		}
		System.out.println(wordCounter);
		
//		FileInputStream file = new FileInputStream(path);
//		int i = 0;
//		String words = "";
//		while ((i = file.read()) != -1) {
//			words += (char) i;
//		}
//		System.out.println(words);
//		System.out.println(words.replaceAll("[.|,]", ""));
//		String ar[] = words.split(" ");
//		System.out.println(Arrays.toString(ar));
//		file.close();
		

	}

}
