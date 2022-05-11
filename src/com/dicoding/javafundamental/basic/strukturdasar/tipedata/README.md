# Tipe Data

Java merupakan bahasa pemrograman yang strongly typed, maka kita tidak bisa mengabaikan tipe data. Kita harus tahu data
seperti apa yang disimpan ke dalam variabel. Selain itu, Java juga bersifat statically typed, yang artinya setiap
variabel harus dideklarasikan terlebih dahulu sebelum digunakan.

Setiap bahasa pemrograman memiliki aturan tersendiri dalam menuliskan sebuah variabel. Begitupun pada Java. Setiap
variabel harus dideklarasikan terlebih dahulu tipe datanya. Tipe data digunakan untuk menentukan jenis nilai yang akan
ditampung pada variabel tersebut. Terdapat 2 (dua) jenis tipe data pada Java, yaitu tipe data primitive/primitif dan
reference/referensi. Mari kita pelajari masing-masing komponen-komponen di dalam keduanya.

# Tipe Data Primitif

Tipe data primitif adalah tipe data standar yang tidak diturunkan dari objek manapun. Tipe data primitif telah
ditentukan dengan kata kuncinya masing-masing. Terdapat 8 (delapan) tipe data primitif yang Java dukung, antara lain:

1. Byte
   Tipe data integer 8 bit yang digunakan untuk menampung angka dalam range yang kecil. Nilai minimum dan maksimum dari
   tipe data ini adalah -128, dan 127. Tipe data byte memiliki nilai default 0. Ia digunakan untuk menghemat ruang dalam
   array yang besar, terutama pada bilangan bulat, karena 1 (satu) byte 4 (empat) kali lebih kecil dari tipe data int.

```java
byte value=10;
        byte anotherValue=-10;
```

2. Short
   Merupakan tipe data integer 16 bit yang digunakan untuk menampung angka dalam range menengah, yaitu antara -32,768
   sampai 32,767. Sama seperti tipe sebelumnya, nilai default-nya 0. Ia bisa digunakan untuk menghemat memori seperti
   tipe data byte namun hanya 2 (dua) kali lebih kecil dari tipe data int.

```java
short value=15000;
        short anotherValue=-20000;
```

3. Int
   Merupakan tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam range cukup besar, yakni antara
   -2,147,483,648 sampai 2,147,483,647 dengan nilai default 0. Jika kita tidak memperhatikan penggunaan memori, tipe
   data inilah yang biasanya dipakai.

```java
int value=150000;
        int anotherValue=-200000;
```

4. Long
   Merupakan tipe data integer yang lebih besar jika dibandingkan dengan tipe data int. Ukurannya 64 bit dan bisa
   digunakan untuk menyimpan angka dengan range antara -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807. Tipe
   data long memiliki nilai default 0L.

```java
long value=150000L;
        long anotherValue=-200000L;
```

5. Float
   Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal. Nilai default-nya 0.0f.

```java
float value=3.5f;
```

6. Double
   Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar. Nilai
   default-nya 0.0d.

```java
double value=5.0;
```

7. Boolean
   Merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai, yaitu true dan false. Nilai default-nya false.

```java
boolean value=true;
        boolean anotherValue=false;
```

8. Char
   Merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter. Nilai karakter tersebut dibungkus di dalam
   tanda ' '.

```java
char item='A';
```

# Tipe Data Reference

Tipe data reference merupakan sebuah tipe data yang merujuk ke sebuah objek atau instance dari sebuah class. Salah satu
tipe data yang termasuk ke dalam tipe data reference adalah string. Tipe data string menunjuk ke instance dari class
java.lang.String.

Selain itu, kita bisa membuat tipe data sendiri. Sebagai contoh, ketika kita memiliki sebuah kelas User, kita bisa
membuat variabel baru dengan tipe data class User tersebut. Kita perlu membuat instance dari kelas tersebut:

```java
User user=new User();
```

Dengan begitu kita bisa mengakses semua atribut dan fungsi yang ada pada kelas User menggunakan variabel user.

# String

Di dalam bahasa pemrograman Java, string merupakan sebuah tipe data reference. Tipe data ini diperlakukan sebagai sebuah
obyek. String adalah kumpulan beberapa karakter (char). String sendiri sebenarnya merupakan sebuah class yang terdapat
dalam library Java dan digunakan untuk memanipulasi karakter. Contoh sintaks untuk mendeklarasikan sebuah string:

```java
String greeting="Hello World!";
```

Jika kode di atas dijalankan, maka konsol akan menampilkan teks Hello World!

Di dalam kelas String terdapat beberapa constructor yang memungkinkan kita untuk memberikan nilai awal untuk string dari
sumber yang berbeda. Sebagai contoh, misalnya kita ingin membuat variabel String dari sebuah array character.

```java
char[]dicodingChars={'d','i','c','o','d','i','n','g'};
        String dicodingString=new String(dicodingChars);
        System.out.println(dicodingString);
```

Dengan kode di atas, kita telah membuat sebuah array character yang berisi beberapa karakter.

Kemudian array character tersebut kita gunakan sebagai parameter untuk membuat String baru. Kode tersebut akan
menghasilkan teks "dicoding".

Perlu diperhatikan bahwa kelas String bersifat final. Alhasil, kita tidak bisa mengubah nilai dari objek yang sudah kita
buat. Jika kita ingin mengubah nilai tersebut, kita membutuhkan StringBuffer dan StringBuilder.

# Mengetahui Panjang String

Kelas String memiliki sebuah method untuk mengetahui panjang dari sebuah string, yakni method length(). Fungsi tersebut
akan mengembalikan/menghasilkan sejumlah karakter dari string, contohnya:

```java
String dicoding="dicoding";
        int length=dicoding.length();
        System.out.println(length);

```

Fungsi length() pada kode di atas akan menghitung jumlah karakter dari variabel dicoding. Jika dijalankan, maka konsol
akan menampilkan angka 8.

# Mengambil Karakter Dari Sebuah String

Kita juga bisa mengambil sebuah karakter secara spesifik dari sebuah String dengan menggunakan method charAt(int index)
yang sudah tersedia dalam kelas String. Misalnya saat ingin mengambil sebuah karakter dari teks dicoding, kita bisa
menggunakan kode berikut:

```java
String dicoding="dicoding";
        char result=dicoding.charAt(7);
        System.out.println(result);
```

Maka jika Anda menjalankan kode di atas, konsol akan menampilkan karakter urutan ke-8 dari teks tersebut, yaitu "g".

Selain method length() dan charAt(int index), masih banyak method lain yang disediakan oleh kelas String yang bisa
mempermudah kita memanipulasi sebuah teks. Berikut adalah kumpulan beberapa method yang sering digunakan:

1. length()    Digunakan untuk mengetahui panjang atau jumlah karakter dalam string.
2. charAt(int index)    Digunakan untuk mengambil sebuah karakter berdasarkan indeks tertentu.
3. format(String format, Object… args)    Digunakan untuk memformat sebuah string.
4. substring(int beginIndex)    Mengembalikan/menghasilkan substring berdasarkan indeks yang diberikan.
5. contains(CharSequence s)    Mengembalikan/menghasilkan nilai true atau false setelah mencocokkan karakter.
6. equals(Object object)    Memeriksa apakah nilai objek sama dengan nilai string.
7. isEmpty()    Memeriksa apakah sebuah string itu kosong atau tidak.
8. concat(String s)    Mengkonsolidasikan sebuah string.
9. replace(char a, char b)    Mengganti suatu karakter di dalam string.
10. indexOf(String a)    Mengetahui indeks dari sebuah substring.
11. toLowerCase()    Mengubah format string menjadi huruf kecil semua.
12. toUpperCase()    Mengubah format string menjadi huruf kapital semua.
13. trim()    Menghapus spasi awal dan akhir dari string.
14. valueOf(int value)    Mengkonversi tipe yang diberikan menjadi sebuah string.
15. compareTo()    Membandingkan dua nilai

Selengkapnya tentang string, kunjungi: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html.