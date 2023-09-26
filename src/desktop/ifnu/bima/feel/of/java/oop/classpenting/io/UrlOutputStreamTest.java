package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlOutputStreamTest {
  public static void main(String[] args) {
    try{
      URL url = new URL("https://studentsite.gunadarma.ac.id/index.php/site/berita/1759");
      URLConnection urlConnection = url.openConnection();
      InputStream inputStream = urlConnection.getInputStream();
      try (OutputStream fileOutputStream = new FileOutputStream("gundar.txt")) {
        int byteRead;
        do{
          byteRead = inputStream.read();
          fileOutputStream.write(byteRead);
          System.out.println((char) byteRead);
        } while (byteRead != -1);
        fileOutputStream.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
/**
 * Kode di atas akan membaca website gundar kemudian mengambil isinya dan menyimpan text html ke
 * dalam fle gundar.txt
 */
