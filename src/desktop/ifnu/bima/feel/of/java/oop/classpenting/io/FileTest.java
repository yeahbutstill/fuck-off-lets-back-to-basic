package desktop.ifnu.bima.feel.of.java.oop.classpenting.io;

import java.io.File;
import java.io.IOException;

public class FileTest {
  public static void main(String[] args) {
    File file = new File("README.txt");
    if (!file.exists()) {
      try {
        file.createNewFile(); // membuat file
        System.out.println(file.getAbsolutePath());
      } catch (IOException e) {
        e.printStackTrace();
        throw new RuntimeException(e);
      }
    }

    File folder = new File("newFolder");
    if (!folder.exists()) {
      folder.mkdir(); // membuat folder
      // folder.mkdirs(); // membuat folder di dalam folder
      System.out.println(folder.getAbsolutePath());
    }

    File curentFolder = new File(System.getProperty("user.dir"));
    File[] siblings = curentFolder.listFiles();
    for (int i = 0; i < siblings.length; i++) {
      File sibling = siblings[i];
      if (sibling.isFile()) {
        System.out.println("f as file " + sibling.getName());
      } else {
        System.out.println("d as directory" + sibling.getName());
      }
    }
  }
}
/**
 * Kode di atas akan membuat fle, kemudian membuat folder dan akhirnya mengambil isi semua
 * fle dan flder dari user.dir (folder dimana aplikasi java dijalankan). Masih banyak method-
 * method lain yang ada dalam class File yang belum kita coba, silahkan lihat javadoc untuk
 * melihat semua method yang dipunyai class File ini.
 */
