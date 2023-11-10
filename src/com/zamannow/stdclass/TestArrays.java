package com.zamannow.stdclass;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {
        Integer[] array1 = {2, 12, 13, 4, 6, 7, 10, 100, 2222, 301, 400, 5};
        // diurutkan dari yang terkecil
        Arrays.sort(array1);
        // konversi jadi string
        System.out.println(Arrays.toString(array1));
        // pencarian menggunakan binary search
        int i = Arrays.binarySearch(array1, 100);
        System.out.println(i); // 100 di index ke 8

        // cari yang engga ada di array, dan pokoknya kalau hasilnya negative dibawah 0, berarti itu tidak ada di array nilainya
        System.out.println(Arrays.binarySearch(array1, 10000000));

        // copy sebagian data
        Integer[] result1 = Arrays.copyOf(array1, 3);
        Integer[] result2 = Arrays.copyOfRange(array1, 3, 10);
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}
