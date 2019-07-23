package com.datastructures.sorting;

import java.util.Arrays;

/** * Java program to implement insertion sort in Java. In this example, we will 
 * * sort an integer array using insertion sort algorithm. 
 * This logic can be used * to sort array of String, 
 * or any other object which implements Comparable or * Comparator interface in Java.
 *  * * @author Javin Paul */

public class InsertionSortDemo {

	public void sort(int array[]) {

        //Ignore the first element [0]
        //start from the element [1] -- Get that element and insert
        for (int index = 1; index < array.length; index++) {
            insert(array, index);
        }
    }

    /**
     * @param array
     * This method finds the min element in the array from given index
     * @param currentIndex
     */
    void insert(int array[], int currentIndex) {

        //value of the element to be inserted
        int value = array[currentIndex];

        //iterate in the loop for all elements below the currentIndex
        int reverseIndex = currentIndex;
        for (int i = currentIndex - 1; i >= 0; i--) {

            //If the array element is  greater than the value
            //move the array element to the next higher index
            if (array[i] >= value) {
                array[i + 1] = array[i];
                reverseIndex = i;
            } else {
                break;
            }
        }
        array[reverseIndex] = value;
    }


    public static void main(String[] args) {
        InsertionSortDemo insertionSort = new InsertionSortDemo();
        int array[] = {7, 1, 8, 2, 0, 12, 10, 7, 5, 3};

        insertionSort.sort(array);

        dumpArray(array);

    }

    public static void dumpArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
}
