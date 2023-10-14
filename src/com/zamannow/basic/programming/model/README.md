![img_2.png](img_2.png)
![img_3.png](img_3.png)
- Primitive data types, secara tepat mendefinisikan arti seperti bilangan bulat, bilangan real dan nilai boolean dalam program komputer. mereka juga bisa mencakup kumpulan nilai yang mungkin dapat dioperasikan manjadi ekspresi seperti ekspresi matematika yang mendefinisikan sebuah nilai
- Statement adalah memungkinkan kita mendefinisikan komputasi dengan menciptakan dan menetapkan nilai variable, mengendalikan aliran eksekusi atau menyebabkan efek samping. ada 6 jenis statement
  - declaration
  - assignment
  - conditional
  - loop
  - call
  - return
- Array adalah memungkinkan kita bekerja dengan beberapa nilai yang betipe sama
- Static method adalah memungkinkan kita merangkum dan menggunakan kembali kode serta mengembangkan program sebagai satu set modul dependenci
- String adalah rankaian karakter, Beberapa operasi pada mereka di bangun di Java
- Input/Output adalah mengatur komunikasi antara program dan dunia luar
- Data abstraction memperluas enkapsulasi dan penggunaan kembali untuk memungkinkan kita mendefinisikan tipe data primitif, sehingga mendukung program berorentasi objek

![img.png](img.png)

Untuk mendefinisikan tipe data, kita hanya perlu menentukan nilai dan rangkaian operasi pada nilai tersebut. Informasi ini dirangkum dalam tabel di bawah untuk tipe data Java int, double, boolean, dan char. Tipe data ini mirip dengan tipe data dasar yang ditemukan di banyak bahasa pemrograman. Untuk int dan double, operasinya sudah familiar
operasi aritmatika; untuk boolean, ini adalah operasi logika yang familiar. Penting untuk dicatat bahwa +, -, *, dan / kelebihan beban simbol yang sama menentukan operasi dalam beberapa tipe berbeda, bergantung pada konteks. Properti utama dari operasi primitif ini adalah bahwa operasi yang melibatkan nilai dari tipe tertentu memiliki nilai dari tipe tersebut. Aturan ini
menyoroti gagasan bahwa kita sering bekerja dengan nilai perkiraan, karena sering kali nilai eksak yang tampaknya ditentukan oleh ekspresi bukanlah nilai dari tipe tersebut. Misalnya, 5/3 memiliki nilai 1 dan 5.0/3.0 memiliki nilai yang sangat dekat dengan 1.66666666666667 namun tidak satu pun dari keduanya yang sama persis dengan 5/3. Tabel ini masih jauh dari lengkap; kami membahas beberapa operator tambahan dan berbagai situasi luar biasa yang terkadang perlu kami pertimbangkan dalam Tanya Jawab di akhir bagian ini.
![img_1.png](img_1.png)

## Expression
Ekspresi. Seperti yang diilustrasikan dalam tabel di bagian bawah halaman sebelumnya, ekspresi tipikal adalah infiks: literal (atau ekspresi), diikuti oleh operator, diikuti oleh literal lain (atau ekspresi lain). Ketika sebuah ekspresi mengandung lebih dari satu operator, urutan penerapannya sering kali signifikan, sehingga konvensi prioritas berikut adalah bagian dari spesifikasi bahasa Java: Operator * dan / (dan %) memiliki prioritas lebih tinggi daripada (diterapkan sebelumnya) ) operator + dan - di antara operator logika, ! adalah prioritas tertinggi, diikuti oleh && dan kemudian ||. Umumnya, operator dengan prioritas yang sama diterapkan dari kiri ke kanan. Seperti dalam ekspresi aritmatika standar, Anda dapat menggunakan tanda kurung untuk mengesampingkan aturan ini. Karena aturan prioritas sedikit berbeda dari satu bahasa ke bahasa lain, kami menggunakan tanda kurung dan berusaha menghindari ketergantungan pada aturan prioritas dalam kode kami.

## Type conversion
Angka secara otomatis dipromosikan ke tipe yang lebih inklusif jika tidak
informasi hilang. Misalnya, dalam ekspresi 1 + 2.5 , 1 dipromosikan ke nilai ganda 1.0 dan ekspresi dievaluasi menjadi nilai ganda 3.5 . Pemeran adalah nama tipe dalam tanda kurung dalam ekspresi, arahan untuk mengubah nilai berikut menjadi nilai tipe tersebut. Misalnya (int) 3.7 adalah 3 dan (double) 3 adalah 3.0. Perhatikan itu
casting ke int adalah pemotongan, bukan pembulatan, aturan untuk casting dalam ekspresi yang rumit bisa jadi rumit, dan cast harus digunakan dengan hemat dan hati-hati. Praktik terbaiknya adalah menggunakan ekspresi yang melibatkan literal atau variabel bertipe tunggal.

## Comparisons
Operator berikut membandingkan dua nilai dengan tipe yang sama dan
menghasilkan nilai boolean: sama dengan (==), tidak sama dengan (!=), lebih kecil dari (<), lebih kecil atau sama dengan (<=), lebih besar dari (>), dan lebih besar atau sama dengan (>=). Operator ini dikenal sebagai operator tipe campuran karena nilainya boolean, bukan tipe nilai yang dibandingkan. Ekspresi dengan nilai boolean dikenal sebagai ekspresi boolean. Ekspresi tersebut merupakan komponen penting dalam pernyataan kondisional dan loop, seperti yang akan kita lihat

## Other primitive types
Int Java memiliki 232 nilai yang berbeda berdasarkan desain, sehingga dapat direpresentasikan dalam kata mesin 32-bit (banyak mesin saat ini memiliki kata-kata 64-bit, tetapi int 32-bit tetap ada). Demikian pula, standar ganda menentukan representasi 64-bit. Ukuran tipe data ini cukup untuk aplikasi tipikal yang menggunakan bilangan bulat dan bilangan real. Untuk memberikan fleksibilitas, Java memiliki lima tipe data primitif tambahan:
- 64-bit integers, with arithmetic operations (long)
- 16-bit integers, with arithmetic operations (short)
- 16-bit characters, with arithmetic operations (char)
- 8-bit integers, with arithmetic operations (byte)
- 32-bit single-precision real numbers, again with arithmetic operations (float)

Kami paling sering menggunakan operasi aritmatika int dan ganda dalam buku ini, jadi kami tidak mempertimbangkan operasi aritmatika lainnya (yang sangat mirip) secara lebih rinci di sini.

## Statements 
Program Java terdiri dari pernyataan-pernyataan, yang mendefinisikan komputasi dengan membuat dan memanipulasi variabel, menetapkan nilai tipe data padanya, dan mengendalikan aliran eksekusi operasi tersebut. Pernyataan sering kali disusun dalam blok, urutan pernyataan dalam kurung kurawal.

- Declarations Deklarasi membuat variabel dengan tipe tertentu dan menamainya dengan pengidentifikasi. 
- Assignments Penugasan mengasosiasikan nilai tipe data (didefinisikan oleh ekspresi) dengan variabel. Java juga memiliki beberapa idiom penugasan implisit untuk mengubah nilai nilai tipe data relatif terhadap nilainya saat ini, seperti menambah nilai variabel integer. 
- Conditionals Persyaratan menyediakan perubahan sederhana dalam alur eksekusi, mengeksekusi pernyataan di salah satu dari dua blok, bergantung pada kondisi yang ditentukan. 
- Loops Perulangan memberikan perubahan yang lebih besar dalam aliran eksekusi, mengeksekusi pernyataan dalam sebuah blok selama kondisi tertentu benar. 
- Calls Panggilan dan pengembalian berhubungan dengan metode statis (lihat halaman 22), yang menyediakan cara lain untuk mengubah alur eksekusi dan mengatur kode


Program adalah rangkaian pernyataan, dengan deklarasi, penugasan, kondisional, perulangan, panggilan, dan pengembalian. Program biasanya memiliki struktur bersarang: suatu pernyataan di antara pernyataan-pernyataan dalam suatu blok dalam suatu kondisi atau perulangan dapat berupa suatu kondisi atau perulangan. Misalnya, perulangan while pada rank() berisi pernyataan if. Selanjutnya, kita mempertimbangkan masing-masing jenis pernyataan ini secara bergantian.

Declarations. Pernyataan deklarasi mengaitkan nama variabel dengan tipe pada waktu kompilasi. Java mengharuskan kita menggunakan deklarasi untuk menentukan nama dan tipe variabel. Dengan melakukan hal ini, kami bersikap eksplisit tentang perhitungan apa pun yang kami tentukan. Java dikatakan sebagai bahasa yang diketik dengan kuat, karena compiler Java memeriksa konsistensinya (misalnya, Java tidak mengizinkan kita mengalikan boolean dan double).
Deklarasi dapat muncul dimana saja sebelum suatu variabel pertama kali digunakan. Paling sering, kita menempatkannya pada titik penggunaan pertama. Cakupan suatu variabel adalah bagian program yang mendefinisikannya. Umumnya ruang lingkup suatu variabel terdiri dari pernyataan-pernyataan yang mengikuti deklarasi di blok yang sama dengan deklarasi.

Assignments. Pernyataan penugasan mengaitkan nilai tipe data (didefinisikan oleh ekspresi) dengan variabel. Saat kita menulis c = a + b di Java, kita tidak menyatakan persamaan matematis, melainkan menyatakan suatu tindakan: tetapkan nilai variabel c menjadi nilai a ditambah nilai b. Memang benar bahwa c secara matematis sama dengan a + b segera setelah pernyataan penugasan dieksekusi, tetapi tujuan dari pernyataan tersebut adalah untuk mengubah nilai c (jika perlu). Sisi kiri pernyataan penugasan harus berupa variabel tunggal; sisi kanan dapat berupa ekspresi arbitrer yang menghasilkan nilai bertipe tersebut.

Conditionals. Kebanyakan komputasi memerlukan tindakan berbeda untuk input berbeda. Satu
cara untuk mengekspresikan perbedaan-perbedaan ini di Java adalah pernyataan if:
```java
if (/*boolean expression*/) {/*block statement*/}
```
Deskripsi ini memperkenalkan notasi formal yang dikenal sebagai templat yang kadang-kadang kita gunakan untuk menentukan format konstruksi Java. Kita masukkan ke dalam tanda kurung siku (< >) sebuah konstruksi yang telah kita definisikan, untuk menunjukkan bahwa kita dapat menggunakan instance apa pun dari konstruksi tersebut jika ditentukan. Dalam hal ini, <ekspresi boolean> mewakili sebuah
ekspresi yang memiliki nilai boolean, seperti yang melibatkan operasi perbandingan, dan < pernyataan blok> mewakili urutan pernyataan Java. Definisi formal dari <ekspresi boolean> dan <pernyataan blok> dapat dibuat, namun kami tidak akan membahasnya secara mendetail. Arti dari pernyataan if sudah cukup jelas: pernyataan dalam blok harus dieksekusi jika dan hanya jika ekspresi boolean benar. Pernyataan if-else:
```java
if (/*boolean expression*/) {/*block statement*/}
else {/*block statement*/}
```
memungkinkan untuk memilih antara dua blok pernyataan alternatif.

Loops. Banyak perhitungan yang pada dasarnya bersifat berulang. Konstruksi dasar Java untuk menangani komputasi tersebut memiliki format berikut:
```java
while (/*boolean expresion*/) {/*block statement*/}
```

Pernyataan while mempunyai bentuk yang sama dengan pernyataan if (satu-satunya perbedaan adalah penggunaan kata kunci while dan bukan if), namun maknanya cukup berbeda. Ini adalah instruksi kepada komputer untuk berperilaku sebagai berikut: jika ekspresi boolean salah, jangan lakukan apa pun; jika ekspresi boolean benar, jalankan rangkaian pernyataan di
blok (sama seperti if) tetapi kemudian periksa kembali ekspresi boolean, jalankan kembali urutan pernyataan di blok jika ekspresi boolean benar, dan lanjutkan selama ekspresi boolean benar. Kami merujuk pada pernyataan di blok dalam satu perulangan sebagai badan perulangan.