package desktop.ifnu.bima.oop.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new
                    FileReader("/home/yeahbutstill/IdeaProjects/LEARN/fuck-off-lets-back-to-basic/src/desktop/ifnu/bima/oop/io/ReaderTest.java"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
            //jangan lupa untuk selalu memanggil close setelah reader tidak digunakan
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
