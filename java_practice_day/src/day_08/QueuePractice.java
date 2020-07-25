package day_08;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	/*
	 * 1. Create Queue of Integer with object type if LinkedList : link add the
	 * numbers: 45,54,26,63 print remove the fist element without using any
	 * index(poll) and print remove the next element and print print the next
	 * element without removing
	 *
	 * 
	 * 3. What is the major differences between linkedlist and PriorityQueue
	 */

	public static void main(String[] args) {

		Queue<Integer> ql = new LinkedList<>();

		ql.add(45);
		ql.add(54);
		ql.add(26);
		ql.add(63);
		System.out.println(ql);

		ql.poll();
		System.out.println(ql);
		System.out.println(ql.poll());
		System.out.println(ql);
		System.out.println(ql.peek());
		System.out.println(ql);

		/*
		 * 2. Create: Queue<Integer> pque = new PriorityQueue<>(); add teh same
		 * numbers and print use poll and peek finctions to manupilate the data
		 * 
		 */
		
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(45);
		pq.add(54);
		pq.add(26);
		pq.add(63);
		pq.add(6);
		System.out.println(pq);
		System.out.println(pq.poll()); //poll() will remove the smallest number every time we call it.
		System.out.println(pq);
	}

}
