package com.github.db1995.algorithm.sort;

import com.github.db1995.algorithm.CommonUtils;

/**
 * Bubble sort
 *
 * @author db1995
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = CommonUtils.getRandomIntArray(10);
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
