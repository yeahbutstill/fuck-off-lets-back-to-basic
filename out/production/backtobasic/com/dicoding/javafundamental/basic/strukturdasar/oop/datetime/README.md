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

