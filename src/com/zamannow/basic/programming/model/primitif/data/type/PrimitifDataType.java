package com.zamannow.basic.programming.model.primitif.data.type;

public class PrimitifDataType {
  public static void main(String[] args) {
    int a = 1;
    int a1 = -42;
    int a2 = 0;
    double b = 2.0;
    double b1 = 3.14;
    boolean c = true;
    char d = 'd';
    char d1 = '+';
    char d2 = '9';
    char d3 = '\n';

    System.out.println("expression");
    int i = a + (a - a1) / 2;
    double v = 1.0e-15 * b;
    System.out.println(i);
    System.out.println(v);
    System.out.println(i < v);
    System.out.println(d1);
    System.out.println(d3);
  }
}
