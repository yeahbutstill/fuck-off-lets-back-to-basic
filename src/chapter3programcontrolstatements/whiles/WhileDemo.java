package chapter3programcontrolstatements.whiles;

public class WhileDemo {
  public static void main(String[] args) {
    char ch;

    // print the alphabet using a while loop
    ch = 'a';
    while (ch <= 'z') {
      System.out.println(ch);
      ch++;
    }
  }
}
