package desktop.ifnu.bima.feel.of.java.deklarasiclass.Inheritance;

/**
 * Extends (Inheritance):
 * Memperluas sebuah kelas (inheritance) adalah mekanisme yang memungkinkan sebuah kelas (subclass atau derived class)
 * untuk mewarisi atribut dan perilaku dari kelas lain (superclass atau base class).
 * Subkelas dapat memperluas fungsionalitas dari superclass dengan menambahkan field dan metode baru atau dengan menggantikan metode yang ada.
 * Inheritance menciptakan hubungan "is-a," di mana sebuah subclass adalah versi khusus dari superclass.
 * Ini mempromosikan penggunaan kembali kode dan dapat membantu dalam pemodelan hubungan dunia nyata.
 */
public class KelasInduk {
   private int fieldLuar;

   public class KelasDalam {
       private int fieldDalam;

       public void methodDalam() {
           // Akses anggota kelas luar
           fieldLuar = 10;
       }
   }
}
