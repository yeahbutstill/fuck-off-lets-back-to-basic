package desktop.ifnu.bima.feel.of.java.operator.bitshift;

public class PergeseranBitKeKiriUntukAngkaNegatif {
  public static void main(String[] args) {
    /**
     * Pergeseran bit ke kiri untuk angka negatif dilakukan dengan menambahkan angka 0 di bit paling
     * kanan, jadi berbeda dengan pergeseran ke kanan yang tergantung angkanya negatif atau positif,
     * untuk pergeseran ke kiri selalu angka 0 yang ditambahkan di posisi paling kanan. Hal ini
     * menyebabkan pergeseran ke sebelah kiri bisa mengakibatkan angka berganti tanda dari posiitif
     * menjadi negatif atau sebaliknya, tergantung apakah setelah operasi pergeseran nilai digit
     * paling kiri 0 (positif) atau 1 (negatif). Misalnya kita akan menggeser nilai maksumum positif
     * integer ke kiri dua langkah seperti di kode berikut ini :
     */
    int x = Integer.MAX_VALUE;
    int y = x << 2; // digeser ke kiri dua langkah
    System.out.println(x);
    System.out.println(Integer.toBinaryString(x));

    /**
     * Nilai y akan menjadi -4 setelah operasi di atas selesai dilaksanakan, mari kita lihat operasi
     * binarinya:
     * 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 => MAX_VALUE
     * --------------------------------------------------------------- << 2
     * 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 => -4
     */
    System.out.println(y);
    System.out.println(Integer.toBinaryString(y));
    /**
     * Penggeseran bit ke kanan secara logika sedikit berbeda dengan pergeseran ke kanan secara
     * aritmatik, hal ini terjadi karena angka yang ditambahkan di bit paling kiri selalu 0 tidak
     * tergantung angka yang akan digeser negatif atau positif. Hasil pergeseran bit ke kanan secara
     * logika berbeda dengan pergeseran bit ke kanan secara aritmatik kalau angka yang akan
     * digeser bernilai negatif.
     */
  }
}
