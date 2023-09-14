package desktop.ifnu.bima.feel.of.java.operator.bitshift;

public class NegatifBitShift {
  public static void main(String[] args) {
    /**
     * Bagimana kalau operasi bit shift ini dilaksanakan terhadap angka negatif? Operasi penggeseran
     * bit menggunakan tipe data int yang mempunyai panjang 32 bit, kita sudah belajar bagaimana
     * caranya merepresentasikan nilai negatif dalam notasi binari. Misalnya kita akan menggeser -11
     * ke kanan dua langkah seperti kode di bawah ini :
     */
    int x = -11;
    int y = x << 2; // x digeser ke kiri dua langkah
    System.out.println("dari binary x: " + Integer.toBinaryString(x));
    System.out.println("x: " + x);
    System.out.println("dari binary y: " + Integer.toBinaryString(y));
    System.out.println("y: " + y);

    /**
     * Dapat dilihat di atas, bahwa pergeseran ke kanan angka negatif akan menambahkan angka 1
     * di sebelah kiri dan menggeser sisanya ke kanan, berbeda dengan pergeseran ke bit ke kanan
     * pada angka positif yang menambahkan angka 0 di sebelah kiri dan menggeser sisanya ke
     * kanan. Hal ini menyebabkan pergeseran ke kanan tidak akan merubah angka positif menjadi
     * negatif atau sebaliknya.
     */
  }
}
