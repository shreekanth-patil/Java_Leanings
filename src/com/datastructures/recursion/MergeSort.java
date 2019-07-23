package com.datastructures.recursion;

import java.util.Scanner;

class MergeSort {

	/*
	 * The mergeSort algorithm implementation
	 * 
	 * 1. Divide the unsorted array, of size N, into two halves.
	 * 
	 * 2. Sort each sub array, each of size N/2. Merge the two sorted sub arrays
	 * into the sorted, full array.
	 * 
	 * Note the base case is : If the array is of length 0 or 1, then it is
	 * already sorted.
	 */

	public static int a[] = new int[50];

	public void mergeSort(int low, int high) {
		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(low, mid, high);
		}
	}

	/*
	 * The merge method used by the mergeSort algorithm implementation.
	 * 
	 * The merge logic is simple as follows 1. Take an element from leftArray
	 * and an element from rightArray and compare both these elements.
	 * 
	 * 2. Whichever element is less, put that element into the resultArray and
	 * advance the begin index of the array from which we picked the element.
	 * 
	 * 3. Repeat the above step till atleast one of "*Begin" array index reaches
	 * the end i.e "*End" index.
	 * 
	 * 4. Copy the rest of the elements of the other array whose index is not
	 * reached the end into the result array.
	 */
	public void merge(int low, int mid, int high) {
		int h, i, j, k;
		int b[] = new int[50];
		h = low;
		i = low;
		j = mid + 1;

		while ((h <= mid) && (j <= high)) {
			if (a[h] <= a[j]) {
				b[i] = a[h];
				h++;
			} else {
				b[i] = a[j];
				j++;
			}
			i++;
		}
		if (h > mid) {
			for (k = j; k <= high; k++) {
				b[i] = a[k];
				i++;
			}
		} else {
			for (k = h; k <= mid; k++) {
				b[i] = a[k];
				i++;
			}
		}
		//copying b to a
		for (k = low; k <= high; k++)
			a[k] = b[k];
	}

	public static void main(String[] args) {
		int num, i;

		System.out.println("             MERGE SORT PROGRAM            ");

		System.out.println();
		System.out.println();
		System.out.println("Please Enter THE No. OF ELEMENTS you want to sort[THEN PRESS ENTER]:");
		num = new Scanner(System.in).nextInt();
		System.out.println();
		System.out.println("Now, Please Enter the (" + num+ ") nos. [THEN PRESS ENTER]:");
		for (i = 1; i <= num; i++) {
			a[i] = new Scanner(System.in).nextInt();
		}
		
		MergeSort m = new MergeSort();
		m.mergeSort(1, num);
		
		System.out.println();
		System.out.println("So, the sorted list (using MERGE SORT) will be :");
		System.out.println();
		System.out.println();

		for (i = 1; i <= num; i++)
			System.out.print(a[i] + "    ");

	}
} // end class MergeSort

