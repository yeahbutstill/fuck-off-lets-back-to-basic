package desktop.ifnu.bima.throwsandthrow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExceptionTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream("buka-file-txt");
        System.out.println("kode setelah buka file");
    }
}
