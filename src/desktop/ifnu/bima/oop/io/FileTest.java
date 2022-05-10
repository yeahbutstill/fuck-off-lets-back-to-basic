package desktop.ifnu.bima.oop.io;

/**
 * Kode di atas akan membuat fle, kemudian membuat folder dan akhirnya mengambil isi semua
 * fle dan flder dari user.dir (folder dimana aplikasi java dijalankan). Masih banyak method-
 * method lain yang ada dalam class File yang belum kita coba, silahkan lihat javadoc untuk
 * melihat semua method yang dipunyai class File ini.
 */

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("newfile.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File folder = new File("newfolder");
        if (!folder.exists()) {
            folder.mkdir();
            //f.mkdirs(); //membuat folder di dalam folder
        }

        File currentFolder = new File(System.getProperty("user.dir"));
        File[] siblings = currentFolder.listFiles();
        for (int i = 0; i < siblings.length; i++) {
            File sibling = siblings[i];
            if (sibling.isFile()) {
                System.out.println("f " + sibling.getName());
            } else {
                System.out.println("d " + sibling.getName());
            }
        }

    }

}
