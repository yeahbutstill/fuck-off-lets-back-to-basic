# Q&A

### Q: What is Java bytecode?

Versi tingkat rendah dari program Anda yang berjalan di mesin virtual Java. Tingkat abstraksi ini memudahkan pengembang
Java untuk memastikan bahwa program kami berjalan di berbagai perangkat.

### Q: Tampaknya salah jika Java membiarkan int meluap dan memberikan nilai yang buruk. Bukankah seharusnya Java secara otomatis memeriksa overflow?

Masalah ini merupakan salah satu perdebatan di kalangan programmer. Jawaban singkatnya adalah kurangnya pemeriksaan
tersebut adalah salah satu alasan tipe data tersebut disebut tipe data primitif. Sedikit pengetahuan dapat membantu
menghindari masalah seperti itu. Kami menggunakan tipe int untuk angka kecil (kurang dari sepuluh digit desimal), dan
tipe panjang ketika nilainya mencapai miliaran atau lebih.

### Q: What is the value of Math.abs(-2147483648)?

-2147483648. Hasil yang aneh (tapi nyata) ini adalah contoh umum dari efek integer overflow.

### Q: How can I initialize a double variable to infinity?

Java memiliki konstanta bawaan yang tersedia untuk tujuan ini: Double.POSITIVE_INFINITY
dan Double.NEGATIVE_INFINITY.

### Q: Can you compare a double to an int?

Bukan tanpa melakukan konversi tipe, tapi ingat bahwa Java biasanya melakukan konversi tipe yang diperlukan secara
otomatis. Misalnya, jika x adalah int dengan nilai 3, maka ekspresi (x < 3.1) is true, Java mengonversi x menjadi
double (karena 3.1 adalah literal ganda) sebelum melakukan perbandingan.

### Q: What happens if I use a variable before initializing it to a value?

Java akan melaporkan kesalahan waktu kompilasi jika ada jalur apa pun melalui kode Anda yang akan menyebabkan penggunaan
variabel yang tidak diinisialisasi

### Q: What are the values of 1/0 and 1.0/0.0 as Java expressions?

Yang pertama menghasilkan pengecualian runtime untuk pembagian dengan nol (yang menghentikan program Anda karena
nilainya tidak ditentukan); yang kedua memiliki nilai Infinity.

### Q. Can you use < and > to compare String variables?

Tidak. Operator tersebut hanya didefinisikan untuk tipe primitif. Lihat halaman 80

### Q. What is the result of division and remainder for negative integers?

Hasil bagi a/b dibulatkan menuju 0; sisanya a % b didefinisikan sedemikian rupa sehingga (a / b) * b + a % b selalu sama
dengan a. Misalnya, -14/3 dan 14/-3 keduanya -4, tapi
-14 % 3 adalah -2 dan 14 % -3 adalah 2.

### Q. Why do we say (a && b) and not (a & b)?

Operator &, |, dan ^ adalah operasi logika bitwise untuk tipe integer yang melakukan dan, atau, dan eksklusif atau (
masing-masing) pada setiap posisi bit. Jadi nilai 10&6 adalah 14 dan nilai 10^6 adalah 12. Kami jarang menggunakan
operator ini (tetapi kadang-kadang) dalam buku ini. Operator && dan || hanya valid dalam ekspresi boolean disertakan
secara terpisah karena hubungan arus pendek: ekspresi dievaluasi dari kiri ke kanan dan evaluasi berhenti ketika
nilainya diketahui

### Q. Is ambiguity in nested if statements a problem?

```text
Yes. In Java, when you write
if <expr1> if <expr2> <stmntA> else <stmntB>
it is equivalent to
if <expr1> { if <expr2> <stmntA> else <stmntB> }
even if you might have been thinking
if <expr1> { if <expr2> <stmntA> } else <stmntB>
```

Menggunakan kurung kurawal yang eksplisit adalah cara yang baik untuk menghindari jebakan lain yang menjuntai ini.

### Q. What is the difference between a for loop and its while formulation?

Kode di header perulangan for dianggap berada di blok yang sama dengan badan perulangan for. Dalam perulangan for yang
khas, variabel yang bertambah tidak tersedia untuk digunakan dalam pernyataan selanjutnya; di loop while yang sesuai,
itu benar. Perbedaan ini sering kali menjadi alasan untuk menggunakan perulangan while dan bukan perulangan for.

### Q. Some Java programmers use int a[] instead of int[] a to declare arrays. What’s the difference?

Di Java, keduanya legal dan setara. Yang pertama adalah bagaimana array dideklarasikan dalam C. Yang terakhir adalah
gaya yang disukai di Java karena tipe variabel int[] lebih jelas menunjukkan bahwa itu adalah array bilangan bulat.

### Q. Why do array indices start at 0 instead of 1?

Konvensi ini berasal dari pemrograman bahasa mesin, di mana alamat elemen array akan dihitung dengan menambahkan indeks
ke alamat awal array. Memulai indeks pada 1 akan menyebabkan pemborosan ruang di awal array atau pemborosan waktu untuk
mengurangi 1

### Q. Jika a[] adalah array, mengapa StdOut.println(a) mencetak bilangan bulat heksadesimal, seperti @f62373 , dan bukan elemen array?

Pertanyaan bagus. Itu mencetak alamat memori array, yang sayangnya jarang Anda inginkan.

### Q. Why are we not using the standard Java libraries for input and graphics?

Kami menggunakannya, tapi kami lebih suka bekerja dengan model abstrak yang lebih sederhana. Pustaka Java di balik StdIn
dan StdDraw dibuat untuk pemrograman produksi, dan pustaka serta API-nya agak berat. Untuk mendapatkan gambaran seperti
apa, lihat kode di StdIn.java dan StdDraw.java.

### Q. Dapatkah program saya membaca ulang data dari input standar?

Tidak. Anda hanya mendapat satu kesempatan, sama seperti Anda tidak dapat membatalkan println()

### Q. Apa yang terjadi jika program saya mencoba membaca setelah input standar habis?

Anda akan mendapatkan kesalahan. StdIn.isEmpty() memungkinkan Anda menghindari kesalahan seperti itu dengan memeriksa
apakah ada lebih banyak input yang tersedia

### Q. What does this error message mean? Exception in thread "main" java.lang.NoClassDefFoundError: StdIn

Anda mungkin lupa meletakkan StdIn.java di direktori kerja Anda

### Q. Bisakah metode statis menggunakan metode statis lain sebagai argumen di Java?

Tidak. Pertanyaan bagus, karena banyak bahasa lain yang mendukung kemampuan ini