package com.github.db1995.algorithm.sort;

import com.github.db1995.algorithm.CommonUtils;

/**
 * Selection sort
 *
 * @author db1995
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = CommonUtils.getRandomIntArray(10000);
        sort2(array);
    }

    /**
     * Exchange many times, not good
     */
    private static void sort1(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    /**
     * Mark the index of min, exchange once
     */
    private static void sort2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }
}
