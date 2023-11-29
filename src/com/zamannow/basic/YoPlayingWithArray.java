package com.zamannow.basic;

import java.util.Arrays;

public class YoPlayingWithArray {

    String[] arrayString;
    Integer[] arrayInteger = new Integer[10];

    public static void main(String[] args) {
        String[] buah;
        buah = new String[3];
        buah[0] = "jeruk";
        buah[1] = "mangga";
        buah[2] = "apel";

        for (String keyBuah : buah) {
            System.out.println(keyBuah);
        }
        System.out.println();

        buah[2] = "semangka";
        System.out.println(buah[2]);
        System.out.println();

        YoPlayingWithArray yoPlayingWithArray = new YoPlayingWithArray();
        String[] binatang = new String[3];
        binatang[0] = "haimau";
        binatang[1] = "buaya";
        binatang[2] = "kelinci";
        yoPlayingWithArray.arrayString = binatang;

        for (String key : yoPlayingWithArray.arrayString) {
            System.out.println(key.toUpperCase());
        }
        System.out.println();
        System.out.println();

        YoPlayingWithArray yoPlayingWithArray1 = new YoPlayingWithArray();
        yoPlayingWithArray1.arrayInteger[0] = 1;
        yoPlayingWithArray1.arrayInteger[1] = 2;
        yoPlayingWithArray1.arrayInteger[2] = 3;
        yoPlayingWithArray1.arrayInteger[3] = 4;
        yoPlayingWithArray1.arrayInteger[4] = 5;
        yoPlayingWithArray1.arrayInteger[5] = 6;
        yoPlayingWithArray1.arrayInteger[6] = 7;
        yoPlayingWithArray1.arrayInteger[7] = 8;
        yoPlayingWithArray1.arrayInteger[8] = 9;
        yoPlayingWithArray1.arrayInteger[9] = 10;

        System.out.println(Arrays.toString(yoPlayingWithArray1.arrayInteger));
        System.out.println(Arrays.toString(yoPlayingWithArray1.arrayInteger).equals(10));
        System.out.println(Arrays.toString(yoPlayingWithArray1.arrayInteger).equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]"));
        System.out.println();

        for (int i = 0; i < yoPlayingWithArray1.arrayInteger.length; i++) {
            if ((i % 2) == 0) System.out.print(i);
        }
        System.out.println();
        System.out.println("=========================================================================================");
        System.out.println();

        // Ada banyak cara membuat array (Array initializer)
        int[] arrayInt = new int[]{10, 11, 12, 13};
        long[] arrayLong = {10, 11, 12, 13};

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayLong));
        System.out.println("=========================================================================================");
    }
}
