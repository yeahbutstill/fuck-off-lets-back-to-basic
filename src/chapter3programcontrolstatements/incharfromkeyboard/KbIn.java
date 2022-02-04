package chapter3programcontrolstatements.incharfromkeyboard;

import java.io.IOException;

public class KbIn {
  public static void main(String[] args) throws IOException {

    char ch;

    System.out.print("Press a key followed by ENTER : ");

    ch = (char) System.in.read(); // get a char read a character from the keyboard

    System.out.println("Your key is: " + ch);
  }
}
