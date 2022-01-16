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
2. Apa itu tipe karakter Java, dan apa bedanya dengan tipe karakter yang digunakan oleh beberapa bahasa pemrograman
   lain?
    - Tipe karakter Java adalah char. Karakter Java adalah Unicode daripada ASCII, yang digunakan oleh beberapa bahasa
      komputer lain.
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
   Ada dua kelemahan mendasar dalam fragmen. Pertama, sum dibuat setiap kali blok yang ditentukan oleh loop for
   dimasukkan dan dihancurkan saat keluar. Dengan demikian, itu tidak akan mempertahankan nilainya di antara iterasi.
   Mencoba menggunakan sum untuk menahan jumlah iterasi yang berjalan tidak ada gunanya. Kedua, jumlah tidak akan
   diketahui di luar blok yang dideklarasikan. Dengan demikian, referensi ke dalam pernyataan println() tidak valid.
6. Jelaskan perbedaan antara bentuk prefix dan postfix dari operator increment.
    - Ketika operator kenaikan mendahului operan, Java akan melakukan kenaikan sebelum mendapatkan nilai operan untuk
      digunakan oleh sisa ekspresi. Jika operator mengikuti operandnya, maka Java akan mendapatkan nilai operand sebelum
      diincrement.

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

## Chapter 3: Program Control Statements

1. Tulis program yang membaca karakter dari keyboard sampai tanda titik diterima. Minta program menghitung jumlah spasi.
   Laporkan totalnya di akhir program.

```java
// Count space.
public class Space {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
```

2. Tunjukkan bentuk umum tangga if-else-if.

```text
if(condition)

statement;

else if(condition)

statement;

else if(condition)

statement;

.

.

.

else

statement;
```

3. Given

```java
if(x< 10)
        if(y>100){
        if(!done)x=z;
        else y=z;
        }
        else System.out.println("error"); // what if?
```

bagaimana jika yang terakhir diasosiasikan?

Yang lain terakhir diasosiasikan dengan if(y > 100).

4. Tunjukkan pernyataan for untuk loop yang dihitung dari 1000 hingga 0 dengan –2.

```java
for(int i=10000;i>=0;i-=2) //...
```

5. Apakah fragmen berikut valid?

```java
for(int i=0;i<num; i++)
        sum+=i;
        count=i;
```

Tidak; i tidak dikenal di luar for loop di mana ia dideklarasikan.

6. Jelaskan apa yang dilakukan istirahat. Pastikan untuk menjelaskan kedua bentuknya.
    - Pemutusan tanpa label menyebabkan penghentian pernyataan loop atau switch yang langsung terlampir. Sebuah
      istirahat dengan label menyebabkan kontrol untuk mentransfer ke ujung blok berlabel.

7. Pada fragmen berikut, setelah pernyataan break dijalankan, apa yang ditampilkan?

```java
for(i=0;i< 10;i++){
        while(running){
        if(x<y)break;
        // ...
        }
        System.out.println("after while");
        }
        System.out.println("after for");
```

Setelah break dijalankan, “after while” ditampilkan.

8. Apa yang dicetak oleh fragmen berikut?

```java
for(int i=0;i< 10;i++){
        System.out.println(i+" ");
        if((i%2)==0)continue;
        System.out.println();
        }
```

Inilah jawabannya:

```text
0 1 
2 3 
4 5 
6 7 
8 9 
```

9. Ekspresi iterasi dalam for loop tidak perlu selalu mengubah variabel kontrol loop dengan jumlah yang tetap.
   Sebaliknya, variabel kontrol loop dapat berubah dengan cara yang sewenang-wenang. Dengan menggunakan konsep ini,
   buatlah program yang menggunakan perulangan for untuk menghasilkan dan menampilkan progresi 1, 2, 4, 8, 16, 32, dan
   seterusnya.

```java
/**
 * Use a for loop to generate the progreesion
 * 1 2 4 8 16, ...
 */
public class Progress {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i += i) {
            System.out.println(i + " ");
        }
    }
}
```

10. Huruf kecil ASCII dipisahkan dari huruf besar dengan 32. Jadi, untuk mengubah huruf kecil menjadi huruf besar,
    kurangi 32 darinya. Gunakan informasi ini untuk menulis program yang membaca karakter dari keyboard. Mintalah untuk
    mengubah semua huruf kecil menjadi huruf besar, dan semua huruf besar menjadi huruf kecil, menampilkan hasilnya.
    Tidak ada perubahan pada karakter lain. Suruh program berhenti ketika pengguna memasuki periode. Pada akhirnya,
    mintalah program menampilkan jumlah perubahan kasus yang telah terjadi.

```java
// Change case.
public class CaseChg {
    public static void main(String[] args) throws IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter period to stop");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            } else if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Case changes: " + changes);
    }
}
```

11. Apa itu loop tak terbatas?
    - Loop tak terbatas adalah loop yang berjalan tanpa batas.

12. Saat menggunakan break dengan label, haruskah label berada di blok yang berisi break?
    - Iya

## Chapter 4: Introducing Classes, Objects, and Methods

1. Apa perbedaan antara kelas dan objek?
    - Kelas adalah abstraksi logis yang menggambarkan bentuk dan perilaku suatu objek. Objek adalah instance fisik dari
      kelas.
2. Bagaimana sebuah kelas didefinisikan?
    - Sebuah kelas didefinisikan dengan menggunakan kata kunci kelas. Di dalam pernyataan kelas, Anda menentukan kode
      dan data yang terdiri dari kelas.
3. Apa yang setiap objek memiliki salinannya sendiri?
    - Setiap objek kelas memiliki salinan sendiri dari variabel instan kelas.
4. Menggunakan dua pernyataan terpisah, tunjukkan cara mendeklarasikan objek yang disebut penghitung dari kelas yang
   disebut MyCounter.
   ```java
   MyCounter counter;
   counter = new MyCounter();
   ```

5. Tunjukkan bagaimana metode yang disebut myMeth() dideklarasikan jika memiliki tipe pengembalian ganda dan memiliki
   dua parameter int yang disebut a dan b.
   ```java
   double myMeth(int a, int b) { //...
   ```

6. Bagaimana metode harus kembali jika mengembalikan nilai?
    - Sebuah metode yang mengembalikan nilai harus kembali melalui pernyataan kembali, meneruskan kembali nilai kembali
      dalam proses.
7. Apa nama yang dimiliki konstruktor?
    - Sebuah konstruktor memiliki nama yang sama dengan kelasnya.
8. Apa yang baru lakukan?
    - Operator baru mengalokasikan memori untuk suatu objek dan menginisialisasinya menggunakan konstruktor objek.

9. Apa itu pengumpulan sampah dan bagaimana cara kerjanya?
    - Pengumpulan sampah adalah mekanisme yang mendaur ulang benda-benda yang tidak terpakai sehingga memori mereka
      dapat digunakan kembali.
10. Apa ini?
    - Kata kunci this adalah referensi ke objek tempat metode dipanggil. Itu secara otomatis diteruskan ke suatu metode.
11. Bisakah konstruktor memiliki satu atau lebih parameter?
    - Iya

12. Jika suatu metode tidak mengembalikan nilai, apa jenis pengembaliannya?
    - void

## Chapter 5: More Data Types and Operators

1. Tunjukkan dua cara untuk mendeklarasikan array satu dimensi dari 12 ganda.
    ```java
    double x[] = new double[12];
    double[] x = new double[12];
    ```

2. Tunjukkan bagaimana menginisialisasi array satu dimensi dari bilangan bulat ke nilai 1 sampai 5.
    ```java
    int x[] = {1, 2, 3, 4, 5};
    ```

3. Tulis program yang menggunakan array untuk mencari rata-rata sepuluh nilai ganda. Gunakan sepuluh nilai yang Anda
   suka.

```java
// Average 10 double values.
public class Avg {
    public static void main(String[] args) {
        double[] nums = {1.1, 2.2, 3.3, 4.4, 5.5,
                6.6, 7.7, 8.8, 9.9, 10.1
        };

        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Average: " + sum / nums.length);
    }
}
```

4. Ubah sort di Try This 5-1 sehingga mengurutkan array string. Tunjukkan bahwa itu berhasil.

```java
// Demonstrate the Bubble sort with strings.
public class StrBubble {
    public static void main(String[] args) {
        String[] strs = {
                "this", "is", "a", "test",
                "of", "a", "strings", "sort"
        };

        int a, b;
        String t;
        int size;

        size = strs.length; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();

        // this is the bubble sort for strings.
        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (strs[b - 1].compareTo(strs[b]) > 0) { // if out of order
                    // exchange elements
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }
        }

        // display sorted array
        System.out.print("Sorted array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + strs[i]);
        }
        System.out.println();
    }
}
```

5. Apa perbedaan antara metode String indexOf() dan lastIndexOf()?
    - Metode indexOf() menemukan kemunculan pertama dari substring yang ditentukan.
    - lastIndexOf() menemukan kejadian terakhir

6. Karena semua string adalah objek bertipe String, tunjukkan bagaimana Anda dapat memanggil metode length() dan
   charAt() pada literal string ini: "I like Java".
    - Meski terlihat aneh, ini adalah panggilan yang valid ke length():

```java
System.out.println("I like Java".length());
```

-Output yang ditampilkan adalah 11. charAt() dipanggil dengan cara yang sama.

7. Memperluas kelas Encode cipher, memodifikasinya sehingga menggunakan string delapan karakter sebagai kuncinya.

```java
// An improved XOR cipher.
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the message
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
```

8. Bisakah operator bitwise diterapkan pada tipe ganda?
    - Tidak

9. Tunjukkan bagaimana urutan ini dapat ditulis ulang menggunakan ? operator.

```java
if(x< 0)y=10;
        else y=20;
```

here is the answer:

```java
y=x< 0?10:20;
```

10. Pada fragmen berikut, apakah & merupakan operator bitwise atau logika? Mengapa?

```java
boolean a,b;
//...
        if(a&b)..
```

Ini adalah operator logis karena operan bertipe boolean.

11. Apakah merupakan kesalahan untuk melewati akhir array?

- Iya
- Apakah kesalahan mengindeks array dengan nilai negatif? Ya. Semua indeks array dimulai dari nol.

12. Apa itu operator shift kanan yang tidak bertanda tangan?

```text
>>>
```

13. Tulis ulang kelas MinMax yang ditunjukkan sebelumnya di bab ini sehingga menggunakan gaya for-each for loop.

```java
// Find the minimum and maximum values in an array
public class MinMax {
    public static void main(String[] args) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for (int v : nums) {
            if (v < min) min = v;
            if (v > max) max = v;
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
```

14. Dapatkah perulangan for yang melakukan pengurutan pada kelas Bubble yang ditunjukkan pada Try This 5-1 dapat diubah
    menjadi perulangan gaya untuk setiap? Jika tidak, mengapa tidak?

- Tidak, perulangan for di kelas Bubble yang melakukan pengurutan tidak dapat diubah menjadi perulangan gaya untuk
  setiap. Dalam kasus loop luar, nilai arus counter loop-nya dibutuhkan oleh loop dalam. Dalam kasus loop dalam, nilai
  out-of-order harus dipertukarkan, yang menyiratkan penugasan. Penugasan ke larik yang mendasarinya tidak dapat
  dilakukan saat menggunakan perulangan gaya untuk masing-masing.

15. Bisakah String mengontrol pernyataan sakelar?
    - Dimulai dengan JDK 7, jawabannya adalah Ya.
16. Nama tipe apa yang dicadangkan untuk digunakan dengan inferensi tipe variabel lokal?
    - Nama var dicadangkan untuk digunakan dengan inferensi tipe variabel lokal.
17. Tunjukkan bagaimana menggunakan inferensi tipe variabel lokal untuk mendeklarasikan variabel boolean yang disebut
    done yang memiliki nilai awal salah.

```java
var done=false;
```

18. Bisakah var menjadi nama variabel? Bisakah var menjadi nama kelas?
    - Ya, var bisa menjadi nama variabel. Tidak, var tidak boleh nama kelas.
19. Apakah pernyataan berikut ini valid? Jika tidak, mengapa tidak.

```java
var[]avgTemps=new double[7];
```

- Tidak, ini tidak valid karena tanda kurung array tidak diperbolehkan setelah var. Ingat, tipe lengkap disimpulkan dari
  penginisialisasi.

20. Apakah pernyataan berikut ini valid? Jika tidak, mengapa tidak?

```java
var alpha=10,beta=20;
```

- Tidak, hanya satu variabel pada satu waktu yang dapat dideklarasikan ketika inferensi tipe digunakan.

21. Dalam metode show() dari kelas ShowBits yang dikembangkan di Try This 5-3, topeng variabel lokal dideklarasikan
    seperti yang ditunjukkan di sini:

```java
long mask=1;
```

Ubah deklarasi ini sehingga menggunakan inferensi tipe variabel lokal. Saat melakukannya, pastikan bahwa topeng bertipe
panjang (seperti yang ada di sini), dan bukan bertipe int.

```java
var mask=1L; // Notice that the initial value is exlicitly specified as long so that mask will be inferred to be long
```

## Chapter 6: A Closer Look at Methods and Classes

1. Mengingat fragmen ini,
```java
class X {
    private int count;
}
```
apakah penggalan berikut ini benar?
```java
class Y {
    public static void main(String args[]) {
        X ob = new X();
        
        ob.count = 10;
    }
}
```

Tidak; anggota pribadi tidak dapat diakses di luar kelasnya.

2. Pengubah akses harus __________ deklarasi anggota.

mendahului

3. Komplemen antrian adalah stack. Ini menggunakan akses masuk pertama, terakhir keluar dan sering disamakan dengan tumpukan piring. Piring pertama yang diletakkan di atas meja adalah piring terakhir yang digunakan. Buat kelas tumpukan yang disebut Stack yang dapat menampung karakter. Panggil metode yang mengakses tumpukan Push() dan pop(). Izinkan pengguna untuk menentukan ukuran tumpukan saat dibuat. Jaga kerahasiaan semua anggota kelas Stack lainnya. (Petunjuk: Anda dapat menggunakan kelas Antrian sebagai model; cukup ubah cara data diakses.)
