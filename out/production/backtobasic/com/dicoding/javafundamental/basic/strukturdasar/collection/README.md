- Perhatikan panel Hierarchy. Ada banyak subtype atau turunan dari interface Collection. Masih ingat dengan materi
  inheritance kan? Fitur Type Hierarchy di IntelliJ sangat membantu programmer untuk melihat struktur atau hierarki
  inheritance dari interface atau class. Selain itu ada fitur Method Hierarchy untuk melihat struktur inheritance dari
  method dan Call Hierarchy yang fungsinya untuk melihat di mana saja suatu method dipanggil (invoked).
- Di panel Hierarchy terlihat interface Collection mempunyai turunan, salah satunya List dan Set sesuai dengan gambar
  Core Collection Interface di atas.

OK mari kita bahas satu per satu dari ketiga interface yang sering digunakan yaitu List, Set, dan Map.

# List

List adalah suatu Collection di mana data yang masuk akan disimpan secara teratur. List mempunyai index berdasarkan
urutan objek yang dimasukkan ke dalam List. Objek di dalam List bisa duplikat artinya objek yang sama bisa dimasukkan
beberapa kali ke dalam List dan akan mempunyai index yang berbeda. Objek dikatakan sama jika dibandingkan menggunakan
method equals() menghasilkan nilai true. Hal ini akan berbeda dengan Set yang akan kita bahas berikutnya. Salah satu
implementasi dari interface List adalah class ArrayList. ArrayList mirip dengan Array hanya saja ArrayList ukurannya
tidak tetap atau fleksibel.

# Set

Set mirip dengan List hanya saja objek di dalam Set tidak bisa diduplikasi. Yang artinya jika objek yang sama dimasukkan
beberapa kali ke dalam Set maka Set hanya akan menyimpan objek tersebut satu kali saja. Coba ingat kembali materi
Inheritance bagian Overriding dan Overloading. Perbedaan lain antara Set dengan List adalah penyimpanan pada Set tidak
teratur.

# Map

Map adalah struktur data dalam bentuk pasangan key-value. Map sama dengan “associative array “ dalam bahasa PHP. Objek
disimpan di Map sebagai value menggunakan key yang harus unik dan harus berupa objek juga. Salah satu implementasi dari
interface Map adalah class HashMap.

Pada dasarnya Collection adalah struktur data. Makin kompleks struktur datanya maka akan dibutuhkan implementasi
Collection yang lebih kompleks lagi. Pada materi ini kita hanya membahas Collection yang sudah ada di JDK tanpa
menambahkan library apapun. Di luar sana ada banyak library Collection untuk keperluan yang kompleks misal Apache Common
Collection dan Google Collection (sekarang menjadi bagian dari Guava).

Baca beberapa tautan di bawah ini untuk menambah pengetahuan Anda.

- https://commons.apache.org/proper/commons-collections/
- https://code.google.com/archive/p/google-collections/
- https://github.com/google/guava