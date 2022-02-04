package chapter5moredatatypesandoperators.arrayonedimension.trythissortinganarray;

import java.util.Arrays;

public class ShakerSort {
  /**
   * Shaker sort (bidirectional bubble sort) Orders in descending order
   *
   * @param array array to be sorted
   */
  public static void shakerSortDesc(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      boolean swapped = false;
      for (int j = i; j < array.length - i - 1; j++) {
        if (array[j] < array[j + 1]) {
          int tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
          swapped = true;
        }
      }
      for (int j = array.length - 2 - i; j > i; j--) {
        if (array[j] > array[j - 1]) {
          int tmp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = tmp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
  }

  public static void shakerSortAsc(int[] array) {
    for (int i = 0; i < array.length / 2; i++) {
      boolean swapped = false;
      for (int j = i; j < array.length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int tmp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = tmp;
          swapped = true;
        }
      }
      for (int j = array.length - 2 - i; j > i; j--) {
        if (array[j] < array[j - 1]) {
          int tmp = array[j];
          array[j] = array[j - 1];
          array[j - 1] = tmp;
          swapped = true;
        }
      }
      if (!swapped) break;
    }
  }

  public static void main(String[] args) {
    int[] data = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 29};

    shakerSortDesc(data);
    System.out.println(Arrays.toString(data));

    shakerSortAsc(data);
    System.out.println(Arrays.toString(data));
  }
}
