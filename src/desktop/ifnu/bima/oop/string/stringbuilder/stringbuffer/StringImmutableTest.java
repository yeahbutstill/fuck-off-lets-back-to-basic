package desktop.ifnu.bima.oop.string.stringbuilder.stringbuffer;

/**
 * String adalah class yang bersifat immutable, artinya sekali diset nilainya maka tidak bisa lagi
 * diubah. String yang bersifat immutable juga berarti bahwa kalau kita melakukan modifkasi
 * terhadap object String, pada dasarnya hasil modifkasi ini adalah object baru. Hal ini yang
 * membuat String ini menjadi tidak efsien digunakan pada saat diperlukan manipulasi String
 * dalam skala yang cukup besar. Mari kita lihat contoh kode yang menunjukkan class String
 * immutable :
 */
public class StringImmutableTest {

    public static void main(String[] args) {

        String s = "ini string immutable";
        System.out.println("Sebelum operasi concat nilai s : " + s);

        // append tidak merubah variable s, tetapi dibuat object baru
        // dan object baru ini direturn sedangkan variable s nilainya tetap
        s.concat("concat");
        System.out.println("Setelah operasi concat nilai s : " + s);
        String concat = s + s.concat("concat") + "object baru";

    }

}
