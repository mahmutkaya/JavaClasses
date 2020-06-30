package day21listsdt;

import java.util.ArrayList;
import java.util.List;

public class ListQuestion03 {

	public static void main(String[] args) {
		/*
		 * By using set() method, convert E to D. List elements should be like A, B, C,
		 * D, and F. Print it on the console
		 */
		List<Character> chrList = new ArrayList<>();

		for (char i = 'A'; i >= 'A' && i <= 'F'; i++) {
			if (i == 'D')
				continue;
			chrList.add(i);
		}
		chrList.set(3, 'D');
		System.out.println(chrList);

	}

}
