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

## Chapter 2: Introducing Data Types and Operators

1. Mengapa Java secara ketat menentukan rentang dan perilaku tipe primitifnya?
   - Java secara ketat menentukan rentang dan perilaku tipe primitifnya untuk memastikan portabilitas lintas platform.
2. Apa itu tipe karakter Java, dan apa bedanya dengan tipe karakter yang digunakan oleh beberapa bahasa pemrograman lain?
   - Tipe karakter Java adalah char. Karakter Java adalah Unicode daripada ASCII, yang digunakan oleh beberapa bahasa komputer lain.
3. Nilai boolean dapat memiliki nilai apa pun yang Anda suka karena nilai bukan nol adalah benar. Benar atau salah?
   - Palsu. Nilai boolean harus benar atau salah.
4. Given this output
   ```text
   One
   Two
   Three
   ```
   gunakan satu string untuk menampilkan pernyataan println() yang menghasilkannya.
   ```java
   System.out.println("One\nTwo\nThree");
   ```
   
5. Apa yang salah dengan fragmen ini?
   ```java
    for(i = 0; i < 10; i++) {
        int sum;
        sum = sum + i;
    }
    System.out.println("Sum is: " + sum);
   ```
   Ada dua kelemahan mendasar dalam fragmen. Pertama, sum dibuat setiap kali blok yang ditentukan oleh loop for dimasukkan dan dihancurkan saat keluar. Dengan demikian, itu tidak akan mempertahankan nilainya di antara iterasi. Mencoba menggunakan sum untuk menahan jumlah iterasi yang berjalan tidak ada gunanya. Kedua, jumlah tidak akan diketahui di luar blok yang dideklarasikan. Dengan demikian, referensi ke dalam pernyataan println() tidak valid.
6. Jelaskan perbedaan antara bentuk prefix dan postfix dari operator increment.
   - Ketika operator kenaikan mendahului operan, Java akan melakukan kenaikan sebelum mendapatkan nilai operan untuk digunakan oleh sisa ekspresi. Jika operator mengikuti operandnya, maka Java akan mendapatkan nilai operand sebelum diincrement.
   
7. Tunjukkan bagaimana hubungan pendek AND dapat digunakan untuk mencegah kesalahan bagi-oleh-nol.
   ```java
   if((b != 0) && (val / b)) ...
   ```
   
8. Dalam sebuah ekspresi, jenis apa yang dipromosikan byte dan short?
   - Dalam sebuah ekspresi, byte dan short dipromosikan menjadi int.

9. Secara umum, kapan gips dibutuhkan?
   - Gips diperlukan saat mengonversi antara tipe yang tidak kompatibel atau saat terjadi konversi yang menyempit.
   
10. Buatlah program yang mencari semua bilangan prima antara 2 dan 100.
   ```java
    // Find prime numbers between 2 and 100
    public class Prime {
        public static void main(String[] args) {
            int i, j;
            boolean isprime;

            for (i = 2; i < 100; i++) {
                isprime = true;

            // see if the number is evenly divisible
            for (j = 2; j <= i/j; j++)
                // if it is, then it's not prime
                if ((i%j) == 0) isprime = false;

            if (isprime)
                System.out.println(i + " is prime.");
            }
        }
    }
   ```

11. Apakah penggunaan tanda kurung yang berlebihan mempengaruhi kinerja program?
    - Tidak
12. Apakah blok mendefinisikan ruang lingkup?
    - Iya