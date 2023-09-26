package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlInputStreamTest {
  public static void main(String[] args) {
    /**
     * Mari kita lihat contoh sebenarnya dari InputStream, kita akan membuat kode yang bisa
     * memanggil URL dari internet kemudian membaca halaman dari url tersebut menggunakan
     * InputStream :
     */
    try {
      URL url = new URL("https://studentsite.gunadarma.ac.id/index.php/site/berita/1759");
      URLConnection urlconn = url.openConnection();
      InputStream is = urlconn.getInputStream();
      int byteRead;
      do {
        byteRead = is.read();
        System.out.print((char) byteRead);
      } while (byteRead != -1);
    } catch (MalformedURLException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}

