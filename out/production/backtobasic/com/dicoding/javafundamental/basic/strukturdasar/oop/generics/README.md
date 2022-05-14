# Generics

Generics adalah salah satu fitur yang terdapat di JDK 1.5. Ia sangat ditunggu-tunggu. Salah satunya untuk
menyederhanakan penulisan kode dari type-casting juga untuk compile-time type safety. Generics dalam kode program bisa
dikenali dengan type-parameter. Contoh penggunaan Generics paling umum adalah Collection.

Sebelumnya di materi Collection kita sudah menggunakan fitur Generics yaitu ketika kita deklarasi Set<String>, Set
dengan type-parameter <String>. Kita juga deklarasi Map<String, Planet>, Map dengan type-parameter <String, Planet>.
Tetapi untuk List kita deklarasi tanpa type-parameter. Apa perbedaannya? Ayo kita lihat dengan coding!

Perhatikan kode untuk loop masing-masing List. Untuk List lo perlu dilakukan type-casting sedangkan untuk List<Planet>
lp tidak perlu. Dalam kasus ini terlihat penggunaan Generics membuat kode lebih sederhana seperti yang sudah di bahas di
paragraf awal. Dari kode di atas tidak ada compile-error tetapi saat kita jalankan akan terjadi runtime-error. Sebabnya,
dalam List lo ada objek yang tidak bisa di-cast ke Planet.

Suatu saat kode program kita akan menjadi besar, ribuan baris kode! Bayangkan jika kita tidak menggunakan type-parameter
saat deklarasi objek Collection. Lalu objek tersebut digunakan di tempat lainnya, misal dikirim sebagai parameter ke
suatu method. Bisa saja tanpa sadar kita memasukkan tipe objek yang salah dan baru akan ketahuan ketika program
dijalankan. Pusing kan? Nah, gunakan type-parameter. Paling tidak kita akan terbantu karena masalah terdeteksi lebih
dini saat compile.

