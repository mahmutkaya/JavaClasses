package day22foreachloopdt;

public class ForEachLoop01 {

	public static void main(String[] args) {
		/*
		 * foreach loops works with collections (Arrays, lists)
		 * 
		 */
		int arr[] = { 1, 2, 3, 4, 5 };
		for (int w : arr) {
			System.out.println(w + " ");
		}
		// find sum of all elements of array
		int sum = 0;
		for (int w : arr) {
			sum += w;
		}
		System.out.println(sum);
		//print even numbers..
		for (int w : arr) {
			if(w%2==0) System.out.print(w+" ");
		}
		//print even numbers by continue..
		for (int w : arr) {
			if(w%2!=0) continue;
			System.out.print(w+" ");
		}
		//find the multiplication of odd numbers...
		int product=1;
		for(int w : arr) {
			if(w%2==0) continue;
			product*=w;
		}
		System.out.println(product);
		int sum2 =0;
		for(int w: arr) {
			if(w==3) continue;
			sum2+=w;
		}
		System.out.println(sum2);

	}

}
