package chapter3programcontrolstatements.selftest3;

/** Use a for loop to generate the progreesion 1 2 4 8 16, ... */
public class Progress {
  public static void main(String[] args) {
    for (int i = 1; i < 100; i += i) {
      System.out.println(i + " ");
    }
  }
}
