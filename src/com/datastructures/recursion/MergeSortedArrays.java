package com.datastructures.recursion;

/**
 * @author shreekanth Merge algorithm's time complexity is O(n + m).
 *         Additionally, it requires O(n + m) additional space to store
 *         resulting array.
 *
 */
public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = { 10, 20, 30, 35, 49 };
		int[] second = {50, 60, 70, 80  };
		int[] result = new int[first.length + second.length];

		display(merge(first, second, result));

	}

	public static void display(int[] result) {
		System.out.println("The sorted array is");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	/*
	 * The merge method used by the mergeSort algorithm implementation.
	 * 
	 * The merge logic is simple as follows 
	 * 1. Take an element from leftArray and an element from rightArray and compare both these elements. 
	 * 
	 * 2. Whichever element is less, put that element into the resultArray and advance the
	 * begin index of the array from which we picked the element. 
	 * 
	 * 3. Repeat the above step till atleast one of "*Begin" array index reaches the end i.e
	 * "*End" index. 
	 * 
	 * 4. Copy the rest of the elements of the other array whose index is not reached the end into the result array.
	 */
	public static int[] merge(int[] A, int[] B, int[] C) {
		int i, j, k;
		i = j = k = 0;
		while (i < A.length && j < B.length) {
			if (A[i] <= B[j]) {
				C[k] = A[i];
				i++;
			} else {
				C[k] = B[j];
				j++;
			}
			k++;
		}
		if (i < A.length) {
			for (int p = i; p < A.length; p++) {
				C[k] = A[p];
				k++;
			}
		} else {
			for (int p = j; p < B.length; p++) {
				C[k] = B[p];
				k++;
			}
		}
		return C;
	}

}
