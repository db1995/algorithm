package com.github.db1995.algorithm.sort;

import com.github.db1995.algorithm.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Shell sort
 *
 * @author db1995
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] increments = {1, 5, 19, 41, 109, 209, 505, 929, 2161, 3905, 8929, 16001, 36289,
                64769, 146305, 260609, 587521, 1045505, 2354689, 4188161, 9427969, 16764929,
                37730305, 67084289, 150958081, 268386305, 603906049, 1073643521};
        int[] array = CommonUtils.getRandomIntArray(1000000);
        int index = 0;
        for (int i = 0; i < increments.length; i++) {
            if (array.length <= increments[i] * 2 + 1) {
                if (i - 1 >= 0) {
                    index = i - 1;
                } else {
                    index = i;
                }
                break;
            }
        }
        for (int gap = increments[index]; ; ) {
            for (int i = gap; i < array.length; i++) {
                int tmp = array[i];
                int j;
                for (j = i; j >= gap && tmp < array[j - gap]; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = tmp;
            }
            if (index > 0) {
                gap = increments[--index];
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Increments can be generated, or directly initial in the int[].
     * Generate Sedgewick Increments within Integer.MAX_VALUE.
     * 1
     * 5
     * 19
     * 41
     * 109
     * 209
     * 505
     * 929
     * 2161
     * 3905
     * 8929
     * 16001
     * 36289
     * 64769
     * 146305
     * 260609
     * 587521
     * 1045505
     * 2354689
     * 4188161
     * 9427969
     * 16764929
     * 37730305
     * 67084289
     * 150958081
     * 268386305
     * 603906049
     * 1073643521
     */
    private static Integer[] generateSedgewickIncrements() {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 16; i++) {
            int i1 = (int) (9 * Math.pow(4, i) - 9 * Math.pow(2, i) + 1);
            int i2 = (int) (Math.pow(4, i) - 3 * Math.pow(2, i) + 1);
            if (i1 > 0) {
                list.add(i1);
            }
            if (i2 > 0) {
                list.add(i2);
            }
        }
        Collections.sort(list);
        return (Integer[]) list.toArray();
    }
}
