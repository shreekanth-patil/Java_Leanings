package com.datastructures.sorting;

public class SelectionSort {

	/**
	 * @param array
	 *            Find the minimum value in the list Swap it with the value in
	 *            the first position Repeat the steps above for the remainder of
	 *            the list (starting at the second position and advancing each
	 *            time)
	 *            
	 *            complexity  Its O(n2) - Since there is a nested loop.
	 */
    public void sort(int array[]) {

        //Start from first
        for (int index = 0; index < array.length; index++) {

            //find the next smallest element
            int minIndex = findNextSmallestElement(index, array);

            // Swap code
            int temp = array[minIndex];
            array[minIndex] = array[index];
            array[index] = temp;
        }
    }

    /*
     * Finds the smallest element starting startIndex
     *
     * @ returns the index of the smallest element.
     */
    private int findNextSmallestElement(int startIndex, int array[]) {

        int minIndex = startIndex;

        int value = array[startIndex];

        for (int i = startIndex ; i < array.length; i++) {
            if (value > array[i]) {
                minIndex = i;
                value = array[minIndex];
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {

        int array[] = {7, 1, 8, 2, 0, 12, 10, 6, 5, 3};

        SelectionSort selectionSort = new SelectionSort();

        selectionSort.sort(array);

        dumpArray(array);
    }

    public static void dumpArray(int[] array) {

        for (int value : array) {
            System.out.println(value);
        }
    }
}
