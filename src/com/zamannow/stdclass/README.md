Dalam bahasa Java, variabel dapat dikelompokkan menjadi dua tipe utama: mutabel (mutable) dan tidak mutabel (immutable).
Kategori-kategori ini menggambarkan apakah status dari sebuah objek dapat diubah setelah objek tersebut dibuat. Berikut
penjelasan keduanya:

- Immutable (Tidak Mutabel): Objek yang tidak mutabel adalah objek yang statusnya tidak dapat diubah setelah objek
  tersebut dibuat.
  Setelah objek tidak mutabel dibuat, statusnya tetap sama sepanjang masa hidupnya.
  Contoh umum dari kelas-kelas yang tidak mutabel dalam Java adalah String, Integer, dan BigDecimal.
  Untuk "mengubah" objek yang tidak mutabel, Anda biasanya membuat instansi baru dengan perubahan yang diinginkan.

Contoh menggunakan kelas String:

```java
String original = "Hello";
String modified = original.concat(", World"); // Membuat String baru
System.out.println(original); // Output: Hello
System.println(modified); // Output: Hello, World
```

- Mutable (Mutabel): Objek yang mutabel adalah objek yang statusnya dapat diubah setelah objek tersebut dibuat.
  Dengan objek yang mutabel, Anda dapat mengubah status internal dan properti-propertinya.
  Contoh kelas-kelas mutabel dalam Java mencakup ArrayList, HashMap, dan kelas-kelas kustom dengan bidang-bidang
  mutabel.

Contoh menggunakan ArrayList:

```java
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.remove(0); // Mengubah ArrayList yang ada dengan menghapus elemen pertama
System.out.println(numbers); // Output: [2, 3]
```

Pemilihan antara objek mutabel dan tidak mutabel tergantung pada persyaratan khusus dari program Anda. Objek yang tidak
mutabel seringkali lebih disukai ketika Anda ingin memastikan bahwa status sebuah objek tetap konsisten dan menghindari
perubahan yang tidak disengaja. Objek yang mutabel, di sisi lain, memberikan fleksibilitas dan dapat diubah sesuai
kebutuhan, tetapi mungkin memerlukan penanganan yang lebih hati-hati untuk menghindari efek samping yang tidak
diinginkan dalam kode Anda.

Penting untuk dicatat bahwa bahkan ketika berurusan dengan objek yang tidak mutabel, jika objek tersebut mengandung
referensi ke objek yang mutabel (misalnya, objek mutabel dalam objek yang tidak mutabel), Anda perlu berhati-hati untuk
memastikan bahwa objek yang mutabel yang dirujuk tersebut tidak diubah, karena itu masih dapat menyebabkan perilaku yang
tidak diinginkan.

# String class

- String adalah object, artinya dia memiliki representasi class nya
- Ada banyak sekali method yang bisa digunakan di String, bisa di lihat di javadocnya
- String itu di Java tidak bisa berubah, sekali kita membuat String data yang ada dalam string itu tidak bisa diubah.
- Jadi Ketika kita memanggil method dari String tersebut, data String yang aslinya tidak berubah. Tapi method
  toLowerCase akan membuat String baru dari object String tersebut
- Perlu diingat space pun dihitung sebagai character
- isBlank itu space kosong itu dianggap blank
- isEmpty itu apakah String itu kosong atau bukan

# StringBuffer dan StringBuilder

## Immutable

- String itu kalau di Java dia adalah tipe data yang Immutable, artinya tidak bisa berubah isinya, saat kita mengubah
  string, sebenarnya yang dilakukan di Java adalah membuat String baru.
- Jika kita manimupalis String dalam jumlah banyak, sangat tidak disarankan menggunakan String, karena akan memakan
  memory yang cukup besar, untuk kasus seperti ini, disarankan menggunakan StringBuffer atau StringBuilder

## StringBuffer VS StringBuilder

- Kemampuan dari dua tersebeut sebetulnya cukup sama, bisa digunakan untuk manipulasi String
- Yang membedakan adalah, StringBuffer itu thread safe, sedangkan StringBuilder tidak thread safe
- Jika kita ingin memanipulasi String secara paralel atau bersamaan, disarankan menggunakan StringBuffer, namun jika
  tidak butuh paralel, cukup gunakan StringBuilder
- Karena StringBuffer dibuat agar thread safe, maka secara otomatis performanya lebih lambat dibandingkan StringBuilder
  yang tidak thread safe

# StringJoin Class

- StringJoiner adalah class yang bisa digunakan untuk membuat String sequence yang dipisahkan dengan delimiter
- StringJoiner juga mendukung prefix dan suffix jika kita ingin menambahkannya
- Ini sangat bagus ketika kita ada kasus ingin mengeprint Array dengan format yang kita mau

# StringTokenizer Class

- StringTokenizer ini adalah class yang bisa digunakan untuk memotong String menjadi token atau string yang lebih kecil
- Kita bisa memotong String dengan delimiter yang kita mau

# Number Class

- Semua number class yang bukan primitive memiliki parent class yang sama, yaitu class Number
- Class Number memiliki banyak method yang bisa digunakan untuk mengkonversi ke tipe number lain
- Hal ini memudahkan kita untuk mengkonversi object number dari satu tipe ke tipe number lain

# Konversi String ke Number

- Long, Integer, Short dan Byte memiliki static method untuk melakukan konversi dari String ke number
- parseXxx(String) digunakan untuk mengkonversi dari String ke tipe data number primitive
- valueOf(String) digunakan untuk melakukan konversi dari string ke tipe data number non primitive
- Method ini akan Throw NumberFormatException jika ternyata gagal melakukan konversi String ke number

# Math Class

- Class Math ini merupakan class utilitis yang berisikan banyak sekali static method untuk operasi numerik, seperti
  trigonometric, logarithm, akar pangkat, dan lain-lain

# Big Number Class

- Jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long dan Double, di Java sudah
  disediakan class untuk handle data besar tersebut
- BigInteger adalah class untuk handle tipe data Integer
- BigDecimal adalah class untuk handle tipe data Floating Point

# Scanner Class

- Scanner sebenarnya bagian dari Java IO (input Output)
- Class Scanner hadir sejak Java 5
- Class Scanner adalah class yang bisa digunakan untuk membuat input, entah dari file, console dan lain-lain
- Class Scanner cocok untuk digunakan membaca input user dari console/terminal

# Date dan Calender

- Tiap bahasa pemrograman biasanya memiliki representasi tanggal, di Java juga sama, ada class Date dan Calendar yang
  bisa kita gunakan sebagai representasi tanggal
- Sebenarnya di Java 8 suda ada cara manipulasi tanggal yang baru menggunakan Java Date Time API
- Class Date adalah class yang representasikan tanggal sampai presisi milisecond
- Namun di class Date sudah banyak method yang deprecated, sehingga untuk manipulasi data tanggal, kita sekarang harus
  melakukan kombinasi antara class Date dan Calendar
- Sebenarnya Date untuk representasi tanggal, dan Calendar untuk memanipulasi tanggal

# System Class

- Class System adalah class yang berisikan banyak utility static method di Java
- String getenv(key) untuk mendapatkan environtment variable sistem operasi
- void exit(status) untuk menghentikan program Java
- long currentTimeMilis() untuk mendapatkan waktu saat ini dala milisecond
- long nanoTime() untuk mendapatkan waktu saat ini dalam nanosecond
- void gc() untuk menjalankan Java garbage collection

# Runtime Class

- Ketika applikasi Java kita berjalan, kita bisa melihat informasi environtment tempat aplikasi Java itu berjalan
- Informasi itu terdapat di class Runtime
- Class Runtime ini tida bisa dibuat, secara otomatis Java akan membuat single object. Kita bisa mengakses object
  tersebut menggunakan static method getRuntime() milik class Runtime
- int availableProcessors() mendapatkan jumlah core CPU
- long freeMemory() mendapatkan jumlah memory bebas di JVM
- long totalMemory() mendapatkan jumlah total memory di JVM
- long maxMemory() mendapatkan jumlah maksimum memory di JVM
- void gc() Menjalankan gerbage collector untuk menghilangkan data di memory yang sudah tidak terpakai

# UUID Class

- Saat membuat aplikasi, kadang kita ada kasus ingin membuat data unique, misal untuk kebutuhan data primary key
- Java menyediakan sebuah class UUID atau singkatan dari Universally Unique Identifier
- UUID adalah format standard untuk membuat unique value yang telah terjamin

# Base64 Class

- Sejak Java 8, Java sudah menyediakan class untuk melakukan encoding base64
- Base64 adalah encoding yang bisa digunakan untuk mengubah binary data ke text yang aman
- Aman maksudnya bukan dari sisi security, tapi aman dari kesalahan parsing

# Objects Class

- Awas jangan tertukar, ini class Objects bukan object
- Objects class adalah class utilty yang berisikan banyak static method yang bisa kita gunakan untuk operasi object atau
  melakukan pengecekan sebelum operasi nya dilakukan

# Random Class

- Random class adalah class yang bisa kita gunakan untuk men-generate random number

# Properties Class

- Kebanyakan applikasi Java akan menyimpan konfigurasi file dalam bentuk properties file
- Properties file adalah file yang berisi key dan value, dia dipisahkan dengan tanda sama dengan (=)
- Properties file bisa kita gunakan untuk menyimpan konfigurasi aplikasi kita
- Properties class adalah class yang bisa kita gunakan untuk mengambil atau menyimpan informasi ke file properties

# Arrays Class

- Arrays class adalah class yang berisi static method yang bisa kita gunakan untuk memanipulasi data array, seperti
  pencarian dan pengurutan
- binarySearch() ini digunakan untuk mecari value di array
- copyOf() ini digunakan untuk menyalin data array
- equals(array1, array2) ini digunakan untuk membandingkan array1 dengan array2
- sort(array) ini digunakan untuk mengurutkan array
- toString(array) ini digunakan untuk mengembalikan representasi String

# Regular Expression

- atau disingkat Regex adalah cara untuk melakukan pola pencarian
- Biasanya dilakukan untuk pencarian data dalam string
- Secara sederhana, kita mungkin sudah sering melakukan pencarian text baik dari text editor atau di aplikasi word
- Regex adalah pencarian yang lebih advanced dibandingkan text biasa, misal kita ingin mencari semua kata yang
  mengandung diawali huruf a dan diakhiri huruf a, dan lain-lain
- Java sudah menyediakan package java.util.regex yang berisikan utilitas untuk melakukan proses regular expression
- Secara garis besar terdapat 2 class yang dapat kita gunakan, yaitu Pattern class dan Matcher class
- Pattern class adalah representasi hasil kompilasi dari pola regular expressoin yang kita buat
- Matcher class adalah engine untuk melakukan pencarian dari pattern yang sudah kita buat
- Aturan regular expression sangat kaya
- Kita bisa lihat detail aturan-aturannya di halaman javadoc class Pattern

