package desktop.ifnu.bima.oop.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlOutputStreamTest {

    public static void main(String[] args) {

        try {
            URL url = new URL("https://www.google.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            OutputStream outputStream = new FileOutputStream("google.txt");
            int byteRead;

            do {
                byteRead = inputStream.read();
                outputStream.write(byteRead);
                System.out.print((char) byteRead);
            } while (byteRead != -1);
            outputStream.flush();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

// Kode di atas akan membaca website google.com kemudian mengambil isinya dan menyimpan text
// html ke dalam fle google.txt
