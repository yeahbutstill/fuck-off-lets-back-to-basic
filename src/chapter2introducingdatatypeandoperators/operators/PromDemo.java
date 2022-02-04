package chapter2introducingdatatypeandoperators.operators;

public class PromDemo {
  public static void main(String[] args) {
    byte b;
    int i;

    b = 10;
    i = b * b; // OK, no cast needed. No cast needed because result is already elevated to int
    b = 10;
    b = (byte) (b * b); // cast needed!! cast is needed here to assign an int to a byte

    System.out.println("i and b: " + i + " " + b);
  }
}
