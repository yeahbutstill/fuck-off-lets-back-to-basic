package desktop.ifnu.bima.oop.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Writer digunakan untuk menulis String atau char[] ke dalam sebuah fle. Kita akan menggunakan
 * BufferedWriter sebagai contohnya.
 */
public class WriterTest {

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write("HelloWorld ini file text saya\n");
            // menulis text ke dalam file
            writer.flush();
            writer.write("ini text di baris ke dua\n");
            // jangan lupa untuk selalu memanggil close
            // setelah reader tidak digunakan
            // close juga sekaligus memanggil flush dan menulis data ke dalam file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
