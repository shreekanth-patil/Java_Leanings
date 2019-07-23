package com.datastructures.queues;

public class ArrayQueueDemo {
	private static final int MAX_SIZE = 10;
	int arr[] = new int[MAX_SIZE];
	int size = 0;
	int front = -1;
	int rear = 0;

	public void insert(int pushedElement) {
		if (front < MAX_SIZE - 1) {
			front++;
			arr[front] = pushedElement;
			System.out.println("Element " + pushedElement
					+ " is inserted to Queue !");
			display();
		} else {
			System.out.println("Overflow !");
		}

	}

	public void remove() {
		if (front >= rear) { // means it has some elements
			rear++;
			System.out.println("remove operation done !");
			display();
		} else {
			System.out.println("Underflow !");
		}
	}

	public void display() {
		if (front >= rear) {
			System.out.println("Elements in Queue : ");
			for (int i = rear; i <= front; i++) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		ArrayQueueDemo queueDemo = new ArrayQueueDemo();
		queueDemo.remove();
		queueDemo.insert(23);
		queueDemo.insert(2);
		queueDemo.insert(73);
		queueDemo.insert(21);
		queueDemo.remove();
		queueDemo.remove();
		queueDemo.remove();
		queueDemo.remove();
	}

}