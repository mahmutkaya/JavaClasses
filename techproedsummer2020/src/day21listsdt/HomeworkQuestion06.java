package day21listsdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeworkQuestion06 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to remove a specific element from an array.
		 */
		Integer arr[] = { 1, 2, 3, 4 };
		String str[] = {"aa", "bb", "cc"};

		System.out.println(removeElByListMethods(arr, 3));

		System.out.println(Arrays.toString(removeEl(str, "aa")));

	}

	public static <T> List<T> removeElByListMethods(T[] arr, T e) {
		List<T> newList = new ArrayList<T>() {
			{
				for (T i : arr)
					if(i!=e) add(i);
			}
		};
		return newList;
	}

	public static <T> T[] removeEl(T[] arr, T e) {
		T[] newArr = (T[]) new Object[arr.length - 1];
		int j =0;
		for (T i : arr) {
			if (i == e) {
				continue;
			}
			newArr[j] = i;
			j++;
		}
		return newArr;
	}

}
