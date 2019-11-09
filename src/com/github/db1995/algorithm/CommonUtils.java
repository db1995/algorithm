package com.github.db1995.algorithm;

import java.util.Random;

/**
 * Common utilities for algorithm demo
 *
 * @author db1995
 */
public final class CommonUtils {
    private CommonUtils() {
    }

    public static int[] getRandomIntArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        if (size < Integer.MAX_VALUE / 10) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(array.length * 10);
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(Integer.MAX_VALUE);
            }
        }
        return array;
    }
}
