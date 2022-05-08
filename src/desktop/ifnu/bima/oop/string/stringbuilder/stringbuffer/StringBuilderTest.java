package desktop.ifnu.bima.oop.string.stringbuilder.stringbuffer;

/**
 * Class StringBuffer dibuat untuk tujuan efsiensi, karena StringBuffer bukan class immutable
 * seperti class String. StringBuffer mempunyai kemampuan untuk digunakan dalam lingkungan
 * multi threading karena sifatnya yang thread safe, tetapi feature ini menyebabkan class
 * StringBuffer tidak efsien dari sisi komputasi CPU, karena thread safe memerlukan pengecekan
 * apakah yang melakukan operasi terhadap class StringBuffer ini adalah thread yang sama, kalau
 * threadnya berbeda maka prosesnya disuruh mengantri dan hanya satu thread dalam satu waktu
 * yang bisa melakukan manipulasi class StringBuffer ini.
 * <p>
 * Class StringBuilder mempunyai tujuan yang sama persis dengan class StringBuffer, tetapai
 * StringBuilder tidak mempunyai fasilitas thread safe, sehingga performanya lebih cepat. Kalau kita
 * tidak memerlukan fasilitas thread safe maka StringBuilder adalah class yang tepat digunakan
 * untuk manipulasi string.
 */
public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("ini StringBuilder tidak immutable");
        System.out.println("sebelum operasi concat nilai s : " + s);

        //append merubah variable s, setelah proses append nilai variable s akan berubah
        s.append("concat");
        System.out.println("setelah operasi concat niali s : " + s);

    }

}
