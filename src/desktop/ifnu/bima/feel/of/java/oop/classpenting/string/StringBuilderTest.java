package desktop.ifnu.bima.feel.of.java.oop.classpenting.string;

public class StringBuilderTest {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    s.append("ini StringBuilder tidak immutable");
    System.out.println("Sebelum operasi concat nilai s : " + s);
    // append merubah variable s, setelah proses append nilai variable s akan berubah
    s.append(" concat1");
    System.out.println("setelah operasi concat nilai s : " + s);
    s.append(s.append(" concat2 ")).append(" object baru");
    System.out.println(s);
    System.out.println();
    System.out.println();


    /**
     * Mulai dari JDK 6, compiler java (javac) akan merubah operasi penggabungan String dengan
     * menggunakan operasi append dari class StringBuilder secara otomatis. Misalnya kode di bawah
     * ini :
     *
     * String s = "ini string immutable ";
     * String concat = s + s.concat("concat") + " object baru";
     *
     * kode di atas kalau dicompile menggunakan JDK 6 akan diubah kodenya menjadi seperti di bawah
     * ini :
     *
     * String s = "ini string immutable ";
     * StringBuilder builder = new StringBuilder();
     * String concat = builder.append(s).append(s.concat("concat"))
     * .append(" object baru").toString();
     *
     *
     * Jadi kalau sudah menggunakan JDK 6 tidak perlu khawatir melakukan penggabungan string
     * menggunakan class String dan operator +, tetapi memang sebaiknya selalu gunakan
     * StringBuilder.append untuk menekankan disiplin penggabungan string yang baik.
     */
    String s2 = "ini string immutable ";
    String concat = s2 + s2.concat("concat") + " object baru";
    System.out.println(concat);
  }
}

