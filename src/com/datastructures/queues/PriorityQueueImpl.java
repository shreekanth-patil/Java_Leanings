package com.datastructures.queues;

import java.io.IOException;

public class PriorityQueueImpl {

	public static void main(String[] args) throws IOException {
		PriorityQueue thePQ = new PriorityQueue(5);

		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		while (!thePQ.isEmpty()) {
			double item = thePQ.remove();
			System.out.print(item + " "); // 10, 20, 30, 40, 50
		} // end while
		System.out.println("");
	} // end main()
}
