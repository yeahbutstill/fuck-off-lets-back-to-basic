package com.zamannow.basic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AwsomeAritmatika {

  private List<BigDecimal> totalOrder;

  public AwsomeAritmatika() {}

  public AwsomeAritmatika(List<BigDecimal> totalOrder) {
    this.totalOrder = totalOrder;
  }

  public static void main(String[] args) {
    AwsomeAritmatika pesenAh = new AwsomeAritmatika();
    Makanan makanan = new Makanan();
    Minuman minuman = new Minuman();
    makanan.setNama("Cuba");
    makanan.setHarga(BigDecimal.valueOf(3000));
    minuman.setNama("Frutang");
    minuman.setHarga(BigDecimal.valueOf(2000));

    ArrayList<BigDecimal> total = new ArrayList<>();
    total.add(makanan.getHarga());
    total.add(minuman.getHarga());
    pesenAh.setTotalOrder(total);

    System.out.println(minuman);
    System.out.println(makanan);

    BigDecimal x = pesenAh.getTotalOrder().get(0);
    BigDecimal y = pesenAh.getTotalOrder().get(1);
    System.out.println("Total: " + x.add(y));

    System.out.println("==================================");
    int a = 100;
    int b = 10;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a % b); // modulo hasil sisa bagi

    // Augmented Assignments
    System.out.println("====================================");
    a += a; // sama aja kaya a = a + 10;
    System.out.println(a);

    // Unary Operation
    System.out.println("=====================================");
    a++; // sama aja kaya a = a+1;
    a--;
    System.out.println(a++); // bertambah tapi setelah dijalankan eksekusi berikutnya
    System.out.println(a--);
    System.out.println(++a); // bertambah sebelum dieksekusi
    System.out.println(--a);

    int c = +10;
    int d = -10;
    boolean benar = true;
    System.out.println(c);
    System.out.println(d);
    System.out.println(!benar);
  }

  public List<BigDecimal> getTotalOrder() {
    return totalOrder;
  }

  public void setTotalOrder(List<BigDecimal> totalOrder) {
    this.totalOrder = totalOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof AwsomeAritmatika that)) return false;

    return getTotalOrder() != null
        ? getTotalOrder().equals(that.getTotalOrder())
        : that.getTotalOrder() == null;
  }

  @Override
  public int hashCode() {
    return getTotalOrder() != null ? getTotalOrder().hashCode() : 0;
  }

  @Override
  public String toString() {
    return "AwsomeAritmatika{" + "totalOrder=" + totalOrder + '}';
  }
}
