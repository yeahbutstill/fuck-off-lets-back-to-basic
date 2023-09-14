package desktop.ifnu.bima.feel.of.java.operator.bitshift;

public class Example {
  public static void main(String[] args) {
    int x = 11;
    int y = x >> 2; // x digeser ke kanan dua langkah
    System.out.println(Integer.toBinaryString(x) + " sama dengan " + x);
    /**
     * Hasilnya adalah y bernilai 2. Perhatikan diagram di bawah ini :
     * 1 0 1 1 => 8 + 0 + 2 + 1 = 11
     */

    // >> 2 geser bit di atas ke kanan dua kali dan tambahkan 0 di depan, sehingga 2 buah nilai 1 di
    // sebelah kanan menjadi hilang, hasilnya :
    // 0 0 1 0 => 0 + 0 + 2 + 0 = 2
    System.out.println("y bernilai: " + y + " dari binary " + Integer.toBinaryString(y));
  }
}
