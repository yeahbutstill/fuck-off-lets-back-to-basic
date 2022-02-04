package chapter2introducingdatatypeandoperators.operators;

public class CastDemo {
  public static void main(String[] args) {
    double x, y;
    byte b;
    int i;
    char ch;

    x = 10.0;
    y = 3.0;

    // truncation will accur in this conversion
    i = (int) (x / y); // cast double to int
    System.out.println("Integer outcome of x / y: " + i);

    i = 100;
    b = (byte) i; // no loss of info here. A byte can hold the value 100.
    System.out.println("Value of b: " + b);

    i = 257;
    b = (byte) i; // information loss this time. A byte cannot hold the value 257.
    System.out.println("Value of b: " + b);

    b = 88; // ASCII code for X
    ch = (char) b; // cast between incompatible types
    System.out.println("ch : " + ch);
  }
}
