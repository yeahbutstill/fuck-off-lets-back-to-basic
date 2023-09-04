package id.toki.tlx.algo;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {12, 7, 30, 28, 2, 19, 50, 100, 36, 21, 16, 9};
        Scanner input = new Scanner(System.in);
        MergeSort sort = new MergeSort();
        sort.split(data); // sorting data memanggil method split dari class MergeSort
        System.out.print("\n\nData setelah sorting: ");
        sort.cetak(data);
        System.out.print("\n\nMasukan angka yang anda cari: ");
        int key = input.nextInt();
        cari(data, 0, data.length - 1, key); // method pencarian
    }

    public static void cari(int[] data, int awal, int akhir, int input) {
        int tengah = (awal + akhir) / 2; // inisialisasi tengah
        while (awal <= akhir) {
            System.out.print("\nTengah = " + data[tengah]);
            if (data[tengah] < input) { // kondisi tengah < dari input
                System.out.print("\n" + data[tengah] + " < " + input);
                awal = tengah + 1;
            } else if (data[tengah] == input) { // kondisi ditemukan
                System.out.print("\n" + data[tengah] + " == " + input + ", " + input + " ditemukan pada index ke-" + tengah);
                break;
            } else if (data[tengah] > input) { // kondisi tengah > dari input
                System.out.print("\n" + data[tengah] + " > " + input);
                akhir = tengah - 1;
            }

            tengah = (awal + akhir) / 2; // perubahan tengah
            if (awal > akhir) { // kondisi tidak ditemukan
                System.out.print("\n" + input + " tidak ditemukan");
            }
        }
    }
}
