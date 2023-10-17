package com.zamannow.basic.programming.model.primitif.data.type.task.parseconvertion;

public class CobaParse {
  public static void main(String[] args) {
    Integer age = 30;
    String name = "DNL";
    System.out.println(age + ", " + name);
    System.out.println("=================");

    // System.out.println(Integer.parseInt("A")); // error, string cuman harus angka
    int xi = Integer.parseInt("200");
    String xs = Integer.toString(200);
    double di = Double.parseDouble("200.00");
    String ds = Double.toString(200.00);

    System.out.println(xs.equals(xi));
    System.out.println(xi == 200);

    System.out.println(ds.equals(200.00));
    System.out.println(di);
    System.out.println(ds.equals("200.00"));
    System.out.println(ds.equals(ds));
    System.out.println("\n");

    // reference equality
    String s1 = "Hello";
    String s2 = new String("Hello");
    if (s1 == s2) System.out.println("s1 dan s2 di object yang sama");
    else System.out.println("s1 dan s2 di object yang berbeda");

    // value equality
    String s3 = "Hello";
    String s4 = new String("Hello");
    if (s3.equals(s4)) System.out.println("s3 dan s4 nilainya sama");
    else System.out.println("s3 dan s4 nilainya beda");
  }
}
