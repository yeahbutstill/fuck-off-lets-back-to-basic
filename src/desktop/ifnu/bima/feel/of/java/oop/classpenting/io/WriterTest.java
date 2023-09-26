package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
  public static void main(String[] args) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("README.txt"))) {
      writer.write("Hello World ini file text saya\n");
      // menulis text ke dalam file
      writer.flush();
      writer.write("ini text dari baris dua \n");
    } catch (IOException e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
}
