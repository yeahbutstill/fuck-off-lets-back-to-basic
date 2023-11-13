package com.zamannow.basic;

import java.util.Arrays;

public class AwesomeArray {
    private String[] namaBuah;

    public AwesomeArray() {
    }

    public AwesomeArray(String[] namaBuah) {
        this.namaBuah = namaBuah;
    }

    public static void main(String[] args) {
        // Membuat Array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Haha";
        arrayString[1] = "HHOHOHO";
        arrayString[2] = "HMMMMMMM";
        for (String value : arrayString) {
            System.out.println(value);
        }
        System.out.println("========================");

        for (int i = 0; i < arrayString.length; i++) {
            System.out.println("index ke - " + i + " valuenya: " + arrayString[i]);
        }
        System.out.println("========================");

        // Array Initializer
        Integer[] arrIntegers = new Integer[]{10, 20, 3, 30, 1, 200};
        Long[] arrLongs = new Long[]{1L, 2L, 3L, 4L, 5L};
        System.out.println(Arrays.toString(arrIntegers));
        System.out.println(Arrays.toString(arrLongs));

        AwesomeArray awesomeArray = new AwesomeArray();
        awesomeArray.namaBuah = new String[3];
        awesomeArray.namaBuah[0] = Arrays.toString(new String[]{"mangga", "appel"});
        awesomeArray.namaBuah[1] = "Yeah"; // mengubah atau mengisi data
        awesomeArray.namaBuah[2] = "Hmmmmmm";

        System.out.println(Arrays.toString(awesomeArray.getNamaBuah()));
        System.out.println(Arrays.equals(awesomeArray.getNamaBuah(), awesomeArray.namaBuah));
        System.out.println((awesomeArray.namaBuah[0] == ("[mangga, " + "appel]")));
        System.out.println(awesomeArray.namaBuah[2]); // mengambil data
        System.out.println(awesomeArray.namaBuah.length); // mengambil panjang array
    }

    public String[] getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String[] namaBuah) {
        this.namaBuah = namaBuah;
    }

    @Override
    public String toString() {
        return "AwesomeArray{" + "namaBuah=" + Arrays.toString(namaBuah) + '}';
    }
}
