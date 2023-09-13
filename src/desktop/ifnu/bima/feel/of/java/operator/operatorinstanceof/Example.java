package desktop.ifnu.bima.feel.of.java.operator.operatorinstanceof;

public class Example {
  public static void main(String[] args) {
    /**
     * Operator instanceof hanya dapat digunakan untuk mengoperasikan dua buah tipe data reference.
     * Operator ini digunakan untuk mengecek tipe dari sebuah variabel
     */
    String s = "ini string";
    if (s instanceof String) {
      System.out.println("BAAAAAAAAAAAAA");
    }

    Long l = 10L;
    Number x = l;
    if (x instanceof Long) {
      System.out.println("HAHAHAHAHA");
    }

    /**
     * Operator instanceof dapat menyebabkan error ketika kompilasi, kalau tipe data variabel
     * reference tersebut tidak berhubungan. Misalnya kita mempunyai tipe data Integer tetapi
     * dioperasikan dengan class String seperti di bawah ini :
     */
    //    Integer i1 = 10;
    //    if  (i1 instanceof String) {
    //      // Engga bisa
    //    }

    /**
     * Operator instanceof biasanya digunakan sebelum melakukan downcast dari subtype ke supertype
     * agar tidak terjadi ClassCastException. Lebih lanjut mengenai topik ini akan kita bahas dalam bab
     * OOP di java, karena perlu mengetahui konsep inheritance sebelum bisa memahami apa itu
     * subtype dan supertype.
     */
  }
}
