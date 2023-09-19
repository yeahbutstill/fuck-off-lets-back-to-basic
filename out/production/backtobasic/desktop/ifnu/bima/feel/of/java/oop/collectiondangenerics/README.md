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

