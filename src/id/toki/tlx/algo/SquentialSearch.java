package id.toki.tlx.algo;

import java.util.Arrays;
import java.util.Scanner;

public class SquentialSearch {
  public static void main(String[] args) {
    int[] data = {12, 7, 30, 28, 2, 19, 36, 21, 16, 9};
    search(data);
  }

  public static void search(int[] data) {
    boolean status = true;
    Scanner input = new Scanner(System.in);
    System.out.println("Data Array : " + Arrays.toString(data));
    System.out.print("\nMasukan angka yang anda cari: ");
    int key = input.nextInt();
    for (int index = 0; index < data.length; index++) {
      System.out.println(data[index] + " != " + key);
      if (key == data[index]) {
        System.out.println(key + " == " + data[index] + " yey! ketemu di index ke-" + index);
        if (status == true) {
          break;
        }
      }

      if (index == (data.length - 1)) {
        System.out.println("sorry! data tidak ditemukan nih");
      }
    }
  }
}
