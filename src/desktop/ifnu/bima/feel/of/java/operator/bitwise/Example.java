package desktop.ifnu.bima.feel.of.java.operator.bitwise;

public class Example {
  public static void main(String[] args) {
    int x = 11;
    int y = 13;
    int z = x & y;
    /**
     * Setelah operasi selesai nilai variabel z adalah 9. Bagaimana cara perhitunganya? kita harus
     * menyusun angka 11 dan 13 dalam bentuk binary, kemudian melakukan operasi & (dan) ke setiap
     * binary di posisi yang sama, hanya kalau keduanya bernilai 1 maka hasilnya 1, sisanya 0.
     * Perhatikan diagram di bawah ini untuk memperjelas operasi & :
     */

    // 1 0 1 1 => 8 + 0 + 2 + 1 = 11
    // 1 1 0 1 => 8 + 4 + 0 + 1 = 13
    // _____________________________ &
    // 1 0 0 1 => 8 + 0 + 0 + 1 = 9
    System.out.println(Integer.toBinaryString(x));
    System.out.println(Integer.toBinaryString(y));
    System.out.println(Integer.toBinaryString(z));
    System.out.println(z);

    System.out.println();

    // sekarang kita lihat contoh untuk operator | (atau)
    int x1 = 11;
    int y1 = 13;
    int z1 = x1 | y1;
    System.out.println(Integer.toBinaryString(x1));
    System.out.println(Integer.toBinaryString(y1));
    System.out.println(Integer.toBinaryString(z1));
    System.out.println(z1);
    /**
     * Setelah operasi selesai nilai variabel z adalah 15. Susun angka 11 dan 13 dalam bentuk
     * binary, kemudian lihat susunan angka binarynya, kalau salah satu atau kedua angka binary pada
     * posisi yang sama bernilai 1 maka hasilnya adalah 1, kalau keduanya 0 maka hasilnya 0.
     * Perhatikan diagram di bawah ini untuk memperjelas operasi | :
     */
    // 1 0 1 1 => 8 + 0 + 2 + 1 = 11
    // 1 1 0 1 => 8 + 4 + 0 + 1 = 13
    // _____________________________ |
    // 1 1 1 1 => 8 + 4 + 2 + 1 = 15


  }
}
