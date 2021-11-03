package chapter3programcontrolstatements.bab3tesdiri;

import java.io.IOException;

public class Spaces {
  public static void main(String[] args) throws IOException {
    // count spaces
    char ch;
    int spaces = 0;

    System.out.println("Enter a period to stop.");
    do{
      ch = (char) System.in.read();
      if (ch == ' ') spaces++;
    } while (ch != '.');

    System.out.println("Spaces: " + spaces);
  }
}
