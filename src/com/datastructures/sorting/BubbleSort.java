package com.datastructures.sorting;

/*
 Java Bubble Sort Example
 This Java bubble sort example shows how to sort an array of int using bubble
 sort algorithm. Bubble sort is the simplest sorting algorithm.

 http://www.ritambhara.in/optimized-bubble-sort-algorithm/


 */

public class BubbleSort {

	public static void main(String[] args) {

		// create an int array we want to sort using bubble sort algorithm
		int intArray[] = new int[] { 5, 90, 35, 45, 150, 3 };

		// print array before sorting using bubble sort algorithm
		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		// sort an array using bubble sort algorithm
		bubbleSort(intArray);
		System.out
				.println("==============Optimized bubblesort method ==================");
		bubbleSortOptimized(intArray);

		System.out.println("");

		// print array after sorting using bubble sort algorithm
		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

	private static void bubbleSort(int[] intArray) {

		/*
		 * In bubble sort, we basically traverse the array from first to
		 * array_length - 1 position and compare the element with the next one.
		 * Element is swapped with the next element if the next element is
		 * greater.
		 * 
		 * Bubble sort steps are as follows.
		 * 
		 * 1. Compare array[0] & array[1] 2. If array[0] > array [1] swap it. 3.
		 * Compare array[1] & array[2] 4. If array[1] > array[2] swap it. ... 5.
		 * Compare array[n-1] & array[n] 6. if [n-1] > array[n] then swap it.
		 * 
		 * After this step we will have largest element at the last index.
		 * 
		 * Repeat the same steps for array[1] to array[n-1]
		 */

		int n = intArray.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (intArray[j - 1] > intArray[j]) {
					// swap the elements!
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
				}

			}
		}

	}

	/**
	 * @param array
	 *            In the above example, the array got sorted after 2nd pass, but
	 *            we will still continue with the 3rd, 4th pass. Suppose if the
	 *            array is already sorted, then there will be no swapping
	 *            (because adjacent elements are always in order), but still we
	 *            will continue with the passes and there will still be (n-1)
	 *            passes. 
	 *            
	 *            If we can identify, that the array is sorted, then we
	 *            should stop execution of further passes. This is the
	 *            optimization over the original bubble sort algorithm.
	 */
	private static void bubbleSortOptimized(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			boolean is_sorted = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					is_sorted = true;
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
			// No Swapping happened, array is sorted
			if (!is_sorted) {
				return;
			}
		}

	}
}

/*
 * Output of the Bubble Sort Example would be
 * 
 * Array Before Bubble Sort 5 90 35 45 150 3 Array After Bubble Sort 3 5 35 45
 * 90 150
 */