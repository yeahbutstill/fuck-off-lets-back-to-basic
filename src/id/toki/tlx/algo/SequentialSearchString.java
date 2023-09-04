package id.toki.tlx.algo;

import java.util.Arrays;
import java.util.Scanner;

public class SequentialSearchString {
    public static void main(String[] args) {
        char[] data = {'d', 'c', 'g', 'h', 'b', 'a', 'f', 'i', 'e', 'c'};
        search(data);
    }

    public static void search(char[] data) {
        Scanner input = new Scanner(System.in);
        System.out.println("Data Array : " + Arrays.toString(data));
        System.out.print("\nMasukan angka yang anda cari: ");
        char key = input.next().charAt(0);
        for (int index = 0; index < data.length; index++) {
            System.out.println(data[index] + " != " + key);
            if (key == data[index]) {
                System.out.println(key + " == " + data[index] + " yey! ketemu di index ke-" + index);
                break;
            }

            if (index == (data.length -1)) {
                System.out.println("sorry! data tidak ditemukan nih");
            }
        }
    }
}
