package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import java.util.ArrayList;

public class CopyArrayManualTest {
  public static void main(String[] args) {
    /**
     * Method asList digunakan untuk mengubah array menjadi List dengan cepat. Tanpa bantuan method
     * ini merubah array menjadi List memerlukan langkah-langkah : membuat instance dari List,
     * kemudian mengkopy isi array ke dalam List dengan iterasi. Langkah-langkah di atas kira-kira
     * memerlukan lima baris kode, tetapi dengan menggunakan method asList cukup satu baris kode
     * saja. Tanpa menggunakan method asList mengcopy array ke dalam List kodenya seperti di bawah
     * ini :
     */
    String[] namaBinatang = {"Kerbau", "Harimau", "Ayam", "Cicak"};
    ArrayList<String> namaBinatangList = new ArrayList<>();
    for (int i = 0; i < namaBinatang.length; i++) {
      namaBinatangList.add(namaBinatang[i]);
      System.out.println("name: " + namaBinatang[i]);
    }
  }
}