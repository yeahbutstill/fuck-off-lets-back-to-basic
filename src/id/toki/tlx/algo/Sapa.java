package id.toki.tlx.algo;

import java.util.Scanner;

public class Sapa {

    public static void main(String[] args) {
        inData();
        sapaSaya();
    }

    private static void sapaSaya() {
        System.out.println("Selamat di Jurusan Teknik Komputer");
    }

    // fungsi
    static int tambah(int i, int j) {
        int x = i + j;
        return x;
    }

    // prosedure
    static void inData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai 1 : ");
        int a = input.nextInt();
        System.out.print("Masukan Nilai 2 : ");
        int b = input.nextInt();
        int jumlah = tambah(a, b);
        System.out.println("Hasil penjumlahan = " + jumlah);
    }
}
