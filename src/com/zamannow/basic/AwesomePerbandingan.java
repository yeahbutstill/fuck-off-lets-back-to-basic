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
  }
}
