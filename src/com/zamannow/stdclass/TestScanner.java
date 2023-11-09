package com.zamannow.stdclass;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Parameter System.in ini method yang akan memasukan data dari console atau terminal kalian

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        Integer umur = scanner.nextInt();

        System.out.print("Gaji: ");
        Long gaji = scanner.nextLong();

        System.out.print("Menikah: ");
        Boolean menikah = scanner.nextBoolean();

        System.out.println("---------------------");
        System.out.println("Hello " + nama);
        System.out.println(umur);
        System.out.println(gaji);
        System.out.println(menikah);
    }
}
