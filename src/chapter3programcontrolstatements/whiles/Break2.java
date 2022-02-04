package chapter3programcontrolstatements.whiles;

import java.io.IOException;

public class Break2 {
  public static void main(String[] args) throws IOException {
    char ch;

    for (; ; ) { // the infinite loop
      ch = (char) System.in.read(); // get a char
      if (ch == 'q') break; // terminated by the break.
    }
    System.out.println("You pressed q!");
  }
}
