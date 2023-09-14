package desktop.ifnu.bima.feel.of.java.operator.logika;

public class LogicalOperatorOr {
  public static void main(String[] args) {
    /**
     * Operator | juga digunakan dalam operasi bitwise jika operandnya adalah angka. Jika
     * operandnya berupa boolean, operator | akan menghasilkan nilai true kalau salah satu atau
     * kedua operand bernilai true. Operand | hanya akan menghasilkan nilai false kalau kedua
     * operand bernilai false. Aturan ini berlaku juga untuk operator ||, perbedaanya adalah kalau
     * operator | kedua operand akan tetap dieksekusi walaupun operand sebelah kiri bernilai true.
     * Padahal kalau operand di kiri bernilai true, apapun nilai operand sebelah kanan pasti hasilnya
     * adalah true. Sedangkan untuk operator ||, kalau operand sebelah kiri bernilai true maka
     * operand sebelah kanan tidak akan dieksekusi dan nilai true dikembalikan sebagai hasil
     * operasinya. Silahkan edit sedikit kode di atas dan ganti operator & menjadi | untuk mengetahui
     * bagaimana hasil evaluasi kode di atas kalau menggunakan oprator |.
     */
    String nama = "dani";
    boolean z = (nama != null) | nama.equals("dani");
    boolean x = (nama.equals("") || (nama != null));
    System.out.println(z);
    System.out.println(x);
  }
}
