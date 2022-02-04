package chapter2introducingdatatypeandoperators.operators;

public class ModDemo {
  public static void main(String[] args) {
    int iresult, irem;
    double dresult, drem;

    iresult = 10 / 3;
    irem = 10 % 3;
    dresult = 10.0 / 3.0;
    drem = 10.0 % 3.0;

    int x = 10;
    int y = x++;

    System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
    System.out.println("Result and remainder of 10 / 3: " + dresult + " " + drem);

    System.out.println(y);
  }
}
