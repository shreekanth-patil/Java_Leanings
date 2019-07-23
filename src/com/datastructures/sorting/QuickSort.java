package com.datastructures.sorting;

import java.util.Arrays;


/**
 * @author shreekanth 
 * 
 * The divide-and-conquer strategy is used in quicksort.
 *         Below the recursion step is described:
 *         
 *         1. Choose a pivot value. We take
 *         the value of the middle element as pivot value, but it can be any
 *         value, which is in range of sorted values, even if it doesn't present
 *         in the array. 
 *         
 *         2. Partition. Rearrange elements in such a way, that all
 *         elements which are lesser than the pivot go to the left part of the
 *         array and all elements greater than the pivot, go to the right part
 *         of the array. Values equal to the pivot can stay in any part of the
 *         array. Notice, that array may be divided in non-equal parts. Sort
 *         both parts. Apply quicksort algorithm recursively to the left and the
 *         right parts.
 */
public class QuickSort {

	public static void main(String args[]) {
		int[] input = { 23, 31, 1, 21, 36, 72 };
		
		System.out.println("Before sorting : " + Arrays.toString(input));
		quickSort(input, 0, input.length - 1); // sort the integer array using quick sort algorithm

		System.out.println("After sorting : " + Arrays.toString(input));

	}

	public static void quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	/** * Divides array from pivot, left side contains elements less than * Pivot while right side contains elements greater than pivot. 
	 * * * @param array array to partitioned * @param left lower bound of the array * 
	 * @param right upper bound of the array * @return the partition index */ 
	
	public static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		;

		return i;
	}

}
