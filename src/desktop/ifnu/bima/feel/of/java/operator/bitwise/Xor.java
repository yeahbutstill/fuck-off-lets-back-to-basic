package desktop.ifnu.bima.feel.of.java.operator.bitwise;

public class Xor {
  public static void main(String[] args) {
    int x = 11;
    int y = 13;
    int z = x ^ y;
    /**
     * Setelah operasi selesai nilai variabel z adalah 6. Susun angka 11 dan 13 dalam bentuk binary,
     * hanya kalau salah satu dari kedua angka binary bernilai 1 maka hasil operasinya 1, selain itu
     * hasilnya 0. Perhatikan diagram di bawah ini untuk memperjelas operasi ^ :
     */
    // 1 0 1 1 => 8 + 0 + 2 + 1 = 11
    // 1 1 0 1 => 8 + 4 + 0 + 1 = 13
    // _____________________________ ^
    // 0 1 1 0 => 0 + 4 + 2 + 0 = 6
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(y));
    System.out.println(Integer.toBinaryString(z));
    System.out.println(z);
  }
}
