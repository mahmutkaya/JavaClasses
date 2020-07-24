package day41mapsdt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ProjectForMaps02 {
	/*
	 * 1) Create a list for color code.
	 * 2) create a list for color names.
	 * 3) Match the color codes with color names.
	 * 4) Print the codes and colors like lightsalmon = rgb(255,160,122)
	 * 
	 * Note: work with 7 colors.
	 */

	public static void main(String[] args) {
		
		List<String> rgb = new ArrayList<>();
		rgb.add("rgb(255,160,122)");
		rgb.add("rgb(250,128,114)");
		rgb.add("rgb(233,150,122)");
		rgb.add("rgb(240,128,128)");
		rgb.add("rgb(205,92,92)");
		rgb.add("rgb(220,20,60)");
		rgb.add("rgb(178,34,34)");
		
		List<String> colors = new ArrayList<>();
		colors.add("lightsalmon");
		colors.add("salmon");
		colors.add("darksalmon");
		colors.add("lightcoral");
		colors.add("indianred");
		colors.add("crimson");
		colors.add("firebrick");
		
		Map<String, String> colorCodes = new TreeMap<>();
		for(int i=0; i<rgb.size(); i++) {
			colorCodes.put(colors.get(i), rgb.get(i));
		}
		System.out.println(colorCodes);

	}

}
