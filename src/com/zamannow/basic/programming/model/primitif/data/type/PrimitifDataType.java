package com.zamannow.basic.programming.model.primitif.data.type;

public class PrimitifDataType {
  public static void main(String[] args) {
    int a = 1;
    int a1 = -42;
    int a2 = 0;
    int a3 = 5;
    int a4 = 3;
    double b = 2.0;
    double b1 = 3.14;
    double b2 = 3.141;
    double b3 = .03;
    double b5 = 2.0e-7;
    double b6 = 100;
    double b7 = .015;
    double b8 = 6.02e23;
    boolean c = true;
    boolean c1 = false;
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

    System.out.println(a3 + a4); // add
    System.out.println(a3 - a4); // subtract
    System.out.println(a3 * a4); // multiply
    System.out.println(a3 / a4); // divide
    System.out.println(a3 % a4); // remainder
    System.out.println(d3);

    System.out.println(b2 - b3);
    System.out.println(b - b5);
    System.out.println(b6 * b7);
    System.out.println(b8 / b);
    System.out.println(d3);

    System.out.println(c && c1); // and
    System.out.println(c1 || c); // or
    System.out.println(!c1); // not
    System.out.println(c ^ c); // xor
  }
}
