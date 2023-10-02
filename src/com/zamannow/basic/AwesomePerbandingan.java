package com.zamannow.basic;

import java.math.BigDecimal;

public class AwesomePerbandingan {
  public static void main(String[] args) {
    Makanan makanan = new Makanan();
    Minuman minuman = new Minuman();
    makanan.setNama("Cuba");
    makanan.setHarga(new BigDecimal(3_000));
    minuman.setNama("Frutang");
    minuman.setHarga(new BigDecimal(2_000));

    System.out.println(minuman.getHarga().intValue() > makanan.getHarga().intValue());
    System.out.println(minuman.getHarga().intValue() < makanan.getHarga().intValue());
    System.out.println(minuman.getHarga().intValue() >= makanan.getHarga().intValue());
    System.out.println(minuman.getHarga().intValue() <= makanan.getHarga().intValue());
    System.out.println(minuman.getHarga().intValue() == makanan.getHarga().intValue());
    System.out.println(minuman.getHarga().intValue() != makanan.getHarga().intValue());

    System.out.println("===============================");
    int a = 10;
    int b = 20;
    System.out.println(a > b);
    System.out.println(a < b);
    System.out.println(a >= b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);

    System.out.println("==========================================");
    boolean nil1 = true;
    boolean nil2 = false;
    boolean nil3 = true;
    boolean nil4 = false;
    // DAN akan menghasilkan TRUE jika ke 2 nilainya true
    System.out.println(nil1 && nil3);
    System.out.println(nil1 && nil2);
    System.out.println(nil2 && nil1);
    System.out.println(nil2 && nil4);
    System.out.println("=====================================");

    // ATAU akan menghasilkan FALSE jika ke 2 nilainya
    System.out.println(nil1 || nil3);
    System.out.println(nil1 || nil2);
    System.out.println(nil2 || nil1);
    System.out.println(nil2 || nil4);
    System.out.println("========================================");

    // you know this is kebalikan dari yang benar like hukum di indonesia
    System.out.println(!nil1);
    System.out.println(!nil2);
  }
}
