# oh yeah let's back to basic

A ANSWERS TO SELF TESTS – JAVA: A BEGINNER'S GUIDE, EIGHTH EDITION, 8TH EDITION

Appendix A Answers to Self Tests

## Chapter 1: Java Fundamentals

1. Apa itu bytecode dan mengapa penting untuk penggunaan Java untuk pemrograman Internet?
    - Bytecode adalah kumpulan instruksi yang sangat dioptimalkan yang dijalankan oleh Java Virtual Machine.
2. Apa tiga prinsip utama pemrograman berorientasi objek?
    - Encapsulation, polymorphism, and inheritance.
3. Di mana program Java memulai eksekusi?
    - Program Java memulai eksekusi di main()
4. Apa itu variabel?
    - Variabel adalah lokasi memori bernama. Isi variabel dapat diubah selama eksekusi program.
5. Manakah dari nama variabel berikut yang tidak valid?
    - Variabel yang tidak valid adalah D. Nama variabel tidak boleh dimulai dengan angka.
6. Bagaimana Anda membuat komentar satu baris? Bagaimana Anda membuat komentar multiline?
    - Komentar satu baris dimulai dengan // dan berakhir di akhir baris. Komentar multiline dimulai dengan /* dan
      diakhiri dengan */.
7. Tunjukkan bentuk umum dari pernyataan if. Tunjukkan bentuk umum perulangan for.
    - The general form of the if:
      if(condition) statement; The general form of the for:
      for(initialization; condition; iteration) statement;

8. Bagaimana cara membuat blok kode?
    - Sebuah blok kode dimulai dengan { dan diakhiri dengan }.
9. Gravitasi bulan sekitar 17 persen dari bumi. Tulis program yang menghitung berat efektif Anda di bulan.
   ```java
   /**
   * Compute your weight on the moon.
   *
   * Call this file Moon.java
   */
   public class Moon {
    public static void main(String[] args) {
        double earthWeight; // weight on earth
        double moonWeight; // weight on moon
        earthWeight = 165;
        moonWeight = earthWeight * 0.17;

        System.out.println(earthWeight + " earth-pounds is equivalent to " + moonWeight + " moon-pounds.");
    }
   }
   ```

10. Adaptasi Coba Ini 1-2 sehingga mencetak tabel konversi inci ke meter. Tampilkan konversi 12 kaki, inci demi inci.
    Keluarkan baris kosong setiap 12 inci. (Satu meter sama dengan sekitar 39,37 inci.)
   ```java
    
    /**
   * This program displays a conversion
   * table of inches to meters
   * 
   * Call this program InchToMeterTable.java
   */
    public class IncToMeterTable {
        public static void main(String[] args) {
            double inches, meters;
            int counter;

            counter = 0;
            for (inches = 1; inches <= 144; inches++) {
                meters = inches / 39.37; // convert to meters
                System.out.println(inches + " inches is " + meters + " meters.");

                counter++;
                // every 12th line, print a blank line
                if (counter == 12) {
                    System.out.println();
                    counter = 0; // reset the line counter
                }
            }
        }
    }
   ```
11. Jika Anda membuat kesalahan pengetikan saat memasukkan program Anda, kesalahan seperti apa yang akan terjadi?
    - Kesalahan sintaks.
12. Apakah penting di bagian mana Anda meletakkan pernyataan?
    - Tidak, Java adalah bahasa bentuk bebas.
    

