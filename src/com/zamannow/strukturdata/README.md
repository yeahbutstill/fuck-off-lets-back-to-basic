# Pengenalan Collection

- Collection adalah hal umum yang biasa dimiliki di bahasa pemrograman, seperti PHP, Python, Rust dan lain-lain
- Collection atau kadang disebut container, adalah object yang mengumpulkan atau berisikan data-data, mirip seperti
  Array
- Java telah menyediakan class-class collection yang sudah bisa langsung kita gunakan, tanpa tambahan library
- Semua class-class collection di Java adalah generic class, sehingga kita bisa menggunakan Java collection dengan data
  apapun

# Java Collection

- Java collection telah menyediakan semuanya yang berhubungan dengan collection, sehingga kita hanya cukup
  menggunakannya
- Interface, ini adalah contract representasi dari collection. Semua collection di Java memiliki kontrak interface,
  sehingga jika kita mau, kita juga bisa membuat implementasinya sendiri
- Implementations, tidak perlu khawatir, kita juga bisa menggunakan implementasi yang sudah dibuatkan oleh Java, semua
  interface collection sudah ada implementasi class nya di Java collection
- Alogoritma, Java sudah myediakan algoritma-algoritma yang umum digunakan di collection, seperti pencarian dan
  pengurutan data collection

# Java Collection Interface

- ada 2 group
- ![Screenshot from 2023-11-24 10-19-14.png](Screenshot%20from%202023-11-24%2010-19-14.png)

# Iterable Interface

- Iterable adalah parent untuk semua collection di Java, Kecuali Map class
- Iterable sediri sangat sederhana, hanya digunakan agar mendukung for-each-loop
- Karena semua collection pasti implement iterable, secara otomatis maka semua collection di Java mendukung perulangan
  for-each, jadi bukan cuman Array

# Iterator Interface

- Tidak ada magic di Java, sebenernya for-each di iterable bisa terjadi karena ada method iterator() yang mengembalikan
  object Iterator
- Iterator adalah interface yang mendefinisikan cara kita melakukan megakses element di collection secara sequential
- For-each sendiri muncul sejak Java 5, sebelum Java 5 untuk melakukan iterasi collection, biasanya dilakukan manual
  menggunakan Iterator object

# Collection Interface

- Selain ada Iterable interface, parent class semua collection di Java adalah Collection
- Kalau Iterable interface digunakan sebagai kontrak untuk meng-iterasi data secara sequential
- Collection merupakan kontrak untuk manipulasi data collection, seperti menambah, menghapus dan mengecek isi data
  collection
- Tidak ada direct implementasi untuk Collection, karena collection nanti akan dibagi lagi menjadi List, Set, dan Queue

