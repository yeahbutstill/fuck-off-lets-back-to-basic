Date, Calendar, DateFormat

Bekerja dengan tanggal bukan pekerjaan yang mudah, terkadang kita perlu melakukan
perhitungan berdasarkan tanggal yang cukup rumit, misalnya mendapatkan hari terakhir dari
bulan tertentu atau mendapatkan selisih hari antara dua tanggal, atau bahkan bekerja dengan
calendar selain Masehi, misalnya penanggalan Budha. Java menyediakan class-class yang bisa
digunakan untuk tujuan tersebut, sehingga tidak perlu membuat kode untuk melakukan hal
tersebut secara manual.

Class Date adalah representasi dari waktu di Java, class ini terdapat dua jenis: java.util.Date
dan java.sql.Date. Class java.util.Date adalah class yang sering digunakan dalam perhitungan
tanggal, sedangkan java.sql.Date adalah representasi data tanggal di java yang setara dengan
tipe data date di dalam database. Kalau tidak bekerja dengan database, sebaiknya selalu
gunakan java.util.Date, sedangkan java.sql.Date hanya digunakan ketika kita bekerja dengan
database. Istilah class Date di dalam bab ini merujuk ke java.util.Date.

Class Date digunakan sebagai object untuk menyimpan waktu saja, hal ini terutama karena class
Date mengimplementasikan interface Serializable, plus semua fungsi untuk perhitungan sudah
ditandai deprecated.Sedangkan class Calendar digunakan layaknya kalkulator untuk proses
perhitungan tanggal pada class Date, misalnya kita ingin menambahkan 1 hari, menambah 1
menit dan seterusnya.

Calendar juga menyediakan sistem penanggalan Masehi
(GregorianCalendar), penanggalan Budha dengan bahas Thailand dan penanggalan Jepang.

DateFormat adalah class yang digunakan untuk memformat tanggal menjadi string. Class
turunan dari DateFormat yang sering digunakan adalah SimpleDateFormat. Class
SimpleDateFormat bisa digunakan untuk mengubah string menjadi tanggal dan sebaliknya dari
tanggal menjadi String. Class ini sebaiknya dibuat setiap kali akan digunakan, hal ini
dikarenakan class SimpleDateFormat tidak thread-safe, artinya kalau diinstansiasi sekali dan
digunakan dalam lingkungan multithreading maka hasilnya tidak konsisten.

![img_1.png](img_1.png)

![img_3.png](img_3.png)


Chronology adalah jantung dari Joda Time, semua perhitungan instant, periode dan durasi
didasarkan pada jenis penanggalan yang digunakan. Joda Time secara default menyediakan
beberapa sistem penanggalan, antara lain :

- Gregorian : standard penanggalan masehi yang dimulai pada 15 september 1582,
penanggalan ini mendefnisikan bahwa tahun kabisat hanya terjadi pada tahun yang habis
dibagi 4, tidak habis dibagi 100 dan habis dibagi 400. Misalnya tahun 2008 adalah kabisat
karena habis dibagi 4, tahun 2100 bukan kabisat karena walaupun habis dibagi 4 juga
habis dibagi 100. Tahun 2000 adalah kabisat karena habis dibagi 4, walaupun habis dibagi
100 tetapi habis dibagi 400. 
- Julian :
standard penanggalan masehi yang sebelum tanggal 15 september 1582.
Penanggalan ini mendefnisikan bahwa setiap tahun yang habis dibagi 4 adalah tahun
kabisat. 
- ISO8601 : standard penanggalan yang menggunakan sistem Gregorian plus standarisasi
format penulisan tanggal. Joda Time secara default menggunakan ISO8601 sebagai default
chronology 
- GJ : penanggalan yang menggabungkan Julian dan Gregorian. Sebelum tanggal 15
September 1582 sistem penanggalan yang digunakan adalah Julian dan setelahnya adalah
Gregorian. 
- Penanggalan lain yang spesifk : Buddhist, Coptic, Ethiopic


Sampai di sini kita sudah belajar secara umum tentang konsep waktu dalam Joda Time beserta
implementasinya, nah kita akan membahas lagi sedikit tentang bagaimana Joda Time
menyederhanakan kode perhitungan tanggal yang dibuat dengan class dari JDK.

