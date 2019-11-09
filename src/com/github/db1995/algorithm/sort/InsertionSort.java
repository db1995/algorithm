package com.github.db1995.algorithm.sort;

import com.github.db1995.algorithm.CommonUtils;

/**
 * Insertion sort
 *
 * @author db1995
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = CommonUtils.getRandomIntArray(100000);
        ascendingSort(array);
    }

    /**
     * Sorts the specified array into ascending numerical order.
     */
    private static void ascendingSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            // Replace "tmp < array[j - 1]" by "tmp > array[j - 1]" can change to ascending numerical order.
            for (j = i; j > 0 && tmp < array[j - 1]; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
    }
}
