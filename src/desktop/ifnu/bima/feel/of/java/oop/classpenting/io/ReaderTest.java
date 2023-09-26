package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader("README.txt"))) {
      String line = " ";
      while ((line = reader.readLine()) != null) {
        System.out.println(line + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
