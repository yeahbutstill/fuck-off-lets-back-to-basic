package desktop.ifnu.bima.throwsandthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionTest1 {
    public static void main(String[] args) {
        try {
            methodTidakBertanggungJawab();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("kode di dalam method main");
    }

    public static void methodTidakBertanggungJawab() throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream("buka-file.txt");
        System.out.println("kode setelah buka file");
    }
}
