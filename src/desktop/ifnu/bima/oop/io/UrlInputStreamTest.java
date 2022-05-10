package desktop.ifnu.bima.oop.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Mari kita lihat contoh sebenarnya dari InputStream, kita akan membuat kode yang bisa
 * memanggil URL dari internet kemudian membaca halaman dari url tersebut menggunakan
 * InputStream :
 */
public class UrlInputStreamTest {

    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            int byteRead;

            do {
                byteRead = inputStream.read();
                System.out.print((char) byteRead);
            } while (byteRead != -1);

        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}

// output dari kode di atas adalah html yang dibaca dari google.com