Kemampuan menggunakan collection adalah wajib dimiliki oleh developer Java. Tanpa
kemampuan menggunakan collection, membuat aplikasi yang mengolah data menjadi cukup
sulit. Collection diajarkan dalam kurikulum ilmu komputer dalam kuliah struktur data, karena
collection sendiri adalah sebuah struktur data. Kita bisa menyimpan data dengan dalam
collection, struktur penyimpanan datanya bisa dipilih dari beberapa jenis collection yang sudah
disiapkan oleh Java.

Generics banyak digunakan dalam library collections, dengan menggunakan generics kita bisa
menentukan tipe dari isi collections. Kika akan membahas tentang List, Set dan Map, tetapi
sebelum itu kita akan membahas bagaimana menentukan dua buah object sama atau berbeda
dengan cara mengoverride method equals dan hashCode. Bagian terakhir kita akan membahas
tentang bagaimana melakukan sorting terhadap collection agar isinya terurut.

toString

Setiap class selalu extends class Object, class Object
memiliki tujuh buah method, setiap method mempunyai tujuan tertentu. Method-method tersebut adalah :
- wait()
- notify()
- notifyAll()
- fnalize()
- toString()
- equals()
- hashCode()

Method toString digunakan oleh Java untuk mendapatkan representasi String dari sebuah object
atau class. Implementasi default dari Class object adalah mencetak nama class diikuti oleh
“alamat memory dari object tersebut”.

method toString banyak digunakan dalam aplikasi Java, salah satunya adalah menampilkan text di
dalam komponen JcomboBox kalau item yang dimasukkan ke dalam JcomboBox adalah class yang
kita buat sendiri, bukan tipe data primitif atau class wrapper.


equals dan hashcode
Method equals dan hashCode berperan sangat penting dalam collection. Method equals
digunakan untuk membandingkan antara dua buah object apakah sama atau tidak secara logis.
Operator == (sama dengan 2x) bisa digunakan untuk membandingkan dua buah object, 
tetapi perbandingan inihanya akan menghasilkan true kalau dua buah object apakah berada dalam memory yang
sama, atau bisa dikatakan dua buah object ini mempunyai reference yang sama persis. Kalau
operator == mengembalikan nilai true berarti dua buah object ini adalah sama persis baik
secara alamat memory dan otomatis sama secara logis.

Method equals akan mengembalikan true kalau kedua object sama secara logis walaupun
kedua object mempunyai reference berbeda (tidak berada di memory yang sama). Kita ambil
contoh sebuah String, dua buah object string akan mengembalikan false jika dioperasikan
dengan operator == walaupun string yang ada di dalamnya sama. Tetapi method equals akan
mengembalikan nilai true walaupun objectnya berada di memory berbeda asalkan nilai
stringnya sama.

Terlihat mengoverride method equals bukan pekerjaan yang gampang, cukup banyak kode yang
harus diketik, nantinya menggunakan NetBeans proses pembuatan method equals bisa digenerate
secara otomatis, sehingga meminimalisasi kode yang harus diketik manual.

Method hashCode akan mengembalikan nilai integer unik untuk setiap object yang berbeda.
Aturanya adalah :
- Method hashCode dari sebuah object harus mengembalikan nilai yang sama walaupun
dieksekusi berkali kali selama nilai property dalam object tidak berubah.
- Kalau dua buah object dioperasikan dengan method equals mengembalikan nilai true maka
method hashCode dari kedua object harus mengembalikan nilai integer yang sama.
Sebaliknya, kalau dua buah object mengembalikan nilai false maka hashCode untuk kedua
object akan mengembalikan nilai integer yang berbeda.
- Kalau dua buah object dioperasikan dengan method equals mengembalikan nilai false maka
method hashCode tidak harus mengembalikan nilai yang berbeda. Mengembalikan nilai yang
sama pun tidak masalah.

Topik bagaimana menghitung nilai hashCode yang baik bisa menjadi topik PhD, tetapi tidak perlu
bingung, menggunakan NetBeans kita bisa mengenerate method hashCode ini agar mematuhi
aturan di atas.


Sorting

Sorting adalah cara untuk membuat sebuah collection terurut (sorted). Agar collection terurut
kita perlu membuat item yang akan dimasukkan ke dalam Set mengimplementasikan interface
Comparable. Interface ini digunakan untuk melakukan perbandingan antara dua buah object,
mana yang lebih besar atau lebih kecil atau kah sama persis.

Interface Comparable hanya mempunyai satu buah method, yaitu compareTo: method ini
mempunyai sebuah parameter yang bertipe Object kalau tidak menggunakan generics, dan
bertipe sama dengan class yang mengimplement interface Comparable kalau menggunakan
generics. Method compareTo mengembalikan integer, nilai kembalianya positif berarti object yang
dipanggil method comparenya lebih besar dari object yang dimasukkan ke parameter, nilai
kembalianya negatif berarti sebaliknya dan kalau nilainya nol berarti kedua object sama besar.
Kita lihat contoh implementasi interface Comparable di class Customer. Pertama, kita akan
mengimplementasikan interface Comparable tanpa menggunakan generics :

Kalau menggunakan generics maka method compareTo tipe parameternya adalah Customer,

