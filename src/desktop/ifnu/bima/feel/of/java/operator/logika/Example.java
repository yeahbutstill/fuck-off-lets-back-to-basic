package desktop.ifnu.bima.feel.of.java.operator.logika;

public class Example {
  public static void main(String[] args) {
    /**
     * operator &, seperti sudah dibahas di atas, operator ini juga digunakan sebagai bitwise kalau
     * operandnya bertipe angka. Kalau operandnya bertipe boolean maka operator & akan menghasilkan
     * nilai true kalau kedua operand bernilai true, selainya akan menghasilkan nilai false.
     * Perhatikan contoh kode di bawah ini :
     */
    int x = 10;
    int y = 11;
    boolean z = (x > 10) & (y >= 10);
    System.out.println(z);
    /**
     * Variabel z akan bernilai false karena operand sebelah kiri (x > 10) bernilai false dan
     * operand sebelah kanan (y >= 10) bernilai true. Kedua operasi di sisi kiri dan kanan akan
     * tetap dieksekusi walaupun sudah dipastikan bahwa operand sebelah kiri bernilai false dan
     * apapapun nilai operand di sebelah kanan tetap akan menghasilkan nilai false.
     */
  }
}
