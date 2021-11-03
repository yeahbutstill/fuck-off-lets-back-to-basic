package chapter3programcontrolstatements.testjava;

import java.util.Arrays;

public class YukUrut {
    public static void main(String[] args) {
        int[] hUjian = {10, 25, 8, 99, 30, 56, 78, 100, 44, 43, 32, 30, 32, 33, 44, 44, 26, 90, 25, 100};

        Arrays.sort(hUjian, 0, 19);
        for (int nilai : hUjian) {
            System.out.println("hasil ujian " + nilai);
        }
    }
}
