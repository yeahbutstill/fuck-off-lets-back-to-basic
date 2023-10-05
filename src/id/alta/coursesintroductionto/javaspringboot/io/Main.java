package id.alta.coursesintroductionto.javaspringboot.io;

import java.util.Scanner;

// output dan input
public class Main {
  public static void main(String[] args) {
    Double number = -10.6;

    System.out.println(5);
    System.out.println(number);

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int number1 = input.nextInt();
    System.out.println("You entered " + number1);

    // closing the scanner object
    input.close();
  }
}
