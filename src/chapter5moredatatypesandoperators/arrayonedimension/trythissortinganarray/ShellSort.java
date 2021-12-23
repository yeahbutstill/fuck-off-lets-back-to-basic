package chapter5moredatatypesandoperators.arrayonedimension.trythissortinganarray;

import java.util.Arrays;

public class ShellSort {
    /**
     * Shell sort - sort with diminishing increment (descending)
     *
     * @param array to be sorted
     * @return sorted array
     */
    public static int[] shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap > 0) {
            for (int i = 0; i < array.length - gap; i++) { //modified insertion sort
                int j = i + gap;
                int tmp = array[j];
                while (j >= gap && tmp > array[j - gap]) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = tmp;
            }
            if (gap == 2) { //change the gap size
                gap = 1;
            } else {
                gap /= 2.2;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] data = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 29
        };

        shellSort(data);
        System.out.println(Arrays.toString(data));
    }
}
