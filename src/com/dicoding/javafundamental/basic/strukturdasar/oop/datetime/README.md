# DateTime

Java menyediakan beberapa kelas untuk menangani DateTime. Kelas-kelas ini menangani segala yang berhubungan dengan
tanggal dan waktu. Pada materi ini kita akan belajar bagaimana menggunakan, menentukan, merubah serta menampilkan dengan
format waktu belahan dunia yang diinginkan.

Berikut kelas yang sering digunakan untuk mendukung pengelolaan DateTime

1. System.currentTimeMillis() // Method yang mengembalikan waktu sekarang dalam millisecond
2. java.util.Date // Kelas yang mewakili tanggal dan waktu.
3. java.util.Calendar // Kelas yang memiliki spesifik method untuk mengkonversi waktu dan tanggal
4. java.text.SimpleDateFormat // Kelas yang membantu menterjemahkan format waktu dalam bentuk String ke format date time
   serta sebaliknya

# CurrentTimeMillis

Merupakan method bagian dari kelas System yang menampilkan waktu sekarang dalam satuan milisecond (1000 milisecond = 1
second). CurrentTimeMillis() mengembalikan jumlah waktu mulai dari 1-1-1970 sampai dengan waktu yang sekarang.
System.currentTimeMillis() biasanya digunakan untuk mengukur suatu waktu yang dibutuhkan dengan lebih spesifik. Ia biasa
juga dipakai untuk tambahan sebagai variabel unik.

# Date

Merupakan kelas tertua yang menangani Waktu dan Tanggal. Dalam penggunaannya sekarang sudah banyak method yang sudah
deprecated karena adanya java.util.Calendar. Kelas Calendar memiliki kemampuan penanganan waktu dan tanggal yang lebih
baik. Tetapi jangan kuatir, masih ada beberapa kebutuhan kode yang bisa diselesaikan dengan menggunakan Date.

# Calendar

Kelas dari grup bagian dari Java.util yang menggantikan fungsi date untuk mengkonversi data tanggal dan waktu secara
instan. Kelas Calendar ini memiliki banyak fungsi untuk parsing dan manipulasi tanggal. Berikut hal penting yang perlu
diperhatikan tentang mengapa kita menggunakan kelas Calendar ini:

1. Kelas ini menyediakan ruang dan method untuk mengimplementasikan sistem kalendar yang berada di luar dari bagian java
   util Calendar
2. Kelas ini juga dapat menentukan dan mengukur waktu sesuai yang diinginkan

Calendar memiliki banyak sekali method yang mempermudah untuk mengelola waktu dan tanggal. Contoh di bawah ini
memperlihatkan bagaimana Anda dapat mengambil waktu / tanggal spesifik yang dinginkan untuk diolah. Misalnya Anda hanya
ingin menampilkan tahun, bulan atau hari saja.

Calendar memiliki kemampuan untuk menampilkan waktu/tanggal secara spesifik. Method get(Calendar.DATE) milik Calendar
membutuhkan parameter untuk penggunaannya. Seluruh field dapat Anda cek
di https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html.

Salah satu metode yang juga tersedia pada Calendar adalah add() yang memiliki 2 parameter yaitu calendar field dan
banyaknya waktu yang ingin ditambahkan. Seperti pada kode di atas untuk melihat waktu 15 hari yang lalu, kita bisa
gunakan calendar.add(Calendar.DATE, -15) di mana -15 adalah 15 hari yang lalu dari waktu saat ini. Begitu juga untuk
waktu bulan dan tahun.

# SimpleDateFormat

Dalam menampilkan suatu tanggal dan waktu, biasanya format tampilan di setiap kebutuhan akan berbeda-beda. Kalau hanya
untuk sekedar menampilkan waktu dan tanggal , kita dapat menggunakan date atau calendar.

Bagaimana bila menampilkan format yang tidak biasa? Atau Anda ingin parsing data dari sebuah String waktu dan tanggal
dengan format yang tidak biasa? Di sini SimpleDateFormat memang berfokus pada memformat dan parsing data tanggal dan
waktu serta normalisasi waktu.

