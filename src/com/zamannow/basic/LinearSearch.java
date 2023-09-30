package com.zamannow.basic;

public class LinearSearch {
  public static void main(String[] args) {
    LinearSearch linearSearch = new LinearSearch();
    int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    System.out.println(linearSearch.cari(data, data.length, 11));
  }

  int cari(int[] arr, int n, int el) {
    for (int i = 0; i < n; i++) {
      if (arr[i] == el) {
        return i;
      }
    }
    return -1;
  }
}
