package test;

import com.artivisi.training.bestpractices.CaseInsensitiveString;
import com.artivisi.training.bestpractices.serializable.Product;
import org.junit.Test;

import java.math.BigDecimal;

public class EqualsTests {

    @Test
    public void testEqualsProduct() {
        Product p1 = new Product();
        p1.setCode("P001");
        p1.setName("Transaksi 001");
        p1.setPrice(new BigDecimal("100000.00"));

        Product p2 = new Product();
        p2.setCode("P001");
        p2.setName("Transaksi 001");
        p2.setPrice(new BigDecimal("100000.00"));

        Product p3 = p1;

        String besar = "DNL";
        String kecil = "dnl";
        /*
         Dibandingkan dengan equals, method equalsIgnoreCase() membandingkan dua String dengan
         mengabaikan besar-kecil. Oleh karena itu, String "DNL" dan "dnl" adalah dua buah String
         yang menurut method equalsIgnoreCase() akan mengbalikan true
         */
        System.out.println("hiraukan besar kecil dengan method equalsIgnoreCase() " + besar.equalsIgnoreCase(kecil));

        /*
         method compareTo() membandingkan dua buah String berdasarkan urutan leksikografisnya (Posisi kamus)
         contoh:
         "google".compareTo("yahoo") Method ini akan mengembalikan sebuah nilai int yang dapat diartikan sebagai berikut:
         */
        // Jika nilai yang dikembalikan kurang dari nol, maka String yang pertama memiliki posisi kamus lebih dulu.
        System.out.println("a".compareTo("b"));
        // Jika nilai yang dikembalikan sama dengan nol, maka kedua String memiliki posisi kamus yang sama.
        System.out.println("a".compareTo("a"));
        // Jika nilai yang dikembalikan lebih dari nol, maka String yang kedua (yang dikirimkan
        // ke parameter pada method compareTo()) memiliki posisi kamus lebih dulu
        System.out.println("b".compareTo("a"));

        // Metode ini mengabaikan besar-kecil String seperti halnya equalsIgnoreCase()
        // dan mengembalikan nilai yang sama dengan metode compareTo().
        System.out.println("B".compareToIgnoreCase("b"));

        /*
        Jangan menggunakan "==" kalau ingin membandingkan sebuah object.
        Banyak jr.programer Java membuat kesalahan dengan menggunakan "=="
        untuk melakukan perbandingan Object. Simbol ini membandingkan referensi dua variable
        apakah menuju ke object yang sama di heap.
        
         */
        System.out.println("p1 == p2 ? " + (p1 == p2));  // false

        /*
          Method equals() membandingkan dua String berdasarkan kontennya.
          Sehingga, apabila dua buah String memiliki huruf-huruf yang sama,
          diurutkan yang sama dengan besar-kecil yang sama maka dua String ini akan dianggap sama (true)

          "DNL" dan "DNL" - True
          "DNL" dan "dNL" - False
         */
        System.out.println("p1.equals(p2) ? " + (p1.equals(p2))); // true


        System.out.println("p1 == p3 ? " + (p1 == p3));

        p3.setCode("P003");
        System.out.println("Code : " + p1.getCode());

        String nama = "endy";
        String nama2 = "Endy";
        System.out.println("Nama Equals : " + nama.equals(nama2));
    }

    @Test
    public void testSymmetry() {
        CaseInsensitiveString cs = new CaseInsensitiveString("endy");
        String s = "Endy";

        System.out.println("cs.equals(s) : " + cs.equals(s));
        System.out.println("s.equals(cs) : " + s.equals(cs));
    }
}